package ReadDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadingDataFromXcel {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	public static String[][] getExcelDataIn2DArray(String Path,String SheetName) throws Exception {
		String[][] excelDataArray = null;
		try {
			String path = "D:\\SeleniumProject\\SeleniumMavenProject\\testdata\\dataexcel.xlsx";
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			for (int s=0; s < ExcelWBook.getNumberOfSheets() ;s++){
			System.out.println( ExcelWBook.getSheetName(s));
		SheetName = ExcelWBook.getSheetName(s);
			int numOfColumns = ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
			int numOfRows = ExcelWSheet.getPhysicalNumberOfRows();
			System.out.println("NumOfRows : "+numOfRows+"\nnumOfColumns : "+numOfColumns);
			
			excelDataArray = new String[numOfRows-1][numOfColumns];
			
			for (int i= 1 ; i < numOfRows; i++) {
				for (int j=0; j < numOfColumns; j++) {
					excelDataArray[i-1][j] = ExcelWSheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return excelDataArray;
	}
}