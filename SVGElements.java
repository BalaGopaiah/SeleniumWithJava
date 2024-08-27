package Day98;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
		// absolute xpath - not working
		// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/svg")).click();
		
		// Relative xpath using text - working fine
		// driver.findElement(By.xpath("//a[normalize-space()='Time']")).click();
		
		// identify SVG Element
		// driver.findElement(By.xpath("//a[@class='old-main-menu-item active']//*[name()='svg']")).click();
		
		driver.findElement(By.xpath("//button[@title='Timesheets']//*[name()='svg']")).click();
		
		
	}

}
