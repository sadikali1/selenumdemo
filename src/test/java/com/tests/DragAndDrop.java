package com.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.utils.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	@Test
	public void DragAndDropTest() throws IOException {
		
		String url = Configuration.getConfig("Url1");
		System.out.println(url);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get(url+"/droppable");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		WebElement sourceElement =	driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement).build().perform();
		
		String text  = driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();
		Assert.assertEquals(text, "Dropped!");		
	}
	
	@Test
	public void DragAndDropAtPositionTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoqa.com/dragabble");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		WebElement sourceElement =	driver.findElement(By.id("dragBox"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(sourceElement, 100 , 200).build().perform();				
	}
}
