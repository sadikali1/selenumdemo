package com.jspenny;

import org.testng.annotations.Test;

import com.framework.utils.BaseTest;
import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailPage;
import com.pages.SignInPage;

public class CheckOutWithExistingUser extends BaseTest {

	String product = "Sharper Image Wireless QI Charging Speaker Dock";
	
	@Test
	public void checkOutUsingExistingUser() {
		
		// search product
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
		
		
		// sign-in page
		SignInPage singInpage = new SignInPage(driver);
		singInpage.login("User@gmail.com", "Password");
	}
}
