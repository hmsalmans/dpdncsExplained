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
		
		
		projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);// just to make sure we are getting right path of the project here
		

	}

}
