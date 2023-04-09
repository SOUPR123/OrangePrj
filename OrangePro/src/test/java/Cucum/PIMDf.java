package Cucum;

import org.junit.Assert;

import PgObject.AdminPage;
import PgObject.PIMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMDf extends BaseCl {
	PIMPage pg=new PIMPage(driver);
	@When("User click on PIM Menu")
	public void user_click_on_pim_menu() {
		
	    pg.getPIMitem();
	}

	@And("click on Add  button")
	public void click_on_add_button() {
		threadWait();
	    pg.addBtn();
	}

	@Then("User can view PIM page")
	public void user_can_view_pim_page() {
		threadWait();
		String actText=pg.getviewpageTitle();
		String expText=read.getText2();
		if(actText.equals(expText))
		{
			Assert.assertTrue(true);
		}
		else
		{
			
		}
	}

	@And("User enter employee information")
	public void user_enter_employee_information() {
		threadWait();
		pg.sendFirstName();
		threadWait();
		pg.sendLastName();
		
	   
	}

	@When("click on Save option")
	public void click_on_save_option() {
		threadWait();
		pg.addBtn();
	    
	}

}
