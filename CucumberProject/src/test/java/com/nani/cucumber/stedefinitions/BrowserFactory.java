package com.nani.cucumber.stedefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	private WebDriver driver;
	
	private static BrowserFactory instance;
	
	private BrowserFactory()
	{
		
	}

	public static BrowserFactory getInstance()
	{
		if(instance == null)
		{
			return instance = new BrowserFactory();
		}
		
		return instance;
	}
	
	public WebDriver getDriverInstance()
	
	{
		if (driver == null) {
						
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gnane\\Downloads\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}
}
