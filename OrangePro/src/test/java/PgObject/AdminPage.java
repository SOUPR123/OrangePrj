package PgObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdminPage {
	
	public WebDriver ldriver;
	public AdminPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//*[text()='Admin']")
	WebElement adminItem;
	 
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement addNew;
	
	@FindBy(xpath="//h6[normalize-space()='Admin']")
	WebElement viewTitle;
    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]")
    WebElement userRole;
    @FindBy(xpath="//*[@role='listbox']")
    List<WebElement> userSelect;
	@FindBy(xpath="(//div[@class='oxd-select-wrapper'])[2]")
	WebElement status;
	@FindBy(xpath="//*[@role='listbox']")
	List<WebElement> statusSelect;
	@FindBy(css ="[placeholder='Type for hints...']")
	WebElement empName;
	@FindBy(xpath="//label[text()='Username']//ancestor::div/div/div/input")
	WebElement user;
	@FindBy(xpath="(//*[@class='oxd-input oxd-input--active' and @type='password'])[1]")
	WebElement pass1;
	@FindBy(xpath="//label[text()='Confirm Password']//ancestor::div/div/div/input")
	WebElement confirmpass;
	@FindBy(css="[type='submit']")
	WebElement savebtn;
	
	@FindBy(xpath="//span[text()='Job ']//parent::li")
	WebElement jobitem;
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement ad;
	
	@FindBy(css="[role='menuitem']")
	 List<WebElement> jobtitle;
	@FindBy(xpath="//label[text()='Job Title']//ancestor::div/div/div/input")
	WebElement jobttlname;
	
	@FindBy(xpath="//label[text()='Job Description']//ancestor::div/div/div/textarea")
	WebElement jobdesc;
	
	@FindBy(css="[type=\"file\"]")
	WebElement file;
	@FindBy(xpath="//label[text()='Note']//ancestor::div/div/div/textarea")
	WebElement note;
	@FindBy(css="[type=\"submit\"]")
	WebElement sv;
	
	@FindBy(xpath="//span[text()='Organization ']//parent::li")
	WebElement organiz;
	
	@FindBy(css="[role='menuitem']")
	List<WebElement> generalinfo;
	@FindBy(css="[class='oxd-switch-wrapper']")
	WebElement edit;
	@FindBy(xpath="//label[text()='Organization Name']//ancestor::div/div/div/input")
	WebElement orgnm;
	@FindBy(xpath="//label[text()='Registration Number']//ancestor::div/div/div/input")
	WebElement regnum;
	@FindBy(xpath="//label[text()='Tax ID']//ancestor::div/div/div/input")
	WebElement taxid;
	@FindBy(xpath="//label[text()='Phone']//ancestor::div/div/div/input")
	WebElement phnum;
	@FindBy(xpath="//label[text()='Email']//ancestor::div/div/div/input")
	WebElement eml;
	@FindBy(xpath="//label[text()='Address Street 1']//ancestor::div/div/div/input")
	WebElement address;
	@FindBy(xpath="//label[text()='State/Province']//ancestor::div/div/div/input")
	WebElement state;
	@FindBy(xpath="//label[text()='Zip/Postal Code']//ancestor::div/div/div/input")
	WebElement pin;
	@FindBy(className="oxd-select-wrapper")
	WebElement country;
	@FindBy(xpath="//*[@role='listbox']")
	List<WebElement> countryname;
	@FindBy(xpath="//label[text()='Notes']//ancestor::div/div/div/textarea")
	WebElement notearea;
	 @FindBy(css="[type='submit']")
	 WebElement sve;
	public String getPageTitle()
	{
		return ldriver.getTitle();
	}
	public void getAdminItem()
	{
		adminItem.click();
	}
	
	public void clickOnAddnew() {
		addNew.click();
	}
	public void getViewTitle()
	{
		viewTitle.getText();
	}
	public WebElement userrole()
	{
		return userRole;
	}
  public List<WebElement> userselect()
  {
	 return userSelect;
  }
  public WebElement userStatus()
  {
	  return status;
  }
  public List<WebElement> selectStatus()
  {
	  return statusSelect;
  }
  public void employeeName()
  {
	  empName.sendKeys("au");  
  }
  public void userName()
  {
	  user.sendKeys("Soumitra");
  }
  public void userPass()
  {
	  pass1.sendKeys("Abc@123456"); 
  }
  public void confirmPass()
  {
	  confirmpass.sendKeys("Abc@123456");
  }
  public void saveBtn()
  {
	  savebtn.click();
  }
  
  public WebElement jobItem()
	{
		return jobitem;
	}
  public List<WebElement> jobTitle()
  {
	  return jobtitle;
  }
  public void clickOnAd()
  {
	  ad.click();
  }
  public void jobTtlName()
  {
	  jobttlname.sendKeys("Abc@123456");
  }
  public void jobDescript()
  {
	  jobdesc.sendKeys("Abc@123456");
  }
  
  public void uploadFile()
  {
	  file.sendKeys("C:\\Users\\SOUMIPRA\\Downloads\\java basic.png");
  }
  public void noteArea()
  {
	  note.sendKeys("hukhghaf awefahdvjh awmjhcgukwsgf mjhvswjhefds");
  }
  public void svBtn()
  {
	  sv.click();
  }
  
  public WebElement oranizationItem()
  {
	  return organiz;
  }
  public List<WebElement> generalInformation()
  {
	  return  generalinfo;
  }
  public void editOption()
  {
	  edit.click();
  }
  public void orgName()
  {
	  orgnm.sendKeys("Capgemini");
  }
  public void regNumber()
  {
	  regnum.sendKeys("1234567");
  }
  public void taxId()
  {
	  taxid.sendKeys("ABC1234");
  }
   public void phNum()
   {
	   phnum.sendKeys("9732794323");
   }
   public void Email()
   {
	   eml.sendKeys("pradhansoumitra096@gmail.com");
   }
   public void enterAddress()
   {
	   address.sendKeys("KOLKATA");
   }
   public void enterState()
   {
	   state.sendKeys("WEST BENGAL");
   }
   public void postalCode()
   {
	   pin.sendKeys("721659");
   }
   public void selectCountry()
   {
	   country.click();
   }
   public List<WebElement> countryName()
   {
	   return countryname;
   }
   public void noteAreaa()
   { 
	   notearea.sendKeys("jhgfytdjtdf e657cjgvj bkugi");
   }
   public void saVe()
   {
	   sve.click();
   }
}
