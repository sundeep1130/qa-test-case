package com.apple.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Events{
	
	
	
	public HomePage(WebDriver driver)	 {	
		super(driver);
		 this.driver = driver;
	} 
	
	//******************Page Elements******************
	
	@FindBy(xpath = "//a[@class='ac-gn-link ac-gn-link-mac']")
	WebElement mac;
	
	@FindBy(xpath = "//a[@id='ac-gn-firstfocus']")
	WebElement home;
	
	//******************Page Methods******************
	
	/**
	*	Description : 
	*	Arguments	: 
	*	return 		: 
	*/
	public void navigateToHomePage() {
		click(home);
	}
	
	
	/**
	*	Description : navigates to macbook products page
	*	Arguments	: 
	*	return 		: 
	*/
	public void navigateToMacBookPage(){
		click(mac);
	}
}
