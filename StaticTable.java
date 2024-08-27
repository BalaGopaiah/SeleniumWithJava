package Day20;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// Find total number of rows in a table
		int totaltrs = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("Total row's:" + totaltrs);
		
		// Find total number of columns in a table
	    int trcolmns = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println("Total column's:" + trcolmns);
		
		// Read data from specific row and column (ex: 5th row and 1st column)
		// String bookname = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText();
		// System.out.println(bookname);
		
		// Read data from all the rows and columns in a table 
		/*System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int r=2; r<=totaltrs; r++) 
		{                     // repeating the rows
	
			for(int c=1; c<=trcolmns; c++) 
			{                 // repeating the columns in every row
				String value = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value+"\t");
			}
			System.out.println();
		}
		*/
		
		// Print book names whose author Mukesh
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject");
		for(int r=2; r<=totaltrs; r++) 
		{
		 String authorname = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
		 String subjectname= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[3]")).getText();
		 // System.out.println(authorname);
		 if(authorname.equals("Mukesh")) 
		 {
			String bookname = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText();
			System.out.println(bookname+"\t"+authorname+"\t"+subjectname);
		 }
		}
		
		
		//Find total price of all the books
		/*int totalprice = 0;
		for(int r=2;r<=totaltrs; r++) 
		{
			String prices = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]")).getText();
		    // System.out.println(prices);
			totalprice = totalprice + Integer.parseInt(prices);
		}
		System.out.println("total price:"+totalprice);
		*/		
		
	}

}
