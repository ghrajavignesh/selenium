package com.base;

import java.sql.Driver;

import org.openqa.selenium.By;

public class Test extends Baseclass{

	public static void main(String[] args) throws Throwable {

		driver = initializeBrowser("chrome");

	//	launchapp("http://www.leafground.com/pages/mouseOver.html#");
	//	launchapp("http://www.leafground.com/pages/drop.html");
	//	launchapp("http://www.leafground.com/pages/Dropdown.html");
		launchapp("http://www.leafground.com/pages/radio.html");
		
		
//		mouseHov(driver.findElement(By.xpath("//a[contains(text(), 'TestLeaf Courses')]")));
//	Thread.sleep(5000);
//		mouseHov(driver.findElement(By.xpath("//a[contains(text(),'Selenium')]")));
//		Thread.sleep(5000);
	
	//dragdrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']")));
	
		
	//	dropdown(driver.findElement(By.id("dropdown1")));
	
	radio(driver.findElement(By.xpath("(//input[@value='0'][2])")));
		
		
	}	
}

