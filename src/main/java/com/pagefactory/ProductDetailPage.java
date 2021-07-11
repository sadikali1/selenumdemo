package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDetailPage {

	private WebDriver driver;
	
	@FindBy(css="[id='productTitle-false']")
	private WebElement productTitle;
	
	@FindBy(id="p[data-automation-id='addToCart']")
	private WebElement addToCartElement;
	
	@FindBy(id="[data-automation-id=\"ocProductTitle\"] > span")
	private WebElement productTitle1;
	
	@FindBy(id="[data-automation-id='at-panel-checkout-button']")
	private WebElement checkOutButton;
	
	
	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyProduct(String product) {
		String text = productTitle.getText();
		Assert.assertEquals(product, text);
	}
	
	public void clickAddToCart() {
		addToCartElement.click();
	}
	
	public void viewCart(String product) {
		String titleProduct  = productTitle1.getText();
		Assert.assertEquals(product, titleProduct);
		
		checkOutButton.click();
	}
}
