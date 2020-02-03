package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {
	public static void main(String[] args)throws Throwable{
		System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://www.google.co.in/");
				driver.manage().window().maximize();
				
				driver.get("https://www.toolsqa.com/automation-practice-table/");
				
				WebElement table = driver.findElement(By.tagName("table"));
				
				
				WebElement tbody = table.findElement(By.tagName("tbody"));
				
				List<WebElement> tr = tbody.findElements(By.tagName("tr"));
				
				
				// normal for loop
//				for (int i = 0; i < tr.size(); i++) {
//					List<WebElement> td = tr.get(i).findElements(By.tagName("td"));
//					for (int j = 0; j < td.size(); j++) {
//						System.out.println(td.get(j).getText());
//					}
//				}

			
				
				
				// enchance for loop concept
				for (WebElement x : tr) {
					List<WebElement> td = x.findElements(By.tagName("td"));
				
					for (WebElement x1 : td) {
						System.out.println(x1.getText());
					}
				}
				
				
				
				
}
}