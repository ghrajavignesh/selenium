package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
	
public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//driver.get("https://www.snapdeal.com/?utm_source=earth_brand_new&utm_campaign=brand_search&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=b,%2Bsnapdeal");
		
		
		
		WebElement ee = driver.findElement(By.xpath("//span[contains(text(), 'Mobile & Tablets')]"));
				ee.click();
				Thread.sleep(3000);
				Actions aa=new Actions(driver);
				aa.moveToElement(ee).build().perform();
				Thread.sleep(3000);
				WebElement fe = driver.findElement(By.xpath("(//span[contains(text(), 'Smartphones')])[1]"));
				fe.click();
}

}
