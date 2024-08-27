package Day31;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShots {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");    // Define the URL of the target website.
		driver.manage().window().maximize();
		
		// Approach 1). Full page screen shots
		/*TakesScreenshot ts = (TakesScreenshot)driver;    // Type casting
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);   // some where in the memory.
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");   // System.getProperty("user.dir")  -- will return current project location dynamically		
		sourcefile.renameTo(targetfile);  // copy sourcefile to targetfile
		*/
		
		// Approach 2). capture the screenshots of specific section
		/*WebElement featuredproducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile = featuredproducts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\featredproducts.png");   // System.getProperty("user.dir")  -- will return current project location dynamically		
		sourcefile.renameTo(targetfile);
		*/
		
		// 3). capture the screenshot of web element
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile = logo.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");   // System.getProperty("user.dir")  -- will return current project location dynamically		
		sourcefile.renameTo(targetfile);
		
	}

}
