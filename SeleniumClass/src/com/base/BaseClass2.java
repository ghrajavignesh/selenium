package com.base;

import java.io.File;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass2 {

	public static WebDriver driver; // webdriver interface to initialize & static without creating object

	public static WebDriver initializeBrowser(String browser) {

			System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");

		 driver = new ChromeDriver();

		//driver.get("https://www.ticketnew.com/Movie-Ticket-Online-booking/C/Chennai");
		 driver.get("https://www.spicinemas.in/");
		 driver.manage().window().maximize();

		return driver;
	}

	public static void launchApp(String url) {
		try {
			
			driver.get(url);
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
public static void enterText(WebElement element, String value) {

	try {
		
		visiblityofElement(element);
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


public static void screenshot(String name) {
	
	try {
	
			TakesScreenshot ts = (TakesScreenshot)driver; // takesscreenshot-interface is typecasting

			File x = ts.getScreenshotAs(OutputType.FILE);

			File x1 = new File("D:\\Screenshot\\"+name+".png");
	
			FileUtils.copyFile(x, x1);
			
	}catch (Exception e) {
		System.out.println(e.getStackTrace());

	}
}

	public static void visiblityofElement(WebElement element) {
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
	
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

	public static void mouseHov(WebElement element) {
		try {
			
		Actions aa=new Actions(driver);
		aa.moveToElement(element);
		
		}catch (Exception e) {
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
//	}
//	
	
	public static void radio(WebElement element) {

		element.click();
		
		
	}
	



}


