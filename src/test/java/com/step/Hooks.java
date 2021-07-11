package com.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.framework.utils.Configuration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	private static WebDriver driver;

	@Before
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = Configuration.getConfig("Url");
		System.out.println(url);
		driver.navigate().to(url);
	}

	@BeforeStep
	public void setUpSteps() throws Exception {
		System.out.println("Executed Steps");
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@BeforeStep
	public void setUpAfterSteps() throws Exception {
		System.out.println("Executed After Steps");
	}
	

	public static WebDriver getDriver() {
		return driver;
	}
}
