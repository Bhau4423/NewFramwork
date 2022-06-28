package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestBase2 {
	public static WebDriver driver;
	public String readconfigfile(String value) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\rituyashu\\eclipse-workspace_01\\Framwork26feb\\src\\main\\java\\config\\Config.properties");
		prop.load(file);
		
		return prop.getProperty(value);
	
	}
	
	public void initializetion() throws IOException {
		
		String obj = readconfigfile("browser");
		if(obj.equalsIgnoreCase("chrome")) {
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rituyashu\\eclipse-workspace_01\\Framwork26feb\\chromedriver.exe");
        driver = new ChromeDriver(o);
		}
		else if (obj.equalsIgnoreCase("edge")) {
			EdgeOptions e = new EdgeOptions();
			e.addArguments("--disable-notifications");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\rituyashu\\eclipse-workspace_01\\Framwork26feb\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		//driver.get("https://kite.zerodha.com/");
		driver.get(readconfigfile("Url"));
		
	}
	
	public String resddatafromexcel(int rownum , int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\rituyashu\\eclipse-workspace_01\\Framwork26feb\\TestData\\Book1.xlsx");
		Sheet value = WorkbookFactory.create(file).getSheet("sheet1");
		String outt = value.getRow(rownum).getCell(cellnum).getStringCellValue();
		
		return outt;
	}

}
