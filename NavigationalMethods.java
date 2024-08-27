package Day9;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		// driver.get("https://xathon.mettl.com/event/Dare2Code_");
		
		driver.navigate().to("https://xathon.mettl.com/event/Dare2Code_");
		driver.navigate().to("https://xathon.mettl.com/view-challenges");
		
		driver.navigate().back();
		System.out.println("Back URL:" + driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("Forward URL:" + driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		// URL myurl = new URL("https://xathon.mettl.com/event/Dare2Code_");
		// driver.navigate().to(myurl);
		
		
	}

}
