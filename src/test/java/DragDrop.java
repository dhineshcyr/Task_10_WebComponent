
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;


public class DragDrop {

	public static void main(String[] args) {
		 
		WebDriver  driver=new ChromeDriver();
	
		driver.get("https://jqueryui.com/droppable/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		

	    System.out.println(driver.getTitle());
	    
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		
		WebElement drop=driver.findElement(By.id("droppable"));
	
		
		Actions obj=new Actions(driver);
		obj.dragAndDrop(drag,drop).build().perform();
		
		
		String msg=drop.getText();
		System.out.println(msg);
		Assert.assertEquals("Dropped!", msg);
		
		WebElement ele = driver.findElement(By.id("droppable"));
		
		String col=ele.getCssValue("background-color");
		System.out.println(col);
		
		String hex=Color.fromString(col).asHex();
		System.out.println(hex);
		Assert.assertEquals(hex,"#fffa90");
		//verified of drag and drop using background color
    if(hex.equalsIgnoreCase("#fffa90")) {
    	  System.out.println("dropped suceessfully");
      }
      else
      {
    	  System.out.println("error");
      }
	}


}

//output
//Droppable | jQuery UI
//Dropped!
//rgba(255, 250, 144, 1)
//#fffa90
//dropped suceessfully
