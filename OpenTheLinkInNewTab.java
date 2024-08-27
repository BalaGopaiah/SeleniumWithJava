package Day29;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");    // Define the URL of the target website.
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement registerLink  = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act = new Actions(driver);
		
		// control + Register link
	    act.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).perform();     // Click method from the cations class 
	    Thread.sleep(5000);
	    
	    // Switching to Registration page
		List<String> IDs  = new ArrayList(driver.getWindowHandles());
	   
		// Approach 1:  Registration
	    driver.switchTo().window(IDs.get(1));    // Switch to Registration page
	    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Laptops");
	    
	    // Approach 2:  Registration
	    /*for( String ids:windowids)
	    {
	    	
	     String title = driver.switchTo().window(ids).getTitle();
	     System.out.println(title);
		     if(title.equals("nopCommerce demo store. Register"))
		     {
		    	 driver.switchTo().window(title);
		     }
	  
	    }*/
	    
	    Thread.sleep(5000);
	    
	    // Home page
	    driver.switchTo().window(IDs.get(0));    // Switch to home page
	    boolean nopcommerceimg = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();	    
	    System.out.println( nopcommerceimg == true ? nopcommerceimg : false ); 
	    
	}

}
