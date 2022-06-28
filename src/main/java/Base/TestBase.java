package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public String readProprtyfile(String value) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\rituyashu\\eclipse-workspace_01\\Framwork26feb\\src\\main\\java\\config\\Config.properties");
		prop.load(file);
		
		return prop.getProperty(value);
	}
	public void initalization() throws IOException {
		 
		System.setProperty("webdriver.chrome.driver",	"C:\\Users\\rituyashu\\eclipse-workspace_01\\26FebBatchFramWork_01\\chromedriver.exe");
		driver	=	new	ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://kite.zerodha.com/");
		driver.get(readProprtyfile("Url"));
		driver.manage().timeouts().implicitlyWait(25,	TimeUnit.SECONDS);
		// driver.get(readProprtyfile("Url"));
	}

}
