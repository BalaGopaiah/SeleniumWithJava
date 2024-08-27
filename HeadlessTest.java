package Day31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessTest {

	public static void main(String[] args) { 
		
		// Creating an headless object
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");  // Setting for headless mode of execution
		//options.addArguments("--incognito");
		//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"} );
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://xathon.mettl.com/event/Dare2Code_");
		
		String title = driver.getTitle();
		if(title.equals("Dare2Code")) {
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		
		// driver.close();
		driver.quit();
	}

}
