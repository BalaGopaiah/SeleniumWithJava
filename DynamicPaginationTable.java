package Day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Find the headings in the table
	    /*List<WebElement> heading = driver.findElements(By.xpath("//table[@id=\"productTable\"]//th"));
		for( WebElement head:heading) {
			System.out.println(head.getText()+"\t");
		}
		*/
		
		int totalrows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr")).size();
		System.out.println("Total rows:" +totalrows);
	    
		int totalcols = driver.findElements(By.xpath("//table[@id=\"productTable\"]//th")).size();
		System.out.println("Total columns:" +totalcols);
		
		// Read data from all the rows and columns in a table
		/*for(int r=1;r<=totalrows; r++) 
		{
			
			for(int c=1; c<=totalcols; c++ ) 
			{
				String value = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r+"]//td["+c+"]")).getText();
			    System.out.println(value);
				
			}
			System.out.println();
		}
		*/
		
		// Select multiple check box whose id 3 & 5
		/*for(int r=1; r<=totalrows; r++) 
		{
			String ids = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r+"]//td[1]")).getText();
			String prices = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r+"]//td[3]")).getText();
			String products = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r+"]//td[2]")).getText();
			if(ids.equals("3") || ids.equals("5") )
			{
				driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r+"]//td[4]//input")).click();
				System.out.println(ids+"\t"+products+"\t"+prices);
			}
			
		}
		*/
		
		
		
	}

}
