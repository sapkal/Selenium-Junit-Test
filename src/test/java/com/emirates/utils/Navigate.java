package com.emirates.utils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Navigate {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public Navigate(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public final void to(String urlToNavigate) {
		driver.navigate().to(urlToNavigate);
		wait.until(ExpectedConditions.urlContains(urlToNavigate));
		Assert.assertTrue(driver.getCurrentUrl().contains(urlToNavigate));
	}
}
