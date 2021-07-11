package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.framework.utils.BaseTest;

public class JavaScriptExample extends BaseTest{

	@Test
	public void DragAndDropTest() {
				
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		//js.executeScript("document.getElementById('alertButton').click()");
		//js.executeScript("window.scroll(1000, 1000)");
		
		WebElement element= driver.findElement(By.id("alertButton"));
		js.executeScript("arguments[0].click()", element);
	}
}
