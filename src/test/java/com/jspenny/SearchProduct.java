package com.jspenny;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.utils.BaseTest;
import com.pages.HomePage;
import com.pages.ProductDetailPage;

public class SearchProduct extends BaseTest {

	String product = "Sharper Image Wireless QI Charging Speaker Dock";
	
	@Test
	public void search() {
		
		// search product
		HomePage homePage = new HomePage(driver);
		homePage.search(product);
		
		ProductDetailPage productDetailsPage = new ProductDetailPage(driver);
		productDetailsPage.verifyProduct(product);
	}
}
