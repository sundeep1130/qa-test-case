package com.apple.pages;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Events {

	protected WebDriver driver;

	public Events(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private static final int ELEMENT_WAIT_TIMEOUT_IN_SECONDS = 10;

	private static final int PAGE_WAIT_TIMEOUT_IN_SECONDS = 60;

	protected boolean isElementPresent(final By by) {
		return this.driver.findElements(by).size() > 0;
	}

	protected boolean isElementPresent(final WebElement element) {
		try {
			element.getTagName();
		} catch (final NoSuchElementException ignored) {
			return false;
		} catch (final StaleElementReferenceException ignored) {
			return false;
		}
		return true;
	}

	protected boolean isElementVisible(final By by) {
		return this.driver.findElement(by).isDisplayed();
	}

	protected boolean isElementVisible(final WebElement element) {
		return element.isDisplayed();
	}

	protected void waitForElement(final WebElement element) {
		this.waitForElement(element, ELEMENT_WAIT_TIMEOUT_IN_SECONDS);
	}

	protected void waitForElement(final WebElement element, final int timeoutInSeconds) {
		final WebDriverWait wait = new WebDriverWait(this.driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	protected void waitForElement(final By by) {
		waitForElement(by, ELEMENT_WAIT_TIMEOUT_IN_SECONDS);
	}

	protected void waitForElement(final By by, final int timeoutInSeconds) {
		final WebDriverWait wait = new WebDriverWait(this.driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	protected void waitForElementIsInvisible(final By by) {
		final WebDriverWait wait = new WebDriverWait(this.driver, ELEMENT_WAIT_TIMEOUT_IN_SECONDS);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	protected void waitForTextToAppear(final String textToAppear, final WebElement element) {
		final WebDriverWait wait = new WebDriverWait(this.driver, ELEMENT_WAIT_TIMEOUT_IN_SECONDS);
		wait.until(ExpectedConditions.textToBePresentInElement(element, textToAppear));
	}

	protected void waitForUrlPart(final String urlPart) {
		final WebDriverWait wait = new WebDriverWait(this.driver, ELEMENT_WAIT_TIMEOUT_IN_SECONDS);
		wait.until(ExpectedConditions.urlContains(urlPart));
	}

	public void waitForPageLoad(final int timeoutInSeconds) {
		waitForElement(By.tagName("html"), timeoutInSeconds);
	}

	protected String xpathFinder(final String... xpathList) {
		for (final String xpath : xpathList) {
			if (isElementPresent(By.xpath(xpath))) {
				return xpath;
			}
		}
		return null;
	}

	protected JavascriptExecutor highlightElementPermanently(final WebElement element) {
		final JavascriptExecutor js = (JavascriptExecutor) this.driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		return js;
	}

	public void pageScrollDown(WebDriver driver) {
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,1000)"); //Scroll vertically down
		// by 1000 pixels
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // This
																			// will
																			// scroll
																			// the
																			// web
																			// page
																			// till
																			// end.
	}

//	public void takeScreenshot(final String path) {
//		final File scrFile = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(scrFile, new File(path));
//		} catch (final IOException e) {
//			throw new RuntimeException(e);
//		}
//	}

	public boolean isAlertPresent() {
		try {
			final Alert alert = this.driver.switchTo().alert();
			alert.getText();
		} catch (final NoAlertPresentException nape) {
			return false;
		}
		return true;
	}

	public String getAlertText() {
		final Alert alert = this.driver.switchTo().alert();
		return alert.getText();
	}

	public void acceptAlert() {
		final Alert alert = this.driver.switchTo().alert();
		alert.accept();
	}

	public void dismissAlert() {
		final Alert alert = this.driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void switchWindow(final String url) {
		String currentHandle = null;
		final Set<String> handles = this.driver.getWindowHandles();
		if (handles.size() > 1) {
			currentHandle = this.driver.getWindowHandle();
		}
		if (currentHandle != null) {
			for (final String handle : handles) {
				this.driver.switchTo().window(handle);
				if (this.driver.getCurrentUrl().contains(url) && !currentHandle.equals(handle)) {
					break;
				}
			}
		} else {
			for (final String handle : handles) {
				this.driver.switchTo().window(handle);
				if (this.driver.getCurrentUrl().contains(url)) {
					break;
				}
			}
		}
	}
	
	
	public void waitForPageLoad() {
		tillPageLoad();
	}

	public void tillPageLoad() {
		final WebDriverWait wait = new WebDriverWait(this.driver, PAGE_WAIT_TIMEOUT_IN_SECONDS);
		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver wdriver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		});
	}

	public void click(WebElement element) {
		waitForPageLoad();
		waitForElement(element);
		element.click();
	}
	
	public void actionClick(WebElement element) {
		waitForPageLoad();
		waitForElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}
	
	
	public void doubleClick(WebElement element){
		waitForPageLoad();
		waitForElement(element);	
		final Actions actions = new Actions(this.driver);
		actions.doubleClick(element).build().perform();
	}
	
	public void setValue(WebElement element, String input){
		waitForPageLoad();
		waitForElement(element);
		element.sendKeys(input);
	}
	
	public String getTextFromElement(WebElement element){
		waitForElement(element,ELEMENT_WAIT_TIMEOUT_IN_SECONDS);
		return element.getText();
	}

}
