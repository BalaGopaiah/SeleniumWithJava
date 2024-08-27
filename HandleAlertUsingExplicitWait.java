package Day15;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); // explicit wait duration
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		// Normal alert with OK button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	    Thread.sleep(5000);
	    
	    Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
	    
	    String myAlertText = myalert.getText();
	    if(myAlertText.equals("I am a JS Alert")) {
	    	System.out.println("Text has matched ");
	    }else {
	    	System.out.println("Text has not matched");
	    }
		myalert.accept();
		*/
		
		// Confirmation alert - OK and Cancel
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	    Thread.sleep(5000);   
	    Alert myConfirmAlert = mywait.until(ExpectedConditions.alertIsPresent());
	    
	    String myConfirmAlertText = myConfirmAlert.getText();
		if(myConfirmAlertText.equals("I am a JS Confirm")) {
			System.out.println("Text has matched");
		}else {
			System.out.println("Text had not matched");
		}
		myConfirmAlert.accept();
	    */
		
		
		// Prompt alert - Input box
		
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
	    
		myalert.sendKeys("Prompt alert has opened");
		String myPromptText = myalert.getText();
	    if(myPromptText.equals("I am a JS prompt")) {
	    	System.out.println("Text has matched");
	    }else {
	    	System.out.println("Text had not matched");
	    }
	    myalert.accept();
	    */
	}

}
