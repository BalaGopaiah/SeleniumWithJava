package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://swisnl.github.io/jQuery-contentMenu/demo.html");    // Define the URL of the target website.
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		// Initiating Actions class object
		Actions act = new Actions(driver);
		
		Action myaction = act.contextClick(button).build();   // creating or building an action and storing into a variable
		myaction.perform();          // we are performing/completing an action
		
	}

}
