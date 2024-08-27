package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// isDisplayed() - check that element is displayed or not
	 	//WebElement imagestatus = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	 	//System.out.println(imagestatus.isDisplayed());
	 	           // or Both are same
		// boolean displaystatus = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	 	// System.out.println(displaystatus);
		
		// idEnabled() - input boxe's, Drop downs, Radio buttons and check boxe's 
		// boolean enabledstatus = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		// System.out.println("Enabled status:" + enabledstatus);
	 	
		// isSelected() - Used for Radio buttons and checkboxe's
		// WebElement malestatus = driver.findElement(By.xpath("//input[@id='gender-male']"));
	 	// System.out.println(malestatus.isSelected());
	 	
	 	// WebElement femalestatus = driver.findElement(By.xpath("//input[@id='gender-female']"));
	 	// System.out.println(femalestatus.isSelected());
	 	
	 	// malestatus.click();
	 	// System.out.println("After selected on male:" + malestatus.isSelected());
	 	// System.out.println("After selected on female:" + femalestatus.isSelected());
	 	
	 	// femalestatus.click();
	 	// System.out.println("After selected on male:" + malestatus.isSelected());
	 	// System.out.println("After selected on female:" + femalestatus.isSelected());
	 	
	 	driver.quit();
	}

}
