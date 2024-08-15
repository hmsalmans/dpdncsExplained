import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCreator {

	static XSSFWorkbook workbook = new XSSFWorkbook();
	static XSSFSheet sheetCreate = workbook.createSheet("createdSheet");//creating own sheet--this is for adding data and creating excel.


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub



		//Now we are creating xl file and adding data


		XSSFRow headerRow = sheetCreate.createRow(0);
		headerRow.createCell(0).setCellValue("userNanme");
		headerRow.createCell(1).setCellValue("password");
		headerRow.createCell(2).setCellValue("role");
		headerRow.createCell(3).setCellValue("exper YEARS");

		XSSFRow dataRow1 = sheetCreate.createRow(1);
		dataRow1.createCell(0).setCellValue("salman");
		dataRow1.createCell(1).setCellValue("Heysall");
		dataRow1.createCell(2).setCellValue("frnd");
		dataRow1.createCell(3).setCellValue("2");

		XSSFRow dataRow2 = sheetCreate.createRow(2);
		dataRow2.createCell(0).setCellValue("kasfuu");
		dataRow2.createCell(1).setCellValue("abujind");
		dataRow2.createCell(2).setCellValue("life");
		dataRow2.createCell(3).setCellValue("14");


		FileOutputStream file = new FileOutputStream("Excel/OwnCreatedXLfile.xlsx");// choosing your own folder to save
		workbook.write(file);



		//Now reading those values back to me

		int rowCount = sheetCreate.getPhysicalNumberOfRows(); //getting total number of rows

		for (int rowNumb = 1; rowNumb < rowCount; rowNumb++) {

			String usrm = sheetCreate.getRow(rowNumb).getCell(0).getStringCellValue();
			String pswd = sheetCreate.getRow(rowNumb).getCell(1).getStringCellValue();
			String role = sheetCreate.getRow(rowNumb).getCell(2).getStringCellValue();
			String exp  = sheetCreate.getRow(rowNumb).getCell(3).getStringCellValue();
			System.out.println(usrm + "|| "+ pswd + "|| " + role + "|| "+ exp);



		}

	}

}
