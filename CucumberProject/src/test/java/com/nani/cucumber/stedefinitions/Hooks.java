package com.nani.cucumber.stedefinitions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks {
	
	public WebDriver driver;
	
	@Before
	public void beforemethod(Scenario scenario)
	{
	    driver = BrowserFactory.getInstance().getDriverInstance();
	    driver.get("https://jpetstore.aspectran.com/account/signonForm");
		driver.manage().window().maximize();
	}
	
	@AfterStep
	public void takeScreenshot(Scenario scenario) 
	{
		try {
			
	       byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	       String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
