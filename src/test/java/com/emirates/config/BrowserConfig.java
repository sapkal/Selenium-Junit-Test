package com.emirates.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * For the purpose of the demo we would be supporting only chromedriver.
 * 
 * @author ssapkal
 *
 */
public class BrowserConfig {

	private static WebDriver driver;
	
	private static BrowserConfig browserInstance;
	
	private static Thread CLOSE_THREAD = new Thread() {
		@Override
		public void run() {
			getBrowserConfig().quit();
		}
	};
	
	static {
		try {
			getBrowserInstance();
			setBrowserConfig();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
		}
		
	}
	public static BrowserConfig getBrowserInstance() {
		if(browserInstance == null) {
			browserInstance = new BrowserConfig();
		}
		return browserInstance;
	}
	
	public static void setBrowserConfig() {
		driver = new ChromeDriver();
	}
	
	public static WebDriver getBrowserConfig() {
		return driver;
	}
	
}
