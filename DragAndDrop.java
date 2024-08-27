package Day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");    // Define the URL of the target website.
		driver.manage().window().maximize();
		
		//Instantiating Actions class
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		// Drag and drop1
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(oslo , italy).perform();
	
		Thread.sleep(3000);
	
		// Drag and drop2
		WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(stockholm , sweden).perform();
		
		Thread.sleep(3000);
	
		// Drag and drop3
		WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement unitedstates = driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(washington , unitedstates).perform();
		
	}

}
