package com.scrolls;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollsUD {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/guru99home/");

		// syntax for scrolls
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("widow.scrollBy(0,1000)");            //syntax for Scrollby()
	}
}

