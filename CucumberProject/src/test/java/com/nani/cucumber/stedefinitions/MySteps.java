package com.nani.cucumber.stedefinitions;

import com.nani.cucumber.pages.HomePage;
import com.nani.cucumber.pages.LoginPage;
import com.nani.cucumber.stedefinitions.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class MySteps {

	public WebDriver driver;
	
	public LoginPage lp;
	public HomePage hp;
	
	@Given("I choose to login {string}, {string}")
	public void i_choose_to_login(String string, String string2) throws InterruptedException {
		
		driver = BrowserFactory.getInstance().getDriverInstance();
		driver.get("https://jpetstore.aspectran.com/account/signonForm");
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
		lp.loginScreen(string,string2);
		Thread.sleep(2000);
	    
	}	

	@When("^I Enter to the Homescreen and click on PetClinic$")
	public void i_enter_to_the_Homescreen_and_click_on_PetClinic() throws Throwable
	{
		hp = new HomePage(driver);
		hp.clickOnPetClinicOption();
	}
	
	@Then("I choose Veternarians$")
	public void i_choose_veternarians() 
	{
	   
	}
	
//	@Given("I choose to login {string}, {string}")
//	public void i_choose_to_login(String string, String string2) throws InterruptedException {
//		//driver = BrowserFactory.getInstance().getDriverInstance();
//		//driver.get("https://jpetstore.aspectran.com/account/signonForm");
//		//driver.manage().window().maximize();
//		lp = new LoginPage(driver);
//		lp.loginScreen(string,string2);
//		Thread.sleep(2000);
//	}
//	@When("I Enter to the Homescreen and click on PetClinic")
//	public void i_enter_to_the_homescreen_and_click_on_pet_clinic() throws Throwable {
//		hp = new HomePage(driver);
//		hp.clickOnPetClinicOption();
//	}
//	@Then("I choose Veternarians")
//	public void i_choose_veternarians() {
//	    
//	}
}
	

