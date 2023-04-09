package PgObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	public WebDriver ldriver;
	public PIMPage(WebDriver rdriver)
	{
		 ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath = "//*[text()='PIM']")
	WebElement pim;
	
	@FindBy(xpath = "//a[normalize-space()='Add Employee']")
	WebElement addem;
	@FindBy(xpath="//h6[normalize-space()='PIM']")
	WebElement title;
	@FindBy(xpath ="//input[@placeholder='First Name']")
	WebElement firstName;
	
	
	
	@FindBy(xpath ="//input[@placeholder='Last Name']")
	WebElement lastName;
	
	@FindBy(xpath= "//button[normalize-space()='Save']")
	WebElement save;
	
	public void getPIMitem()
	{
		pim.click();
	}
	
	public void addBtn()
	{
		addem.click();
	}
	public String getviewpageTitle()
	{
		return title.getText();
	}
	public void sendFirstName()
	{
		firstName.sendKeys("SOUMITRA");
	}
	public void sendLastName()
	{
		lastName.sendKeys("PRADHAN");
	}
	public void saveBtn()
	{
		save.click();
	}
}
