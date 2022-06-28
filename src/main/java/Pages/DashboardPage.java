package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase2;

public class DashboardPage extends TestBase2 {
	@FindBy(xpath = "//div[@class='avatar']")private WebElement avatar;
	@FindBy(xpath = "//h4[@class='username']") private WebElement Username;
	@FindBy(xpath = "//div[@class='email']")private WebElement emailid;
	
	@FindBy(xpath = "//button[text()='Start investing ']")private WebElement startinvestmentbtn;
	@FindBy(xpath = "(//input[@type='text'])[2]")private WebElement searchbox;
	@FindBy(xpath = "(//li[@class='search-result-item'])[1]")private WebElement tcsStoks;
	@FindBy(xpath = "//button[text()='Create GTT ']")private WebElement gttbtn;
	@FindBy(xpath = "//input[@label='Trigger price']")private WebElement trigerpricetextbox;
	@FindBy(xpath = "//input[@label='Qty.']")private WebElement otntextbox;
	@FindBy(xpath = "//input[@label='Price']")private WebElement pricetextbox;
	@FindBy(xpath = "//button[@class='button-outline cancel']")private WebElement canclebtn;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyfullname() {
		avatar.click();
		return Username.getText();
	}
	
	public String verifygmailid() {
		avatar.click();
		return emailid.getText();
	}
	
	public void gttinvestpractis() throws InterruptedException, EncryptedDocumentException, IOException {
		startinvestmentbtn.click();
		Thread.sleep(2000);
		searchbox.sendKeys(resddatafromexcel(0, 0));
		Thread.sleep(2000);
		tcsStoks.click();
		Thread.sleep(2000);
		gttbtn.click();
		Thread.sleep(2000);
		trigerpricetextbox.clear();
		Thread.sleep(2000);
		trigerpricetextbox.sendKeys(resddatafromexcel(0, 1));
		Thread.sleep(2000);
		otntextbox.clear();
		Thread.sleep(2000);
		otntextbox.sendKeys(resddatafromexcel(0, 2));
		Thread.sleep(2000);
		pricetextbox.clear();
		Thread.sleep(2000);
		pricetextbox.sendKeys(resddatafromexcel(0, 3));
		Thread.sleep(2000);
		canclebtn.click();
		Thread.sleep(2000);
		
		
	}

}
