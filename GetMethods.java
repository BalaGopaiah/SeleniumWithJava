package Day9;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// getUrl() - opens the URL on the browser
		driver.get("https://xathon.mettl.com/event/Dare2Code_");
		Thread.sleep(5000);
		
		// getTitle() - returns the title of the page
		String titleStatus = driver.getTitle();
		if(titleStatus.equals("Dare2Code")){
			System.out.println("Test case Passed");
		}else {
			System.out.println("Test case Failed");
		}
		
		// getCurrentUrl() - returns current URL of the page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// getPageSourceCode() - returns Source code of the page
		// String sourcecode = driver.getPageSource();
		// System.out.println(sourcecode);
		
		// getWindowHandle() - returns ID of the single browser window
		String singlebrowserwindow = driver.getWindowHandle();
		System.out.println("Window ID :" + singlebrowserwindow); 
		
		// click Visit Us button
		driver.findElement(By.xpath("//button[normalize-space()='Blogs']")).click();
		
		// getWindowHandles() - returns ID's of the multiple browser windows
		Set<String> multiplebrowserwindows = driver.getWindowHandles();
		System.out.println(multiplebrowserwindows);
		
		// driver.close();
		
	}

}
