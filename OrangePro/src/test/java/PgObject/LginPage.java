package PgObject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class LginPage {
	WebDriver ldriver;
	public LginPage(WebDriver rDriver)
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement lgnBtn;
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement paulcol;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logout ;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	WebElement msg ;
	
	public void enterUserName(String userName)
	{   
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		username.sendKeys(userName);
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	
	public void enterPassword(String pwd)
	{
		
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		lgnBtn.click();
	}
	public void clickOnLogOutButton()
	{
		paulcol.click();
		logout.click();
	}
	public String messAge()
	{ 
		String message=msg.getText();
		return message;
		
	}
	
	

}
