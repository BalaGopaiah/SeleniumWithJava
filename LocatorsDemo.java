package Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		// name RahulSetty site
		// driver.findElement(By.id("inputUsername")).sendKeys("Admin");
		// driver.findElement(By.name("inputPassword")).sendKeys("admin123");
		// driver.findElement(By.id("chkboxOne")).click();
		// driver.findElement(By.id("chkboxTwo")).click();
		// driver.findElement(By.linkText("Forgot your password?")).click();
		// driver.findElement(By.partialLinkText("Forgot")).click();
				
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		// driver.navigate().refresh();
				
		// driver.findElement(By.cssSelector("button[class=\"submit signInBtn\"]")).click();
		// name Orange site
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.className("button[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		
		System.out.println("Closed the Browser");
		
	}

}
