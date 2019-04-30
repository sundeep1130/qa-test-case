package com.apple.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EssentialsProductsPage extends Events{

	
	public EssentialsProductsPage(WebDriver driver) {	
		super(driver);
	} 
	
	//******************Page Elements******************
	
	@FindBy(xpath = "//BUTTON[@aria-describedby='usbCtousbGridGroup_async_labelledby']")
	WebElement usbCToUsbAdapter;
	
	//******************Page Methods******************
	
	/**
	*	Description : 
	*	Arguments	: 
	*	return 		: 
	*/
	public void navigateToHomePage() {
		click(usbCToUsbAdapter);
	}
}
