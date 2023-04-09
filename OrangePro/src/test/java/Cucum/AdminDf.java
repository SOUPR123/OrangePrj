package Cucum;


import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PgObject.AdminPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminDf extends BaseCl {
	
	 AdminPage adpg=new AdminPage(driver);
		Actions act=new Actions(driver);
	@Then("User can view Dashboad")
	public void user_can_view_dashboad() {
		waits();
		String actTitle=adpg.getPageTitle();
		String expTitle=read.getTitle1();
		if(actTitle.equals(expTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	  
	}

	@When("User click on Admin Menu")
	public void user_click_on_admin_menu() {
		waits();
		adpg.getAdminItem();
	   
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		waits();
	    adpg.clickOnAddnew();
	}

	@Then("User can view Admin page")
	public void user_can_view_admin_page() {
		threadWait();
		String actText=adpg.getPageTitle();
		String expText=read.getText1();
		if(actText.equals(expText))
		{
			Assert.assertTrue(true);
		}
		else
		{
			
		}
	}

	@When("User enter customer info")
	public void user_enter_customer_info() throws Exception {
		waits();
		act.moveToElement(adpg.userrole()).click().build().perform();
		List<WebElement> roles= adpg.userselect();
	    for(WebElement ele:roles)
		{
		if(ele.getText().toLowerCase().contains("admin"))
		act.moveToElement(ele).click().perform();
		}
	    
	    act.moveToElement(adpg.userStatus()).click().build().perform();
	    List<WebElement> status=adpg.selectStatus();
	    for(WebElement ele: status)
	    {
	    if(ele.getText().toLowerCase().contains("enabled"))
	    act.moveToElement(ele).click().perform();
	    }
	    
	    
	    //driver.findElement(By.cssSelector("[placeholder='Type for hints...']")).sendKeys("au");
		adpg.employeeName();
	    List<WebElement> employeeNames= driver.findElements(By.xpath("//*[@role='listbox']"));
		for(WebElement ele1: employeeNames)
	    {
		if(ele1.getText().toLowerCase().contains("paul"))
		//act.moveToElement(ele1).click().perform();
		 act.moveToElement(ele1).click().perform();
	    }
		Thread.sleep(3000);
		 //driver.findElement(By.xpath("//label[text()='Username']//ancestor::div/div/div/input")).sendKeys("soumitra");
		adpg.userName();
		 Thread.sleep(3000);
		 //driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active' and @type='password'])[1]")).sendKeys("Abc@123456");
		 adpg.userPass();
		 //driver.findElement(By.xpath("//label[text()='Confirm Password']//ancestor::div/div/div/input")).sendKeys("Abc@123456");
		 adpg.confirmPass();
		
	    }
	    @When("click on Save button")
	public void click_on_save_button() {
	    	waits();
	    //driver.findElement(By.cssSelector("[type='submit']")).click();
	    adpg.saveBtn();
	    }

	   

//	    JOB TITLE
	    
	    @When("click on job menu item")
	    public void click_on_job_menu_item() {
	    	waits();
	    act.moveToElement(adpg.jobItem()).click().perform();
	    }

	    @When("click on job title item")
	    public void click_on_job_title_item() {
	    	waits();
	    	List<WebElement> status1= adpg.jobTitle();
	    	try {
				Thread.sleep(3000);
			
			for(WebElement ele: status1)
			{
				if(ele.getText().toLowerCase().contains("title"))
				{ act.moveToElement(ele).click().perform();
				break;}
			}
	    	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	    @Then("click on add option")
	    public void click_on_add_option() {
	    	waits();
	    //driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        adpg.clickOnAd();
	    }
	    @Then("User enter job information")
	    public void user_enter_job_information() {waits();
	    	
			//driver.findElement(By.xpath("//label[text()='Job Title']//ancestor::div/div/div/input")).sendKeys("Abc@123456");
			adpg.jobTtlName();
			//driver.findElement(By.xpath("//label[text()='Job Description']//ancestor::div/div/div/textarea")).sendKeys("Abc@123456");
			adpg.jobDescript();
			//driver.findElement(By.cssSelector("[type=\"file\"]")).sendKeys("C:\\Users\\SOUMIPRA\\Downloads\\java basic.png");
			adpg.uploadFile();
			//driver.findElement(By.xpath("//label[text()='Note']//ancestor::div/div/div/textarea")).sendKeys(" hukhghaf awefahdvjh awmjhcgukwsgf mjhvswjhefds");
			adpg.noteArea();
	        
	    }

	    @Then("click on save option")
	    public void click_on_save_option() throws Exception {waits();

	    	Thread.sleep(3000);
			//driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
			adpg.svBtn();
	    }
	    
	    
	    ///organization////
	    
	    @When("click on Organization Item")
	    public void click_on_organization_item() {
	    	
	    	act.moveToElement(adpg.oranizationItem()).click().perform();
	    }

	    @When("click on General Information Item")
	    public void click_on_general_information_item() {
	    	List<WebElement> status= adpg.generalInformation();
	    	try {
				Thread.sleep(3000);
			
			
			 for(WebElement ele: status)
				 
			{
			if(ele.getText().toLowerCase().contains("general"))
			 { act.moveToElement(ele).click().perform();
			  break;}
			 }}
			 catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
	    }}

	    @Then("click on edit option")
	    public void click_on_edit_option() {
	    	 adpg.editOption();;
	    }

	    @When("User edit the general Information")
	    public void user_edit_the_general_information() {
	    	threadWait();
	    	adpg.orgName();threadWait();
	    	adpg.regNumber();threadWait();
	    	adpg.taxId();threadWait();
	    	adpg.phNum();threadWait();
	    	adpg.Email();threadWait();
	    	adpg.enterAddress();threadWait();
	    	adpg.enterState();threadWait();
	    	adpg.postalCode();threadWait();
	    	adpg.selectCountry();threadWait();
	    	 List<WebElement> con=adpg.countryName();
	    	 threadWait();
	    	 for(WebElement ele: con)
	    	{
	    	 if(ele.getText().toLowerCase().contains("algeria"))
	    	 act.moveToElement(ele).click().perform();
	    	}
	    	 threadWait();
	    	 adpg.noteAreaa();
	    }

	    @When("click save")
	    public void click_save() {
	      adpg.saVe(); 
	    }

}
