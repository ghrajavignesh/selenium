package com.base;

import org.openqa.selenium.By;

public class test2 extends BaseClass2{
	
	public static void main(String[] args) throws Throwable {
		
		driver= initializeBrowser("chrome");
		
		launchApp("https://www.spicinemas.in//");
		
		clickButton(driver.findElement(By.xpath("(//a[contains(text(), 'Log In / Sign Up')][1])")));
		
		enterText(driver.findElement(By.id("userEmail")), "ghrajavignesh@gmail.com" );
		enterText(driver.findElement(By.id("userPassword")), "vigneshh");
		clickButton(driver.findElement(By.id("login_submit")));
	
//		//clickButton(driver.findElement(By.xpath("//span[@user-actions= 'login_clicked']")));
//		Thread.sleep(3000);
//		enterText(driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")), "bat");
//		clickButton(driver.findElement(By.xpath("//button[@type='submit']")));
//		clickButton(driver.findElement(By.xpath("//a[@title='CEAT Hitman Full Size Double Blade Poplar Cricket Bat - Advance Play Poplar Willow Cricket  Bat']")));
//		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
