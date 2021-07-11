package com.framework.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;
	
	@BeforeClass
	public void setup() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = Configuration.getConfig("Url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}	
	
}
