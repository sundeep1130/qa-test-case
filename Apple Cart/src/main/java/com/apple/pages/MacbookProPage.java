package com.apple.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MacbookProPage extends Events{

	
	public MacbookProPage(WebDriver driver) {	
		super(driver);
	} 
	
	//******************Page Elements******************
	
	@FindBy(xpath = "//a[ contains(text(), 'Buy')]")
	WebElement buy;
	
	@FindBy(xpath = "//div[@class='as-macbtr-options acc_MR972B/A rs-noAnimation as-bundleselection-modelshown']//span[@class='label']")
	WebElement select512Storage;
	
	@FindBy(xpath = "(//BUTTON[@type='submit'])[11]")
	WebElement select256Storage;
	
	@FindBy(xpath = "//button[@name='add-to-cart']")
	WebElement addToBag;
	
	@FindBy(xpath = "//BUTTON[@aria-describedby='usbCtousbGridGroup_async_labelledby']")
	WebElement usbCToUsbAdapter;
	
	@FindBy(xpath = "//SPAN[@class='label'][text()='Review Bag']/self::SPAN")
	WebElement reviewBag;
	
	//******************Page Methods******************
	
	/**
	*	Description : 
	*	Arguments	: 
	*	return 		: 
	*/
	public void clickBuyMacbookPro() {
		click(buy);
	}
	
	
	public void buyMacBookPro(){
		
		
	}
	
	public void selectLaptopSize(String inches){
		WebElement size = driver.findElement(By.xpath("//button[contains(text(), '"+ inches+ "')]"));
		click(size);
	}
	
	public void chooseMacbookPro(){
		click(select512Storage);
	}
	
	public void selectCustomiseOptions(String speficiation){
		WebElement specElement =  driver.findElement(By.xpath("//div[@class='form-element']//div[contains(text(), '"+ speficiation+ "')]"));
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", specElement); 
		click(specElement);
	}
	
	public void selectColor(){
		WebElement color = driver.findElement(By.xpath(("(//SPAN[@class='as-swatch'])[12]")));
		click(color);
	}
	
	public void selectPreInstalledSoftware(String software){
		WebElement preSoftware = driver.findElement(By.xpath("//div[@class='form-element']//div[contains(text(), '"+ software+ "')]"));
		click(preSoftware);
	}
	
	public void addToBag(){
		click(addToBag);
	}
	
	public void order(String screenSize, String color, String processor, String memory, String software){
		clickBuyMacbookPro();
		selectLaptopSize(screenSize);
		selectColor();
		chooseMacbookPro();
		selectCustomiseOptions(processor);
		selectCustomiseOptions(memory);
		selectCustomiseOptions(software);
		addToBag();
		click(usbCToUsbAdapter);
		click(reviewBag);
	}
}
