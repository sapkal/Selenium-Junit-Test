package com.emirates.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public Element(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public final WebElement getElement(String cssSelector) {
		By ele = null;
		if(cssSelector!= null) {
			ele = By.cssSelector(cssSelector);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
		}
		return driver.findElement(ele);
	}
	
	public final void enterInputTo(String cssSelector, String input) {
		getElement(cssSelector).sendKeys(input);
	}
	
	

}
