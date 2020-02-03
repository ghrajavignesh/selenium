package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPage {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement emailfield = driver.findElement(By.id("email"));
		emailfield.sendKeys("test@gamil.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		Thread.sleep(5000);
		driver.close();
		
	
		
		
		
		
	}
	
	
}
