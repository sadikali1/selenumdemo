package com.tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWindowHandle {
	
	@Test
	public void windowHandle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("tabButton")).click();
				
		String parentID = driver.getWindowHandle();
		
		Set<String> winIDs = driver.getWindowHandles();
		System.out.println(winIDs.size());
		
		for (String winId : winIDs) {
			driver.switchTo().window(winId);
			String title = driver.getTitle();
			
			if(title.equals("Google")) {
				break;
			}
			
		}
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
			
		driver.close();
		
		driver.switchTo().window(parentID);
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> winIDss = driver.getWindowHandles();
		System.out.println(winIDss.size());
				
		driver.quit();
	}

}
