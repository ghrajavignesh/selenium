package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath {

	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		
		WebElement ee = driver.findElement(By.xpath("//span[contains(text(), 'Hello')]"));
				ee.click();
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
