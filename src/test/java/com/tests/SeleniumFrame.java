package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFrame {

	@Test
	public void windowHandle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoqa.com/frames");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame2");
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		//String text1 = driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]/div")).getText();
		//System.out.println(text1);
	}

}
