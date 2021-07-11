package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id="searchInputId")
	private WebElement searchInput;
	
	@FindBy(xpath="//button[@title=\"search\"]")
	private WebElement searchButton;
	
	
	public void search(String product) {
		searchInput.clear();
		searchInput.sendKeys(product);		 
		searchButton.click();
	}

}
