package com.rameshsoft.automation.appln.businessscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;

public class FpTest extends BaseTest {
	
	@Test
	public void fpTest() {
		//BaseTest.getDriver().get("https://www.flipkart.com");
		getDriver().get("https://www.flipkart.com");
		
		//Here Wantedly we are failing the test case
		getDriver().findElement(By.id("java")).click();
		
		/*WebElement un=getDriver().findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("lsumanrao");
		
		
		WebElement nxt=getDriver().findElement(By.id("IdentifierNext"));
		nxt.click();*/
	}

}
