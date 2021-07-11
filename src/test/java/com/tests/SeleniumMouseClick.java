package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMouseClick {

	@Test
	public void windowHandle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement buttonLocator = driver.findElement(By.id("doubleClickBtn"));
		
		Actions action = new Actions(driver);
		action.doubleClick(buttonLocator).build().perform();
		
		String str = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(str, "You have done a double click");
		
		
		WebElement element = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(element).build().perform();
		
		String text = driver.findElement(By.id("rightClickMessage")).getText();
		System.out.println(text);
		
		WebElement singleclickElement = driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(singleclickElement).build().perform();
		
		String text1 = driver.findElement(By.id("dynamicClickMessage")).getText();
		System.out.println(text1);
	}

}
