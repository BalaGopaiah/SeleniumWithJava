package Day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://dummy-tickets.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();
		
		// From: Address
		driver.findElement(By.xpath("//form[@id=\"both_oneway\"]//div[@class=\"route_1 row p-0 pt-3\"]//div[1]//input")).sendKeys("Indira Gandhi International Airport, New Delhi - DEL");
		Thread.sleep(3000);
		
		List<WebElement> fromlist = driver.findElements(By.xpath("//form[@id=\"both_oneway\"]//div[@class=\"route_1 row p-0 pt-3\"]//div[1]//ul"));
	    //System.out.println(fromlist.size());
	    
	    for(WebElement fromlistdata :fromlist) {
	    //System.out.println(fromlistdata.getText());
	    String ld = fromlistdata.getText();
	     if(ld.equals("Indira Gandhi International Airport, New Delhi - DEL")) {
	    	 fromlistdata.click();
	    	 break;
	     }
	    }
	    
	    // To: address
	    driver.findElement(By.xpath("//form[@id=\"both_oneway\"]//div[@class=\"route_1 row p-0 pt-3\"]//div[2]//input")).sendKeys("Brunei International Airport, Bandar Seri Begawan - BWN");
		Thread.sleep(3000);
		
		List<WebElement> tolist = driver.findElements(By.xpath("//form[@id=\"both_oneway\"]//div[@class=\"route_1 row p-0 pt-3\"]//div[2]//ul"));
	    //System.out.println(tolist.size());
	    
	    for(WebElement tolistdata :tolist) {
	    //System.out.println(tolistdata.getText());
	    String ld = tolistdata.getText();
	     if(ld.equals("Brunei International Airport, Bandar Seri Begawan - BWN")) {
	    	 tolistdata.click();
	    	 break;
	     }
	    }
	    
		Thread.sleep(3000);
	    WebElement departuredate = driver.findElement(By.xpath("//form[@id='both_oneway']//div[2]//div[1]//input[@id=\"dp1721972722348\"]"));
	    departuredate.click();
		
	}

}
