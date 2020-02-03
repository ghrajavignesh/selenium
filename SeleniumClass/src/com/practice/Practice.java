package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");
	
	WebDriver drive= new ChromeDriver();
	
	drive.get("https://www.google.co.in/");
	drive.manage().window().maximize();
	drive.get("https://www.facebook.com/");
	
	drive.navigate().back();
	
	drive.navigate().forward();
	
	drive.navigate().refresh();
	
	String title = drive.getTitle();
	System.out.println(title);
	
	String currentUrl = drive.getCurrentUrl();
	System.out.println(currentUrl);
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
