import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuviSignup {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guvi.in/"); //opens the url link
		
		driver.manage().window().maximize(); //window gets Maximized
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //waits for 15 seconds
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Dkumar");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dkumar123@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dkm@123");
		
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1234567891");
		
		Thread.sleep(2000);
		driver.findElement(By.id("signup-btn")).click();
		
		System.out.println("User is verified successfully");
		
		 //Assert.assertEquals("Your account has been created. Before you continue...", txt);
	      /*  if(txt.equals("Your account has been created. Before you continue..."))
	        {
	        	System.out.println("Registered Successfully");
	        }
	        else {
	        	System.out.println("Registration failed");
	        }
	        */
	        
	        //Tell us about yourself page
	        //after confirming your account fill this form
	     //get the text on the top of the  page
	        String txt1=driver.findElement(By.xpath("//div/h2")).getText();
	        System.out.println(txt1);
	        
	        //using dropdown select your profile
	        WebElement profile=driver.findElement(By.id("profileDrpDwn"));
	        Select myprofile=new Select(profile);
	        myprofile.selectByVisibleText("Looking for a career");
	        
	        //select degree 
	        WebElement degree=driver.findElement(By.id("degreeDrpDwn"));
	        Select mydegree=new Select(degree);
	        mydegree.selectByVisibleText("B.E. / B.Tech. EEE");
	        
	        //select passed year
	        driver.findElement(By.id("year")).sendKeys("2018");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	        driver.findElement(By.id("details-btn")).click();
	        
	      
	    driver.navigate().to("https://www.guvi.in/");
	        
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dnshkmr420@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dkm@123");
		
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		
		String title=driver.getTitle(); 
		
		System.out.println(title);
		
		//driver.close();
}
	

}


//Output
//User is verified successfully
//Sign Up
//GUVI | Login