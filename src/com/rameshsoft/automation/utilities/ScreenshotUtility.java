package com.rameshsoft.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.rameshsoft.automation.base.BaseTest;

public interface ScreenshotUtility {

	
	public static String takeScreenshot() throws IOException
	{
		TakesScreenshot takesScreeenshot = (TakesScreenshot )BaseTest.getDriver();
		  File file = takesScreeenshot.getScreenshotAs(OutputType.FILE);
		  String imagePath = BaseTest.getCurDir()+"\\Screenshots\\"+BaseTest.getTcName()+".jpeg";
		  FileUtils.copyFile(file, new File(imagePath));
		  return imagePath;
				 
		
	}
	public static String takeScreenshot(String tcName) throws IOException
	{
		TakesScreenshot takesScreeenshot = (TakesScreenshot )BaseTest.getDriver();
		  File file = takesScreeenshot.getScreenshotAs(OutputType.FILE);
		  String imagePath = BaseTest.getCurDir()+"\\Screenshots\\"+tcName+".jpeg";
		  FileUtils.copyFile(file, new File(imagePath));
		  return imagePath;
				 
		
	}
	
}
