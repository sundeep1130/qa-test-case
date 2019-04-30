package com.test.base;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apple.pages.BagPage;
import com.apple.pages.HomePage;
import com.apple.pages.MacProductsPage;
import com.apple.pages.MacbookProPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.PropertyConfigurator;



public class TestBase {
	
	
	public static WebDriver driver = null;	
	public static WebDriverWait wait = null;
	public static Properties prop;
	private FileInputStream is;
	protected HomePage homepage;
	protected MacbookProPage macbookPro;
	protected MacProductsPage macbookProd;
	protected BagPage bag;
	
	protected TestBase() {
		try {
			prop = new Properties();
			File file = new File(getClass().getClassLoader().getResource("config.properties").getFile());
			is = new FileInputStream(file);
			prop.load(is);
		} catch (IOException ex) {
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Initialize Driver.
	 */
	protected WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			PropertyConfigurator.configure("log4j.properties");
			driver = new ChromeDriver();
//			Events events = new Events(driver);
			
			String waitTime = "30";
			driver.manage().timeouts().implicitlyWait(Long.parseLong(waitTime), TimeUnit.SECONDS);
			driver.manage().window().setPosition(new Point(0, 0));
			driver.manage().window().maximize();

		}
		return driver;
	}
	
	
	protected WebDriverWait getDriverWait() {
		if (wait == null) {
			//Explicit Wait + Expected Conditions
			wait=new WebDriverWait(driver, 120);
		}
		return wait;
	}
	
	protected HomePage getHomePage() {
		if (homepage == null) {
			homepage=new HomePage(driver);
		}
		return homepage;
	}
	
	protected MacbookProPage getMacBookPro() {
		if (macbookPro == null) {
			macbookPro=new MacbookProPage(driver);
		}
		return macbookPro;
	}
	
	
	
	protected MacProductsPage getMacBookProducts() {
		if (macbookProd == null) {
			macbookProd=new MacProductsPage(driver);
		}
		return macbookProd;
	}
	
	protected BagPage getBagPage() {
		if (bag == null) {
			bag=new BagPage(driver);
		}
		return bag;
	}
	
	public void tearDown() {
		quitDriver();
	}

	/**
	 * Read Properties.
	 */
	protected static String getPropertyValue(String PropertyKey){
		Properties props=null;
		FileInputStream fin =null;
		String PropertyValue = null;

		try {
			File f = new File(System.getProperty("user.dir")+File.separator+"config"+File.separator+"env.properties");
			fin = new FileInputStream(f);
			props = new Properties();
			props.load(fin);
			PropertyValue = props.getProperty(PropertyKey);
		} catch(Exception e){
			System.out.println(e.getMessage());
		} 

		return PropertyValue;
	}


	/**
	 * Quit Driver.
	 */
	public static void quitDriver() {
		driver.quit();
		driver = null;

	}

}
