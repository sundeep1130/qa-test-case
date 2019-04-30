package com.apple.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacProductsPage extends Events{

	public MacProductsPage(WebDriver driver) {	
		super(driver);
	} 
	
	//******************Page Elements******************
	
	@FindBy(xpath = "//li[@class='chapternav-item chapternav-item-macbook-pro']")
	WebElement macBookPro;
	
	
	
	//******************Page Methods******************
	
	/**
	*	Description : 
	*	Arguments	: 
	*	return 		: 
	*/
	public void navigateToMacBookPro() {
		click(macBookPro);
	}
}
