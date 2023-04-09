package Utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class ReadCon {
	//Properties properties;
	Properties properties;
	
	public ReadCon()
	{
		properties=new Properties();
		
	
		 
		 try {
			 
			String sc=System.getProperty("environment");	
			FileInputStream  fis = new FileInputStream(sc+"_Config.properties");
			properties.load(fis);
			 



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBr()
	{
		String brsr = properties.getProperty("browser");
		if(brsr!=null)
			return brsr;
		else
			throw new RuntimeException("browser not found in the specific file");

	}
	public String getUrl()
	{
		String ur = properties.getProperty("url");
		if(ur!=null)
			return ur;
		else
			throw new RuntimeException("url not found in the specific file");

	}
	public String getPath()
	{
		String pth=properties.getProperty("path");
		if(pth!=null)
			return pth;
		else
			throw new RuntimeException("path not found in the specific file");

	}
	public String getTitle1()
	{
		String ttl1=properties.getProperty("ex1Ttl");
		if(ttl1!=null)
			return ttl1;
		else
			throw new RuntimeException("title not found in the specific file");

	}
	public String getText1()
	{
		String text1=properties.getProperty("text1");
		if(text1!=null)
			return text1;
		else
			throw new RuntimeException("text not found in the specific file");

	}
	public String getText2()
	{
		String text2=properties.getProperty("text2");
		if(text2!=null)
			return text2;
		else
			throw new RuntimeException("text not found in the specific file");

	}
	public void getText()
	{
		String text=properties.getProperty("text");
		if(text!=null)
			System.err.println(text);
		else
			throw new RuntimeException("text not found in the specific file");

	}
	
}
