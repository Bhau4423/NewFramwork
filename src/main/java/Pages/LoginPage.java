package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//img[@alt='Kite']") private WebElement LogoKite;
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement LogoZerodha;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle() {
		return driver.getTitle();
	}
	
	public boolean VerifyLogoKite() {
		return LogoKite.isDisplayed();
	}
	
	public boolean VerifyLogoZerodha() {
		return LogoZerodha.isDisplayed();
	}

}
