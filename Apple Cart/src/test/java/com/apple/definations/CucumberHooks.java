package com.apple.definations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.test.base.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class CucumberHooks extends TestBase{

	final static Logger logger = Logger.getLogger(CucumberHooks.class);
	
	public static WebDriver driver;
	private Scenario scenario;
	
	
	@Before
	public void setUp(Scenario scenario) {	
		PropertyConfigurator.configure("log4j.properties");
		logger.info("***************************************************************"); 
		logger.info("** Feature : " +  scenario.getId().split(";")[0] ); 
		logger.info("** Scenario: " + scenario.getName()); 
		logger.info("***************************************************************"); 
		

	}

	@After
	public void tearDown(Scenario scenario) {

		logger.info("---------------------------------------------------------- ");
		logger.info(" Scenario status : " + scenario.getStatus()); 
		logger.info("---------------------------------------------------------- ");
	
	}
	

}
