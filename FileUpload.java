package Day30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");    // Define the URL of the target website.
		driver.manage().window().maximize();
		
		// Single file upload - Screenshot (75).png
		/*driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys("C:\\Users\\BalaGopaiah\\Pictures\\Screenshots\\Screenshot (75).png");
		
		if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("Screenshot (75).png")) 
		{
			System.out.println("File is successfully uploaded");
		}
		else 
		{
			System.out.println("Upload failed.");
		}
		*/
		
		
		//Multiple files upload
		String file1 = "C:\\Users\\BalaGopaiah\\OneDrive - Zelarsoft Private limited\\pdf\\IMG_20201206_193805_pdf.pdf";  // "C:\\Users\\BalaGopaiah\\Pictures\\Screenshots\\Screenshot (75).png";
		String file2 = "C:\\Users\\BalaGopaiah\\OneDrive - Zelarsoft Private limited\\pdf\\JavaScriptNotesForProfessionals.pdf"; // "C:\\Users\\BalaGopaiah\\Pictures\\Screenshots\\Screenshot (74).png";
		String file3 = "C:\\Users\\BalaGopaiah\\OneDrive - Zelarsoft Private limited\\pdf\\HTML,CSS & Javascript Course Content.docx.pdf"; // "C:\\Users\\BalaGopaiah\\Pictures\\Screenshots\\Screenshot (73).png";

	    
		driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys(file1+"\n"+file2+"\n"+file3);
		
		//List<WebElement> files = driver.findElements(By.xpath("//ul[@id=\"fileList\"]//li"));
		//int noOfFiles = files.size();
		
		// validation 1 - number of files
		/*if(noOfFiles == 3)
		{
			System.out.println("All files are uploaded");
		}
		else 
		{
			System.out.println("Files are not uploaded");
		}
		*/
		
		String filename1 = driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li[1]")).getText();
		String filename2 = driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li[2]")).getText();
		String filename3 = driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li[3]")).getText();
		
		// validate file names
		if( filename1.equals("IMG_20201206_193805_pdf.pdf") && filename2.equals("JavaScriptNotesForProfessionals.pdf") && filename3.equals("HTML,CSS & Javascript Course Content.docx.pdf") )
		{
			System.out.println("File names matching...");
		} 
		else
		{
			System.out.println("Files are not matching..");
		}
		
		
		
		/*
		for( WebElement  fls:files)     // Nested for loop
		{
			String filesText = fls.getText();
			System.out.println(filesText);
			if(filesText.equals("Screenshot (75).png") && filesText.equals("Screenshot (74).png"))
			{
				System.out.println("Files matched");
				break;
			}
			
		}
		*/
		
		
	}

}
