package Day12;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://xathon.mettl.com/event/Dare2Code_");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Blogs']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		// Approach1 
		/*List<String> windowList = new ArrayList(windowIDs);
		System.out.println(windowList);
		
		String parentID = windowList.get(0);   // parent ID
		System.out.println("ParentID" + ":" +parentID);
		
		String childID = windowList.get(1);    // Child ID
		System.out.println("ChildID" + ":" +childID);
		
		Thread.sleep(5000);
		
		// swicth to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		// switch to parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		*/
		
		
		// Approach2
		
		for(String winID:windowIDs) {
			String title = driver.switchTo().window(winID).getTitle();
			// System.out.println(title);
			
			if (title.equals("Dare2Code")) {
				System.out.println(driver.getCurrentUrl());
				System.out.println(title);
			}
			
		}
		
		
		
		
		
		
		
	}

}
