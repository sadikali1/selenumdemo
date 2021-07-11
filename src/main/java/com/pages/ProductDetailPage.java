package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductDetailPage {

	private WebDriver driver;
	
	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyProduct(String product) {
		String text = driver.findElement(By.cssSelector("[id='productTitle-false']")).getText();
		Assert.assertEquals(product, text);
	}
	
	public void clickAddToCart() {
		driver.findElement(By.cssSelector("p[data-automation-id='addToCart']")).click();
	}
	
	public void viewCart(String product) {
		String titleProduct  = driver.findElement(By.cssSelector("[data-automation-id=\"ocProductTitle\"] > span")).getText();
		Assert.assertEquals(product, titleProduct);
		
		driver.findElement(By.cssSelector("[data-automation-id=\"at-panel-checkout-button\"]")).click();
	}
}
