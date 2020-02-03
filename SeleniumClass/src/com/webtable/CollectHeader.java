package com.webtable;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectHeader {
	public static void main(String[] args) throws Throwable {
		System.out.println("enter the value");
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		System.setProperty("webdriver.chrome.driver", "D:\\Java 2\\SeleniumClass\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		driver.get("https://www.toolsqa.com/automation-practice-table/");

		WebElement table = driver.findElement(By.tagName("table"));

		WebElement tbody = table.findElement(By.tagName("tbody"));

		List<WebElement> tr = tbody.findElements(By.tagName("tr"));

		for (int i = 0; i < tr.size(); i++) {
			List<WebElement> th = tr.get(i).findElements(By.tagName("th"));
			List<WebElement> td = tr.get(i).findElements(By.tagName("td"));

			for (int k = 0; k < th.size(); k++) {
				String text = th.get(k).getText();

				for (int j = 0; j < td.size(); j++) {
					if (text.equals(b)) {
						System.out.println(td.get(j).getText());
					}
				}

			}

		}

	}
}