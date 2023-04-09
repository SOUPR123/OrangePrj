package Cucum;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PgObject.LginPage;
import Utilities.JsonReader;
import Utilities.ReadCon;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDf extends BaseCl {
	
	
	@Before
	public void setUp()
	{ 
		jreader=new JsonReader();
		
		read=new ReadCon();
		read.getText();
		String browser=read.getBr();
		String brows=browser.toLowerCase();
		if(brows.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		else if(brows.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if(brows.equals("msedge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		else
		{
			driver=null;
		System.out.println("browser not set up");
		}
		 
		
	}

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		lgpg=new LginPage(driver);
	    
	}

	@When("User opens URL")
	public void user_opens_url() {
		read=new ReadCon();
		driver.get(read.getUrl());
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String FileName, String Key) throws FileNotFoundException, IOException, ParseException {
//		jreader.add_json_file_for_cred(FileName, Key);
	lgpg.enterUserName(jreader.add_json_file_for_cred(FileName, Key,"id"));
	lgpg.enterPassword(jreader.add_json_file_for_cred(FileName, Key,"password"));
	}

	@When("Click on Login")
	public void click_on_login() {
		lgpg.clickOnLoginButton();
	}
	@Then("Page Title should be {string}")
	public void page_title_should_be(String Expected) {
		 String Actual=driver.getTitle();
			
			if(Actual.equals(Expected))
			{
				
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
	}

	@Then("click on Logout link")
	public void click_on_logout_link() {
		lgpg.clickOnLogOutButton();
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

	@Then("User can view a message {string}")
	public void user_can_view_a_message(String msge) {
		//String tagText=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
		String tagText=lgpg.messAge();
		if(tagText.contains(msge))
		{
		
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	   
	}
	
	
	@After
	public void tearDown(Scenario scn) throws IOException
	{
		if(scn.isFailed()==true)
		{
			
			String paths=read.getPath();
			TakesScreenshot sc=((TakesScreenshot)driver);
			File scFile=sc.getScreenshotAs(OutputType.FILE);
			File destFile=new File(paths);
			try {
			FileUtils.copyFile(scFile, destFile);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		driver.quit();
	}
}
