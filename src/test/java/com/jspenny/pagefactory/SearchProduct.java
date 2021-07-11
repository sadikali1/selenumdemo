package com.jspenny.pagefactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.framework.utils.BaseTest;
import com.pagefactory.HomePage;
import com.pages.ProductDetailPage;

public class SearchProduct extends BaseTest {

	String product = "Sharper Image Wireless QI Charging Speaker Dock";
	
	@Test
	public void search() {
		
		// search product
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.search(product);
		
		ProductDetailPage productDetailsPage =  PageFactory.initElements(driver, ProductDetailPage.class);
		productDetailsPage.verifyProduct(product);
	}
}
