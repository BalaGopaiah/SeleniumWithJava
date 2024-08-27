package Day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");    // Define the URL of the target website.
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions act = new Actions(driver); 
		
		// Minimum Slider 
		WebElement min_slider = driver.findElement(By.xpath("//div[@class=\"price-range-block\"]//span[1]"));
		System.out.println("Location of the minimum slider:" +min_slider.getLocation());     // (59, 250)		
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("Location of the min slider after moving:" +min_slider.getLocation());   // (161, 250)		
		
		Thread.sleep(3000);
		
		// Maximum Slider
		WebElement max_slider = driver.findElement(By.xpath("//div[@class=\"price-range-block\"]//span[2]"));
		System.out.println("Location of the maximum slider:" +max_slider.getLocation());       //   (544, 250)      		
		act.dragAndDropBy(max_slider, -200, 250).perform();
		System.out.println("Location of the max slider after moving:" +max_slider.getLocation());   // (345, 250)	
		
	}

}
