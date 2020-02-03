package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mousehover extends Baseclass{
	
	public static void main(String[] args) {

		driver = initializeBrowser("chrome");

		launchapp("https://www.ticketnew.com/Movie-Ticket-Online-booking/C/Chennai");

		
		driver.findElement(By.xpath("//span[contains(text(),'Log In/Sign Up')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("ghrajavignesh@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("vigneshh");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for City']"));
		driver.findElement(By.xpath("(//a[contains(text(),'Chennai')][1])")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Movies')]")).click();
		WebElement basics = driver.findElement(By.xpath("//a[contains(text(),'Movies')]"));
		basics.click();
		Actions ac= new Actions(driver);
		ac.moveToElement(basics).build().perform();
		WebElement fc = driver.findElement(By.xpath("(//a[contains(text(),'Darbar')][1])"));
		fc.click();
		//driver.findElement(By.xpath("(//img[@alt='Darbar'][1]")).click();
		
		
		
		

		
	}
		

	

}
