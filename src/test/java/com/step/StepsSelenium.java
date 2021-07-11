package com.step;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.pagefactory.HomePage;
import com.pages.CartPage;
import com.pages.ProductDetailPage;
import com.pages.SignInPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsSelenium {

	///private WebDriver driver;
	String product = "Sharper Image Wireless QI Charging Speaker Dock";
	
	@Given("I launch browser and navgated base url")
	public void i_launch_browser_and_navgated_base_url() throws IOException {		
		Hooks.getDriver().manage().window().maximize();
		Hooks.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("I searched product at home page")
	public void i_searched_product_at_home_page() {
		HomePage homePage = PageFactory.initElements(Hooks.getDriver(), HomePage.class);
		homePage.search(product);
	}

	@Then("I verify product at product details page")
	public void i_verify_product_at_product_details_page() {
		ProductDetailPage productDetailsPage = PageFactory.initElements(Hooks.getDriver(), ProductDetailPage.class);
		productDetailsPage.verifyProduct(product);	
		productDetailsPage.clickAddToCart();
	}

	@When("I click on checkout button")
	public void i_click_on_checkout_button() {
		ProductDetailPage productDetailsPage = PageFactory.initElements(Hooks.getDriver(), ProductDetailPage.class);	
		productDetailsPage.clickAddToCart();
	}

	@When("I proceed checkout at cart page")
	public void i_proceed_checkout_at_cart_page() {
		CartPage cartPage = PageFactory.initElements(Hooks.getDriver(), CartPage.class);
		cartPage.verifyProduct(product);
		cartPage.checkOut();
	}

	@When("I click on guest button")
	public void i_click_on_guest_button() {
		SignInPage singnInPage = PageFactory.initElements(Hooks.getDriver(), SignInPage.class);
		//singnInPage.clickOnGuestButton();
	}

	@When("I fill guest user detail")
	public void i_fill_guest_user_detail() {
		//ShippingPage shippingPage = PageFactory.initElements(Hooks.getDriver(), ShippingPage.class);
		//shippingPage.fillGuestDetails("FName" ,"LName" , "Comp" ,"Address1");
	}
	

	@When("I enter user name {string} and password {string}")
	public void i_enter_user_name_and_password(String userName, String password) {
		SignInPage singnInPage = PageFactory.initElements(Hooks.getDriver(), SignInPage.class);
		singnInPage.login(userName ,password);
	}
	
	
	@Then("I verify checkout completed")
	public void i_verify_checkout_completed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	
	@When("I searched {string} product at home page")
	public void i_searched_product_at_home_page(String product1) {
		HomePage homePage = PageFactory.initElements(Hooks.getDriver(), HomePage.class);
		homePage.search(product1);
	}
	
	
	@Then("I verify {string} product at product details page")
	public void i_verify_product_at_product_details_page(String product) {
		ProductDetailPage productDetailsPage = PageFactory.initElements(Hooks.getDriver(), ProductDetailPage.class);
		productDetailsPage.verifyProduct(product);	
	}
	
	@When("I created new user for checkout")
	public void i_created_new_user_for_checkout() {
		
	}

}
