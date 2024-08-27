package Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Select specific CheckBox
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		// Select all the CheckBoxes
		List<WebElement> CheckboxTotal = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		/* scenario 1
	    for(int i=0; i<CheckboxTotal.size(); i++) {
	    	CheckboxTotal.get(i).click();
	    }
	    */
		
		/* scenario 2
		for(WebElement CheckboxValue: CheckboxTotal) {
			CheckboxValue.click();
		}
		*/
		
		// select last 3 CheckBoxes
		/*for(int i=4; i<CheckboxTotal.size(); i++) {
			CheckboxTotal.get(i).click();
		}
		*/
		
		// select first 3 CheckBoxes
		/*for(int i=1; i<3; i++) {
			CheckboxTotal.get(i).click();
		}
		*/
		
		// UnSelect CheckBoxes if they are selected 
		/*for(int i=1; i<3; i++) {
			CheckboxTotal.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=0; i<CheckboxTotal.size(); i++) {
			if(CheckboxTotal.get(i).isSelected()) {
				CheckboxTotal.get(i).click();
			}
		}
		*/
	}

}
