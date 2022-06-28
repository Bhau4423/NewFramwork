package Testcase;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase2;
import Pages.DashboardPage;
import Pages.LoginPage2;

public class DashboadTestcase extends TestBase2 {
	private static final boolean fales = false;
	DashboardPage dash;
	LoginPage2 log;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initializetion();
		log = new LoginPage2();
		 dash = new DashboardPage();
		 log.loginfunctions();
		 
	}
	@Test(enabled = fales)
	public void verifyfullnametest() {
		String v1= dash.verifyfullname();
		Assert.assertEquals(v1, "Shubham Jaywant Patil");
	}
	
	@Test(enabled = fales)
	public void verifygmailidtest() {
		String v2= dash.verifygmailid();
		Assert.assertEquals(v2, "shubhampatil3971@gmail.com");
	}
	
	
	@Test
	public void investpractistest() throws InterruptedException, EncryptedDocumentException, IOException {
		dash.gttinvestpractis();
	}
	
	@AfterMethod
	public void exit() {
		driver.close();
	}
	

}
