package Cucum;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import PgObject.LginPage;
import Utilities.JsonReader;
import Utilities.ReadCon;

public class BaseCl {
	public static  WebDriver driver;
	public LginPage lgpg;
	public static ReadCon read;
	public static JsonReader jreader;
	
	
	
	public static void waits()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public static void threadWait()
	{
		try {
			Thread.sleep(2000);
		}catch(Exception e)
		{
			
		}
	}

}
