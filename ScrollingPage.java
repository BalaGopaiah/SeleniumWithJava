package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://demo.nopcommerce.com/");    // Define the URL of the target website.
		driver.manage().window().maximize();
	
		// Create a variable of java script executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 1). Scroll down page by Pixel number
		// js.executeScript("window.scrollBy(0, 600)", "");
		// System.out.println(js.executeScript("return window.pageYOffset;"));  // How many pixels have written
		
	    // 2). Scroll the page till element is visible
		//WebElement news = driver.findElement(By.xpath("//strong[normalize-space()='News']"));
		//js.executeScript("arguments[0].scrollIntoView()", news);
		//System.out.println(js.executeScript("return window.pageYOffset;"));   // 2426
		
		// 3). Scroll page till end of the page/document
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));  // 2426
		
		Thread.sleep(5000);
		
		// Scrolling up to initial position
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		
	}

}
