package Task_11;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WindowFrameworkP2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		
		int  topframe=driver.findElements(By.tagName("frame")).size();
	     System.out.println("The top frame size is "+topframe);
	     
	     
	     
	   WebElement leftframe=driver.findElement(By.cssSelector("frame[name='frame-left']"));
	   driver.switchTo().frame(leftframe);
	   
	   String lefttxt =driver.findElement(By.tagName("body")).getText();
	    System.out.println("The left frame is  "+lefttxt);
	   
	     Assert.assertEquals("LEFT", lefttxt);
	     
	     driver.switchTo().parentFrame();
	     
	     
	     
	     WebElement middleframe=driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		   driver.switchTo().frame(middleframe);
	
		    String middletxt =driver.findElement(By.tagName("body")).getText();
		    System.out.println("The middle frame is  "+middletxt);
		    
		    
		     Assert.assertEquals("MIDDLE", middletxt);
		     
		     driver.switchTo().parentFrame();
		     
		    
		     
		     WebElement rightframe=driver.findElement(By.cssSelector("frame[name='frame-right']"));
			   driver.switchTo().frame(rightframe);
			   
			    String righttxt =driver.findElement(By.tagName("body")).getText();
			    System.out.println("The right frame is  "+righttxt);
			    
			    
			     Assert.assertEquals("RIGHT", righttxt);
			
			     driver.switchTo().defaultContent();
	
			 	
		
				
			WebElement bottomframe=driver.findElement(By.cssSelector("frame[name='frame-bottom']"));   
			driver.switchTo().frame(bottomframe);
			
		    String bottomtxt =driver.findElement(By.tagName("body")).getText();
		    System.out.println("The bottom frame is  "+bottomtxt);
		    
		   
		     Assert.assertEquals("BOTTOM", bottomtxt);
		
		     driver.switchTo().defaultContent(); 
	}

}
