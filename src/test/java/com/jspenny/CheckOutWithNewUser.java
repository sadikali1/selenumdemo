package com.jspenny;

import org.testng.annotations.Test;

import com.framework.utils.BaseTest;
import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailPage;
import com.pages.SignInPage;

public class CheckOutWithNewUser extends BaseTest{

	String product = "Sharper Image Wireless QI Charging Speaker Dock";
	
	@Test
	public void checkOut() {
		HomePage homePage = new HomePage(driver);
		homePage.search(product);
		
		ProductDetailPage productDetailsPage = new ProductDetailPage(driver);
		productDetailsPage.verifyProduct(product);
		
		productDetailsPage.clickAddToCart();		
		productDetailsPage.viewCart(product);
		
		// cart page		
		CartPage cartPage = new CartPage(driver);
		cartPage.verifyProduct(product);
		cartPage.checkOut();
		
		SignInPage signInPage = new SignInPage(driver);
		signInPage.createAccount("Test", "LastName", "86893689");
	}
}
