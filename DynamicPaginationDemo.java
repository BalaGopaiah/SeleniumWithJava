package Day22;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// Clicking on PIM
        driver.findElement(By.xpath("//ul[@class=\"oxd-main-menu\"]//li[2]")).click();
		
		String totalrows = driver.findElement(By.xpath("//span[@class=\"oxd-text oxd-text--span\"]")).getText();
		System.out.println(totalrows);
		int totalvalue = Integer.parseInt( totalrows.substring(totalrows.indexOf("(")+1, totalrows.indexOf(")")));   //dynamically Getting the total records
		System.out.println(totalvalue);
		
		//Select record in a table
		String record = driver.findElement(By.xpath("//div[contains(text(),'0312')]")).getText();
		if(record.equals("0312")) 
		{
			driver.findElement(By.xpath("//div[@class=\"oxd-table-cell oxd-padding-cell\"]//input[@value=\"3\"]")).click();
		}
		
		// repeating pages
//		for(int p=1; p<=totalvalue; p++) 
//		{
//			
//			if(p>1) {
//				WebElement active_page  = driver.findElement(By.xpath("//ul[@class='oxd-pagination__ul']//*[text()="+p+"]"));
//				active_page.click();
//				Thread.sleep(3000);
//			}
//			
//			// reading the data from the page.
//			String ids =driver.findElement(By.xpath("//div[@role='rowgroup']//div[1]//div[1]//div[2]")).getText();
//			System.out.println(ids);
//			
//		}
		
		
		
		
		
		
		
	}

}
