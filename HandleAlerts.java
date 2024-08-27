package Day15;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// Normal alert with OK button
		// driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		// Thread.sleep(5000);
		
		// driver.switchTo().alert().accept();
		Alert myalert = driver.switchTo().alert();
		// System.out.println(myalert.getText());
		String alerttext = myalert.getText();
		if(alerttext.equals("I am a JS Alert")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
		myalert.accept();
				
		
		// Confirmation Alert  -  OK & Cancel
		// driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	    // Thread.sleep(5000);    
	    // driver.switchTo().alert().accept();  // close alert  using OK button
		// driver.switchTo().alert().dismiss();    // close alert using cancel button
	    /*Alert myalert = driver.switchTo().alert();
		 System.out.println(myalert.getText());
		String alerttext = myalert.getText();
		if(alerttext.equals("I am a JS Confirm")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
		myalert.accept();
		*/
		
		
		// Prompt alert -  Input box
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert myPromptAlert = driver.switchTo().alert();
		myPromptAlert.sendKeys("Hi This is JS Prompt alert");
		Thread.sleep(5000);
		System.out.println(myPromptAlert.getText());
		String alerttext = myPromptAlert.getText();
		if(alerttext.equals("I am a JS prompt")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
		myPromptAlert.accept();
		*/
		
		
		
		
		
		
		
		
	}

}
