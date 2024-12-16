package com.rameshsoft.automation.appln.businessscripts;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;

public class InstTest extends BaseTest {
	
	@Test
	public void instTest() {
		//BaseTest.getDriver().get("https://www.facebook.com");
		getDriver().get("https://www.rameshsoft.com");
	}
}
