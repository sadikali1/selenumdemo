package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

	private WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String userName, String pass) {
		driver.findElement(By.cssSelector("[id=\"email\"]")).sendKeys(userName);
		driver.findElement(By.cssSelector("[id=\"cartSignInPassword\"]")).sendKeys(pass);
		driver.findElement(By.cssSelector("[data-automation-id=\"at-sign-in-button\"]")).click();
	}
	
	public void createAccount(String firstName, String lastName, String phone) {
		driver.findElement(By.cssSelector("[data-automation-id=\"at-create-account-button\"]")).click();
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		driver.findElement(By.id("phone")).sendKeys(phone);
	}
}
