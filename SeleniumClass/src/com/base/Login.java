package com.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BaseClass2 {

	public static void main(String[] args) throws Throwable {

		driver = initializeBrowser("chrome");

		launchApp("https://www.ticketnew.com/Movie-Ticket-Online-booking/C/Chennai");
		
		//System.out.println(System.getProperty("user.dir"));      // to find the path

	clickButton(driver.findElement(By.xpath("//span[contains(text(), 'Log In/Sign Up')]")));	
	screenshot("login");
		

	enterText(driver.findElement(By.xpath("//input[@placeholder='Email ID']")), "ghrajavignesh@gmail.com");
	screenshot("email");
	
	enterText(driver.findElement(By.xpath("//input[@placeholder='Password']")), "vigneshh");
	screenshot("pass");	
	
	clickButton(driver.findElement(By.xpath("//input[@name='btnLogin']")));	
	screenshot("login");
	
	enterText(driver.findElement(By.xpath("//input[@placeholder='Search for City']")), "Chennai" );
	
	clickButton(driver.findElement(By.xpath("(//a[contains(text(),'Chennai')][1])")));
	
	clickButton(driver.findElement(By.xpath("//a[@href='/online-advance-booking/Movies/C/Chennai']")));
		//Thread.sleep(5000);
	clickButton(driver.findElement(By.xpath("//img[@src='https://img.ticketnew.com/tn/movie/20028/7.jpg?1965112&x-oss-process=image/resize,m_mfit,w_330,h_400/quality,q_80']")));
	
	clickButton(driver.findElement(By.xpath("//span[contains(text(), 'Sun')]")));
	
	clickButton(driver.findElement(By.xpath("(//div[@class='tn-entity-details'][1])")));
	
	clickButton(driver.findElement(By.xpath("(//a[contains(text(), '12:00 PM')][1])")));	
	
	
	clickButton(driver.findElement(By.xpath("(//div[@class='tn-button tn-button-continue'][1])")));
	
	clickButton(driver.findElement(By.xpath("//a[contains(text(),'I Accept')]")));
	
	
	}
}
