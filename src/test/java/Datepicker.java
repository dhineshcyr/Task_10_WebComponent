

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

	      
	        WebElement datePicker = driver.findElement(By.id("datepicker"));
	        datePicker.click();
	        
	        WebElement nextButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
	        nextButton.click();
	        WebElement date = driver.findElement(By.cssSelector("a[data-date='26']"));
	        date.click();
	        
	        Thread.sleep(2000);
		driver.close();
	}

}

//Outout
//The page title is Datepicker - 05/26/2025