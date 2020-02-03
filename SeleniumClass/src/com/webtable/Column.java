package com.webtable;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Column {

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

		WebElement thead = table.findElement(By.tagName("thead"));

		List<WebElement> th = thead.findElements(By.tagName("th"));
		
		for (int i = 0; i <th.size() ; i++) {
			String text= th.get(i).getText();
		
		
		  if (text.equalsIgnoreCase(b)) {
		  
			  List<WebElement> tr = table.findElement(By.tagName("tbody")).findElements(By.tagName("tr")); 
		  
		 for (int j = 0; j < tr.size(); j++) { 
			 List<WebElement> td =tr.get(j).findElements(By.tagName("td")); 
		 
			 String text2 =td.get(i-1).getText(); 
			 System.out.println(text2);
		  }
		  }
		}
	
}
	}


		
