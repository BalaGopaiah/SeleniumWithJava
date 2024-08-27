package Day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();
		
		//1) Select single option 
		// driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//2) Capture all the options and then find out size
		List<WebElement> selectoptions = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		System.out.println(selectoptions.size());
		
		
		//3) Printing options from drop down 
		/*for( WebElement option:selectoptions) {
			System.out.println(option.getText());
		}
		*/
		
		//4) Select multiple options
		/*for( WebElement options: selectoptions ) 
		{
			String op = options.getText();
			if( op.equals("Java") || op.equals("jQuery") || op.equals("Python") || op.equals("MySQL") ) 
			{
				options.click();
			}
		}
		*/
		
	}

}
