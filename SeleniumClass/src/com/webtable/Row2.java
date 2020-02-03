package com.webtable;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Row2 {
	
	public static void main(String[] args) throws Throwable {
		System.out.println("enter the value");
		Scanner s = new Scanner(System.in);
		String b = s.nextLine();
		System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		

		driver.get("https://www.toolsqa.com/automation-practice-table/");

		//Thread.sleep(40000);

		WebElement table = driver.findElement(By.tagName("table"));

		WebElement tbody = table.findElement(By.tagName("tbody"));

		List<WebElement> tr = tbody.findElements(By.tagName("tr"));
		List<WebElement> td = tr.get(1).findElements(By.tagName("td"));  // indicating corresponding row
		
		for (WebElement x : td) {
			System.out.println(x.getText());
		}
		 }

}



