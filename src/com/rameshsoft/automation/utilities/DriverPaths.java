package com.rameshsoft.automation.utilities;

import com.rameshsoft.automation.base.BaseTest;

public interface DriverPaths {
	
	String edgeKey = "webdriver.edge.driver";
	String edgeValue= BaseTest.getCurDir()+"\\Drivers\\msedgedriver.exe";
	
	String chromekey = "webdriver.chrome.driver";
	String chromeValue= BaseTest.getCurDir()+"\\Drivers\\chromedriver.exe";
	

}