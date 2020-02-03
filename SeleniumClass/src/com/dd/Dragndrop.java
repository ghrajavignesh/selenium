package com.dd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {
	
	public static void main(String[] args)throws Throwable{
System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		//drag & drop - mouse action
		
		Actions aa=new Actions(driver);
		Thread.sleep(6000);
		
		aa.dragAndDrop(drag, drop).build().perform();
		
				
		
	}

}
