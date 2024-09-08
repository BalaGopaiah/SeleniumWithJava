package Calculator;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.addArguments("--disable-notifications");
		
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("calcuURL"));
		//driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
			
		String filePath = System.getProperty("user.dir")+"\\testdata\\CalculateData.xlsx";
		
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for(int i=1; i<=rows; i++)
		{
			//1) read data from excel
			String pric = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rateofinterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String per1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String per2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String fre = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_mvalue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			
			// pass above data into application
			driver.findElement(By.xpath(prop.getProperty("principle"))).sendKeys(pric);
			driver.findElement(By.xpath(prop.getProperty("rateofinterest"))).sendKeys(rateofinterest);
			driver.findElement(By.xpath(prop.getProperty("per1"))).sendKeys(per1);
			
			Select predrp = new Select(driver.findElement(By.xpath(prop.getProperty("per2"))));
			predrp.selectByVisibleText(per2);
			
			Select fredrp = new Select(driver.findElement(By.xpath(prop.getProperty("frequency"))));
			fredrp.selectByVisibleText(fre);
			
			driver.findElement(By.xpath(prop.getProperty("calculatebtn"))).click();  // clicked on calculate
						
			// Validation
			String act_mvalue = driver.findElement(By.xpath(prop.getProperty("actvalue"))).getText();
			
			if( Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue))
			{
				System.out.println("Test passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
				Thread.sleep(2000);
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
				Thread.sleep(2000);
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
			}
			
			Thread.sleep(3000);
			driver.findElement(By.xpath(prop.getProperty("clear"))).click();
		}
		//ending of for loop
		driver.quit();
	}

}
