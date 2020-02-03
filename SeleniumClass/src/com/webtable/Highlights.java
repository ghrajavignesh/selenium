package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlights {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Syntax for highlighting the text in browser
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2 px solid red;');", gmail);
	}
	
	
	
	
	}
