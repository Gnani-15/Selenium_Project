package com.nani.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		   this.ldriver = rdriver;
		   PageFactory.initElements(rdriver ,this);
	}
	
	@FindBy(xpath="//a[@title='Sample applications built on Aspectran']")
	WebElement SamAppsdrp;
	
	@FindBy(xpath="//ul[@class='dropdown-menu show']//child::li[2]")
	WebElement PetClinicbtn;
    
	public void clickOnPetClinicOption() throws Throwable
	{
		SamAppsdrp.click();
		Thread.sleep(3000);
		
		System.out.println("Clicked on SampleApps");
		
		PetClinicbtn.click();
		
		System.out.println("Clicked on PetClinic Demo");
		
	}
}
