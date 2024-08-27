package Day20;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public class AssignmentForStaticTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		
		// Select Departures option
		WebElement departure = driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		Select departures = new Select(departure);
		Thread.sleep(3000);
		
		departures.selectByValue("Portland");
		
		// Select Destination option 
		WebElement destination = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		Select destinations = new Select(destination);
		Thread.sleep(3000);
		
		destinations.selectByValue("Rome");
		
		// Click Find Flights
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		// Find total number of rows in a table
		int totaltrs = driver.findElements(By.xpath("//table[@class=\"table\"]//tr")).size();
		System.out.println("Total row's:" + totaltrs);
				
		// Find total number of columns in a table
		int trcolmns = driver.findElements(By.xpath("//table[@class=\"table\"]//th")).size();
		System.out.println("Total column's:" + trcolmns);
		
		// System.out.println("Prices");
		/*List<WebElement> pricevalues = driver.findElements(By.xpath("//table[@class=\"table\"]//tr[1]//td[6]"));
		System.out.println(pricevalues.size());
		for( WebElement  pv:pricevalues) 
		{
			System.out.println(pv.getText());
		}
		*/
		
		// Getting the prices data
		// int pricevalue = 0;
		for(int r=1; r<=totaltrs; r++) 
		{                     // repeating the rows
	
			List<WebElement> pricevalues = driver.findElements(By.xpath("//table[@class=\"table\"]//tbody//tr["+r+"]//td[6]"));
			for( WebElement  pv:pricevalues) 
			{
				//System.out.println(pv.getText());
				String priceText = pv.getText();
				System.out.println(priceText);
				
			}		
			
			//ArrayList pricevalues = new ArrayList(value);
			//System.out.println(pricevalues.size());
			
		}
		
		
	}

}
