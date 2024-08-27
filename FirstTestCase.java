package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Test Case
 * 1). Launch browser (chrome, Edge)
 * 2). Open URL https://xathon.mettl.com/event/Dare2Code_
 * 3). Validate title should be "Dare2Code"
 * 4). Close browser 
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
		// 1). Launch browser (chrome, Edge)
		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		
		// 2). Open URL http://demo.openchart.com/
		driver.get("https://xathon.mettl.com/event/Dare2Code_");
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// 3). Validate title should be  "Dare2Code"
		//	WebElement submitButton = driver.findElement(By.className("btn btn-primary"));
		//	submitButton.click();
		String title = driver.getTitle();
		if(title.equals("Dare2Code")) {
			System.out.println("Testcase Passed");
		}
		else {
			System.out.println("Testcase Failed");
		}
		
		// 4). Close browser
		System.out.println("Closed the Browser");
		// driver.close();
		// driver.quit();
	}

}
