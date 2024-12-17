package com.rameshsoft.automation.appln.businessscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;

public class GmailTest extends BaseTest {

	@Test
	public void gmailTest() {
		//BaseTest.getDriver().get("https://www.gmail.com");
		getDriver().get("https://www.gmail.com");
		WebElement un=getDriver().findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("lsumanrao");
		
		//Here Wantedly we are failing the test case
		WebElement nxt=getDriver().findElement(By.id("IdentifierNext456"));
		nxt.click();
		System.out.println("java");
	}
	
}
