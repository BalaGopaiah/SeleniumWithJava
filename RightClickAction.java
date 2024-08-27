package Day26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		WebElement buttontext = driver.findElement(By.xpath("//span[contains(text(), 'right click me')]"));
		
		Actions act = new Actions(driver);
		
		//Right click action
		act.contextClick(buttontext).perform();
		
		// Click on copy
		driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']//li[3]")).click();
		
		Thread.sleep(5000);
		
		//close alert box
	 	driver.switchTo().alert().accept();
	 	
		// Click on copy 
	 	/*List<WebElement> textlist = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li"));
	 	for( WebElement tl :textlist)
	 	{
	 		// System.out.println(tl.getText());
	 		if(tl.getText().equals("Copy"))
	 		{
	 			tl.click();
	 			Thread.sleep(3000);
	 			System.out.println("Copied text of Copy");
	 			driver.switchTo().alert().accept();
	 		}
	 	}
	 	*/
	 	
	}

}
