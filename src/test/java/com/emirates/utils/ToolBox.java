package com.emirates.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.emirates.config.BrowserConfig;

public abstract class ToolBox {
	private static final WebDriver browser = BrowserConfig.getBrowserConfig();
	private static final WebDriverWait wait = new WebDriverWait(browser, 100);
	private static final Element element = new Element(browser,wait);
	private static final Navigate navigate = new Navigate(browser,wait);

	
	public static Element getElementTool() {
		return element;
	}
	
	public static Navigate getNavigateTool() {
		return navigate;
	}
	

}
