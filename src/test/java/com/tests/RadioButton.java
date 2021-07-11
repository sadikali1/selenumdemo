package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	@Test
	public void DragAndDropTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoqa.com/radio-button");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[for=\"yesRadio\"]"))));
		WebElement element = driver.findElement(By.cssSelector("[for=\"yesRadio\"]"));
		WebElement elementCheckBox = driver.findElement(By.id("yesRadio"));
		System.out.println(elementCheckBox.isSelected());
		element.click();
		System.out.println(elementCheckBox.isSelected());
		
	}
}
