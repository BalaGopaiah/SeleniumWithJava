package BrokenLinksPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 1). Link href="https://xyz.com"
 * 
 * 2). https://xyz.com  ----> connect to server and sent request to server ----> get status code
 * 
 * 3). If status code >= 400 broken link
 *     status code < 400 not a broken link
 */

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		// capture all the links from the website 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int noBrokenLinks = 0;
		int noNotBrokenLinks = 0;
		
		for( WebElement lk:links)
		{
			
			String hrefattValue = lk.getAttribute("href");
			if(hrefattValue == null || hrefattValue.isEmpty())
			{
				System.out.println("href attribute value is null or empty. so not possible to check");
			    continue;
			}
			
			// hit URL to the server
			try 
			{
				
				URL linkURL = new URL(hrefattValue);    // converted href value from string to URL format
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();   // open connection to the server
				conn.connect();    // connect to the server and sent request the server
				//System.out.println( conn.getResponseMessage() );
				
				if( conn.getResponseCode() >= 400 )
				{
					System.out.println(hrefattValue+ "=====> Broken link");
					noBrokenLinks++;
				}
				else
				{
					System.out.println(hrefattValue+ "======> Not a broken link");
					noNotBrokenLinks++;
					
				}
				
			} catch (Exception e) {
				
			}
			
		}
		System.out.println("Number of broken links:" + noBrokenLinks);
		System.out.println("Number of not broken links:" + noNotBrokenLinks);
		
	}

}
