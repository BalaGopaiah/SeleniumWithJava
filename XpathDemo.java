package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.manage().window().maximize();
		 
		 // Xpath with single attribute
		 // driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		 // driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Admin");
		 // driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("admin123");
		 
		 // Xpath with multiple attributes
		 // driver.findElement(By.xpath("//input[@name='username'][@placeholder='Username']")).sendKeys("Admin");
		 // driver.findElement(By.xpath("//input[@id='inputUsername'][@placeholder='Username']")).sendKeys("Admin");
		 // driver.findElement(By.xpath("//input[@name='inputPassword'][@placeholder='Password']")).sendKeys("admin123");
		 
		 // Xpath with 'and' operator
		 // driver.findElement(By.xpath("//input[@id='inputUsername' and @placeholder='Username']")).sendKeys("Admin");
		 // driver.findElement(By.xpath("//input[@name='inputPassword' and @placeholder='Password']")).sendKeys("admin123");
		 
		 // Xpath with 'or' operator
		 // driver.findElement(By.xpath("//input[@id='inputUsername' or @placeholder='Username']")).sendKeys("Admin");
		 // driver.findElement(By.xpath("//input[@name='inputPassword' and @placeholder='Password']")).sendKeys("admin123");
		 
		 // Xpath with text()
		 // driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		 
		 /*
		 boolean status = driver.findElement(By.xpath("//a[text()='Forgot your password?']")).isDisplayed();
		 System.out.println(status);
		 
		 String StatusValue = driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getText();
		 System.out.println(StatusValue);
		 */
		 
		 // Xpath with Contains()
		 // driver.findElement(By.xpath("//input[contains(@placeholder,'Use')]")).sendKeys("Admin");
		 
		 // Xpath with Contains()
		 // driver.findElement(By.xpath("//input[starts-with(@placeholder,'Use')]")).sendKeys("Admin");
		 
		 // Chained Xpath
		 boolean ImageStatus = driver.findElement(By.xpath("//div[@className='orangehrm-login-branding']/img")).isDisplayed();
		 System.out.println(ImageStatus);
		 
		 String StatusValue = driver.findElement(By.xpath("//div[@className='orangehrm-login-branding']/img")).getText();
		 System.out.println(StatusValue);
		 
	}

}
