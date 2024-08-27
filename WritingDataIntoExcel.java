package ReadDataExcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\testdata\\WritingFile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("MarksList");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Maths");
		row1.createCell(1).setCellValue("Physics");
		row1.createCell(2).setCellValue("Commerce");
		row1.createCell(3).setCellValue("Economics");
		row1.createCell(4).setCellValue("English");
		
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("60");
		row2.createCell(1).setCellValue("50");
		row2.createCell(2).setCellValue("70");
		row2.createCell(3).setCellValue("80");
		row2.createCell(4).setCellValue("75");
		
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("40");
		row3.createCell(1).setCellValue("50");
		row3.createCell(2).setCellValue("60");
		row3.createCell(3).setCellValue("70");
		row3.createCell(4).setCellValue("80");
		
		
		XSSFRow row4 = sheet.createRow(3);
		row4.createCell(0).setCellValue("50");
		row4.createCell(1).setCellValue("55");
		row4.createCell(2).setCellValue("60");
		row4.createCell(3).setCellValue("65");
		row4.createCell(4).setCellValue("70");
		
		XSSFRow row5 = sheet.createRow(4);
		row5.createCell(0).setCellValue("65");
		row5.createCell(1).setCellValue("55");
		row5.createCell(2).setCellValue("75");
		row5.createCell(3).setCellValue("85");
		row5.createCell(4).setCellValue("75");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created..........!!!!");
		
	}

}
