package com.nani.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
     
	  public WebDriver ldriver;
	
	   public LoginPage(WebDriver rdriver)
	   {
		   this.ldriver = rdriver;
		   PageFactory.initElements(rdriver ,this);
	   }
	   
	   
	   @FindBy (xpath ="//input[@id='username']")
	   WebElement username;
	   
	   
	   @FindBy (xpath="//input[@id='password']")
	   WebElement pass;
	   
	   @FindBy (xpath="//button[@type='submit']")
	   WebElement btn;
	   
	   
	   public void loginScreen(String uname, String pwd)
	   {
		   try 
		     {
			   username.clear();
			   username.sendKeys(uname);
			   Thread.sleep(2000);
			   pass.clear();
			   pass.sendKeys(pwd);
			   Thread.sleep(2000);
			   Actions act = new Actions(ldriver);
			   act.scrollToElement(btn).perform();
			   btn.click();
			   System.out.println("Logged in to Application");
//			   String actual = "Aspectran";
//			   String title = ldriver.findElement(By.xpath("//div[@class='title-bar-center']//a")).getText();
//			   System.out.println(title);
			   
		     } 
		   	   catch (Exception e)
		     {
		       
			   System.err.println("login Failed");
		   
		     }
		   
	     }
	   
//	   public void logOut()
//	   {
//		   
//	   }
}
