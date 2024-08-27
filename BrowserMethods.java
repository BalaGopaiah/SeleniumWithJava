package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://xathon.mettl.com/event/Dare2Code_");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// click Visit Us button
		driver.findElement(By.xpath("//button[normalize-space()='Blogs']")).click();
		
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
	}

}
