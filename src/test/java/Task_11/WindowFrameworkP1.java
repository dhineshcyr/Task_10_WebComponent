package Task_11;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowFrameworkP1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/windows");
	
		driver.manage().window().maximize();
	
		String ParentWindow= driver.getWindowHandle();
		System.out.println("Parent window "+ ParentWindow);
		
		
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
	
		Set <String> WindowHandles=driver.getWindowHandles();
		System.out.println("All window "+ WindowHandles);
		
	  for(String child : WindowHandles) {
		  if(!child.equals(ParentWindow)) {
			  driver.switchTo().window(child);
			  System.out.println("The child window url "+driver.getCurrentUrl());
		  }
	  
		
	  }
	  
	  String msg=	driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
	  Assert.assertEquals("New Window",msg);
	  if(msg.equals("New Window")) {
		System.out.println("successfully opened new window");
	  }
	   else
	   {
		System.out.println("The window not opened");
	 }
	
	   
	    driver.close();	
	   
	    driver.switchTo().window(ParentWindow);
	  
	     String maintxt=driver.findElement(By.xpath("//div/h3")).getText();
             if(maintxt.equals("Opening a new window")) {
	     System.out.println("The parent window is active");
         }
          else
        {
	        System.out.println("The parent window is not visible");
         }
	      driver.quit();
	}
				
		
	}


