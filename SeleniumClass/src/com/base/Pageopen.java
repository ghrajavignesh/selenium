package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pageopen extends Baseclass {

	public static void main(String[] args) throws Throwable {

		driver = initializeBrowser("chrome");

		launchapp("https://www.ticketnew.com/Movie-Ticket-Online-booking/C/Chennai");
	
		WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Log In/Sign Up')]"));
		login.click();
		
		
		
	}
}
