import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExclReader {

	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static WebDriver driver;
	static String projectpath;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			projectpath = System.getProperty("user.dir");
			System.out.println(projectpath);// just to make sure we are getting right path of the project here.
			workbook = new XSSFWorkbook(projectpath+File.separator+"Excel"+File.separator+"data.xlsx");
			sheet = workbook.getSheet("sheet1");
			
			int rowCount = sheet.getPhysicalNumberOfRows(); //getting total number of rows
			
			for (int rowNumb = 1; rowNumb < rowCount; rowNumb++) {
				
				String usrm = sheet.getRow(rowNumb).getCell(0).getStringCellValue();
				String pswd = sheet.getRow(rowNumb).getCell(1).getStringCellValue();
				String role = sheet.getRow(rowNumb).getCell(2).getStringCellValue();
				double exp  = sheet.getRow(rowNumb).getCell(3).getNumericCellValue();
				System.out.println(usrm + " "+ pswd + " " + role + " "+ exp);
				
			}
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
