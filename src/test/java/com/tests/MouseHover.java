package com.tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	@Test
	public void windowHandle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoqa.com/menu");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//ul[@id='nav']/li[2]/a"));
		
		action.moveToElement(element)
			.moveToElement(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']")))
				.moveToElement(driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"))).click().build().perform();
		
	}
}
