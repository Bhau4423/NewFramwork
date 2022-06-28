package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase2;

public class LoginPage2 extends TestBase2 {
	
	@FindBy(xpath = "//input[@label='User ID']") private WebElement useridtextbox; 
	@FindBy(xpath = "//input[@id='password']")private WebElement passtextbox;
	@FindBy(xpath = "//button[@type='submit']")private WebElement submitbut;
	@FindBy(xpath = "//input[@label='PIN']")private WebElement pintextbox;
	@FindBy(xpath = "//button[@type='submit']")private WebElement submitbut2;
	@FindBy(xpath = "//span[@class='nickname']")private WebElement nameverify;
	
	public LoginPage2() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginfunctions() throws IOException, InterruptedException {
		useridtextbox.sendKeys(readconfigfile("Userid"));
		Thread.sleep(2000);
		passtextbox.sendKeys(readconfigfile("Password"));
		Thread.sleep(2000);
		submitbut.click();
		Thread.sleep(2000);
		pintextbox.sendKeys(readconfigfile("pin"));
		Thread.sleep(2000);
		submitbut2.click();
		Thread.sleep(2000);
		return nameverify.getText();
		
		
		
	}

}
