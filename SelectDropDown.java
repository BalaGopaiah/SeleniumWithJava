package Day16;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement countries = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select countryOptions = new Select(countries);
	    Thread.sleep(5000);
		
		// Select option from the drop down
		// countryOptions.selectByVisibleText("India");
		// countryOptions.selectByValue("japan");
	    // countryOptions.selectByIndex(2);
	    
	    
	    // Capture the options from the dropdown
	    List<WebElement> options = countryOptions.getOptions();
	    System.out.println("Total number of options:" + options.size());
	    
	    // Printing the options
	    for(WebElement option:options) {               // Enhanced for loop
	    	System.out.println(option.getText());      // Return the particular web element from that list collection.  
	    }
	    
	    
	}

}
