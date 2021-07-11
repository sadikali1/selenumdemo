package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void search(String product) {
		// enter text into search input box
		WebElement element = driver.findElement(By.id("searchInputId"));
		element.clear();
		element.sendKeys(product);
		 
		driver.findElement(By.xpath("//button[@title=\"search\"]")).click();
	}

}
