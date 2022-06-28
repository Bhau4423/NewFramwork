package Testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginTestcase extends TestBase {
	LoginPage log;
	@BeforeMethod
	public void setup() throws IOException {
		initalization();
		log = new LoginPage();
	}
	
	@Test
	public void VerifyTitletest() {
		String title= log.VerifyTitle();
		Assert.assertEquals("1Kite - Zerodha's fast and elegant flagship trading platform", title);
	}
	
	@Test(enabled = false)
	public void VerifyLogoKite() {
		boolean PresentLogo = log.VerifyLogoKite();
		Assert.assertTrue(PresentLogo);
	}

	@Test(enabled = false)
	public void VerifyLogoZerodhaTest() {
		boolean PresentLogo2 = log.VerifyLogoZerodha();
		Assert.assertTrue(PresentLogo2);
	}
	
	@AfterMethod
	public void exit() {
		driver.close();
	}
}
