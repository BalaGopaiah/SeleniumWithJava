package Day24;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {

	// User defined function for converting month from string--->month
	static Month convertMonth(String month) {
		
		HashMap<String, Month> monthmap = new HashMap<String, Month>();
		
		monthmap.put("January", Month.JANUARY);
		monthmap.put("February", Month.FEBRUARY);
		monthmap.put("March", Month.MARCH);
		monthmap.put("April", Month.APRIL);
		monthmap.put("May", Month.MAY);
		monthmap.put("June", Month.JUNE);
		monthmap.put("July", Month.JULY);
		monthmap.put("August", Month.AUGUST);
		monthmap.put("September", Month.SEPTEMBER);
		monthmap.put("October", Month.OCTOBER);
		monthmap.put("November", Month.NOVEMBER);
		monthmap.put("December", Month.DECEMBER);
		
		Month rmonth = monthmap.get(month);
		
		if(rmonth == null) {
			System.out.println("Invalid month.....");
		}
		
		return rmonth;
		
	}
	
	static void selectDate(WebDriver driver, String requiredYear, String requiredMonth, String requiredDate) 
	{
				// Select year
				WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select selectYear = new Select(yearDropDown);
				selectYear.selectByVisibleText(requiredYear);
				 
				// Select month
				
				while(true) 
				{
					
					String displayMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					// System.out.println("Current Month:" +displayMonth);
					
					// Convert required month and display month in to Month Object
					Month expectedMonth = convertMonth(requiredMonth);
					Month currentMonth = convertMonth(displayMonth);
					
					// Comapre
					int result = expectedMonth.compareTo(currentMonth);
					
					// 0  month or equal
					// >0 future month
					// <0 past month
					
					if( result < 0 )   // past
					{
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); 
					}
					else if( result > 0 )   // future
					{
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
					}
					else
					{
						break;
					}
					
				}
				
				
				// Select date
				List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
				for( WebElement dt:alldates)    // enhanced for loop
				{
					if(dt.getText().equals(requiredDate)) 
					{
						dt.click();
						break;
					}
				}
				
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//input DOB
		String requiredYear = "2024";
		String requiredMonth = "July";
		String requiredDate = "25";
		
		driver.switchTo().frame("frame-one796456169");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id=\"q4\"]//span[@class=\"icon_calendar\"]")).click();
		Thread.sleep(3000);
		
		selectDate(driver, requiredYear, requiredMonth, requiredDate );
		
		
	}

}
