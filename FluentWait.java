package Day9;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//Fluent wait declaration
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       //.withTimeout(Duration.ofSeconds(30))
			       //.pollingEvery(Duration.ofSeconds(5))
			       //.ignoring(NoSuchElementException.class);
		
		//WebElement txtusername = wait.until(new Function<WebDriver, WebElement>(){
			//public WebElement apply(WebDriver driver) {
				//return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			//}
		//});
		
		driver.get("https://hrm.medgre.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.close();
	}

}
