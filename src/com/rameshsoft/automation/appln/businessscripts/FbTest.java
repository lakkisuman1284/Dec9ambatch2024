package com.rameshsoft.automation.appln.businessscripts;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;

public class FbTest extends BaseTest {
	
	@Test
	public void fbTest() {
		//BaseTest.getDriver().get("https://www.facebook.com");
		getDriver().get("https://www.facebook.com");
		
		/*WebElement un=getDriver().findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("lsumanrao");
		
		
		WebElement nxt=getDriver().findElement(By.id("IdentifierNext"));
		nxt.click();*/
	}

}
