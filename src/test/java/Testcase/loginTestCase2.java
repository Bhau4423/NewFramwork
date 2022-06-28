package Testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase2;
import Pages.LoginPage2;

public class loginTestCase2 extends TestBase2 {
	LoginPage2 log;
	@BeforeMethod
	public void setup() throws IOException {
		initializetion();
		log = new LoginPage2();
	}
	
	@Test
	public void loginpagetest() throws IOException, InterruptedException {
		String value1 = log.loginfunctions();
		Assert.assertEquals(value1, "Shubham");
	}
	@AfterMethod
	public void exit() {
		driver.close();
	}
}
