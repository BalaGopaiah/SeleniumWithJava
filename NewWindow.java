package Day29;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewWindow {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");    // Define the URL of the target website.		
		 
		// Selenium 4.x
		//driver.switchTo().newWindow(WindowType.TAB);   // opens new tab
		driver.switchTo().newWindow(WindowType.WINDOW);  // Opens new window
		driver.get("https://orangehrm.com/");
			    
	    /*
	    for( String allids:ids)
	    {
	    	String titles = driver.switchTo().window(allids).getTitle();
	        if(titles.equals("Human Resources Management Software | OrangeHRM"))
	        {
              System.out.println(titles);	        	
	        }
	        else
	        {
	        	System.out.println(titles);
	        }
	    	
	    	
	    }
		*/
		
	}

}
