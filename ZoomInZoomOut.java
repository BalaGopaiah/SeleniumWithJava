package Day30;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://demo.nopcommerce.com/");    // Define the URL of the target website.
		// Thread.sleep(5000);
		// driver.manage().window().minimize();
		// Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// Create a variable of java script executor using Type casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom='30%'");   // Set the zoom level 30%
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='50%'");   // Set the zoom level 50%
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='80%'");   // Set the zoom level 80%
	}

}
