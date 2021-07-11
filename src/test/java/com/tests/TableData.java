package com.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableData {

	@Test
	public void DragAndDropTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoqa.com/webtables");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"rt-tbody\"]/div/div/div[4]"));
		
		boolean status = false;
		for(WebElement element : elements) {			
			String email = element.getText();
			if(email != null && email.equals("kierra@example.com"))
				status = true;
			System.out.println(element.getText());
		}
		
		Assert.assertTrue(status, "Email kierra@example.com not exist");
	}
}
