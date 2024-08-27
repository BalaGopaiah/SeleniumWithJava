package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
		driver.get("https://testautomationpractice.blogspot.com/");    // Define the URL of the target website.
		driver.manage().window().maximize();
	
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bala");
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		
		// Passing the text into inputbox - alternate of sendkeys()
		JavascriptExecutor js = (JavascriptExecutor)driver;  // Type casting
		//JavascriptExecutor js = driver;
		js.executeScript("arguments[0].setAttribute('value', 'Bala')", name);
		
		// Clicking on element - alternate of click()   ---   buttons/ links/ radio buttons / checkboxe's
	 	WebElement radiobtn  = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript( "arguments[0].click()", radiobtn );
	 	
		
	}

}
