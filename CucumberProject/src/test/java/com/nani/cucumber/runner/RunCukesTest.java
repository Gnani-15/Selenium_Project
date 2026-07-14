package com.nani.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = { "src/test/resources/Features/Login.feature" },
		glue = { "com.nani.cucumber.stepdefinitions" }, 
		tags="",
		plugin = {
				"pretty",
				"json:target/cucumber.json",
			    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
	monochrome = true	
	)

public class RunCukesTest extends AbstractTestNGCucumberTests{

}
