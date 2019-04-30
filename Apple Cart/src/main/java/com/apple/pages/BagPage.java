package com.apple.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BagPage extends Events{

	
			
			public BagPage(WebDriver driver) {	
				super(driver);
			} 
			
			//******************Page Elements******************
			
			@FindBy(xpath = "(//a[@data-autom='bag-item-name'])")
			List<WebElement> itemsList;
			
			@FindBy(xpath = "(//a[@data-autom='bag-item-name'])//following::p[1]")
			List<WebElement> itemsPriceList;
			
			@FindBy(xpath = "(//a[@data-autom='bag-item-name']) | (//a[@data-autom='bag-item-name'])//following::p[1]")
			List<WebElement> itemsListAndPrice;		
			
			@FindBy(xpath = "//DIV[@class='rs-tax-section']")
			WebElement taxPrice;
			
			@FindBy(xpath = "//DIV[@data-autom='bagrs-summary-totalvalue']")
			WebElement totalPrice;
			
			//******************Page Methods******************
			
			/**
			*	Description : 
			*	Arguments	: 
			*	return 		: 
			*/
			public Map<String,String> getPricesForAllItems() {
				Map<String,String> itemsPrices = new HashMap<String,String>();
				for(int i=0; i<itemsList.size(); i++){
					itemsPrices.put(itemsList.get(i).getText(), itemsPriceList.get(i).getText());	
				}
				return itemsPrices;
			}
			
			public String getTaxValue(){
				return taxPrice.getText();
			}
			
			public String getTotalValue(){
				return totalPrice.getText();
			}
			
			
}
