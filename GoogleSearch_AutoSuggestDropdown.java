package Day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");   // Search box
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role=\"option\"]"));
	    System.out.println(list.size());
	    
	    for(WebElement listdata :list) {
	    // System.out.println(listdata.getText());
	     String ld = listdata.getText();
	     if(ld.equals("selenium")) {
	    	 listdata.click();
	    	 break;
	     }
	    }
		
	}

}
