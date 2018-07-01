package com.emirates.Selenium_Junit_Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.emirates.config.BrowserConfig;
import com.emirates.utils.ToolBox;

public class ValidateTravel {
	
	private static final String BASE_URL = "https://www.emirates.com/ae/english/";
	private static final String DISMISS_BUTTON = "button[name*=\"Departure airport\"]";
	private static final String DEPART_AIRPORT = "input[name=\"Departure airport\"]";
	private static final String ARRIVAL_AIRPORT = "input[name=\"Arrival airport\"]";
	private static final String CONTINUE_BUTTON = "a[class*=\"search-flight__continue--ct\"]";
	private static WebDriver driver = BrowserConfig.getBrowserConfig();
	private Date date = new Date();

	private static SimpleDateFormat formatter = new SimpleDateFormat("ddmmyyyy");
	
	@Test
	public void validateTravel(){
		ToolBox.getNavigateTool().to(BASE_URL);
		ToolBox.getElementTool().getElement(DISMISS_BUTTON);
		ToolBox.getElementTool().getElement(DEPART_AIRPORT).click();
		ToolBox.getElementTool().enterInputTo(DEPART_AIRPORT, "DXB");
		ToolBox.getElementTool().enterInputTo(ARRIVAL_AIRPORT, "LHR");
		ToolBox.getElementTool().getElement(CONTINUE_BUTTON).click();
		
		System.out.println(formatter.format(date));
		
		
	}

	
}
