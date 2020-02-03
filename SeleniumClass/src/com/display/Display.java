package com.display;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {

	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		//WebDriverWait wb = new WebDriverWait(driver, 10);
		//wb.until(ExpectedConditions.visibilityOf(email));
		boolean displayed = email.isDisplayed();
		boolean enabled = email.isEnabled();
		if (displayed&& enabled) {
			email.clear();
			email.sendKeys("hello");
		}
		String attribute = email.getAttribute("value");
		
		WebElement radio = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		radio.click();
		
		boolean selected = radio.isSelected();
		System.out.println(selected);
		
		
	
	}

	
	
}
