package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Baseclass {

	public static WebDriver driver; // webdriver interface to initialize & static without creating object

	public static WebDriver initializeBrowser(String browser) {

		// if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

//		} else if (browser.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");
//
//			WebDriver driver = new FirefoxDriver();
//		}
		return driver;
	}

	public static void launchapp(String url) {

		driver.get(url);

	}

	public static void enterText(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {

			System.out.println(e.getStackTrace());
		}
	}

	public static void clickButton(WebElement element) {

		try {

			element.click();

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

	}

	public static void mouseHov(WebElement element) {
		try {
			element.click();
			Actions aa = new Actions(driver);
			aa.moveToElement(element).build().perform();
			aa.click();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

	}

	public static void dragdrop(WebElement drag, WebElement drop) {
		try {
			
			Actions dd = new Actions(driver);
			dd.dragAndDrop(drag, drop).build().perform();
			
				
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

	}
	
//	public static void dropdown(WebElement element) {
//		try {
//			
//			Select ss=new Select(element);
//			//ss.selectByVisibleText(arg0);
//		ss.selectByIndex(1);
//		}catch (Exception e) {
//			System.out.println(e.getStackTrace());
//		}
//		}
		
		
	public static void radio(WebElement element) {

		element.click();
		
		
	}
	
	
	

}
