package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");    // Define the URL of the target website.
		driver.manage().window().maximize();
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		field1.clear();  // clears field1
		field1.sendKeys("Bala Gopaiah");
		
		Thread.sleep(5000);
		
		//Instantiating Actions class and double click action on button
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		String f2data = field2.getAttribute("value");    // Captureing the value of the field with value attribute
		//System.out.println(f2data);
		if(f2data.equals("Bala Gopaiah"))
		{
			System.out.println("Field2 value is matched with Field1 value");
		}
		else
		{
			System.out.println("Field2 value didn't match with Field1 value");
		}
		
	}

}
