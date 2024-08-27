package Day12;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://xathon.mettl.com/event/Dare2Code_");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//i[@class='far fa-question-circle cursor-pointer ft-16 text-white']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Blogs']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		for(String winID:windowIDs) {
			String title = driver.switchTo().window(winID).getTitle();
			System.out.println(title);
			Thread.sleep(5000);
		
			if ( title.equals("Dare2Code") || title.equals("Best Practices and Emerging Trends In Talent Management and L&D - Mercer | Mettl Blog") ) {
				driver.close();

			} 
		
		}
		
	}

}
