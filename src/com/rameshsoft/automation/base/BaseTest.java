package com.rameshsoft.automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.rameshsoft.automation.utilities.DriverPaths;
import com.rameshsoft.automation.utilities.ScreenshotUtility;
//import org.testng.annotations.Test;

public class BaseTest {
	

	private static WebDriver driver;
	private static String curDir;
	private static String tcName;
	
	@Parameters({"browser"})	
	@BeforeSuite 
	public void openBrowser(@Optional("chrome") String browser) {
	 curDir= System.getProperty("user.dir");
		
		if(browser.equalsIgnoreCase("chrome")) {
		//this path should be dynamic - System.setProperty("webdriver.chrome.driver", "D:\\Users\\Suman.L\\eclipse-workspace\\framework9am2024\\Drivers\\chromedriver.exe");
	    
		System.setProperty(DriverPaths.chromekey, DriverPaths.chromeValue);
		driver=new ChromeDriver();
		init();
		
		
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty(DriverPaths.edgeKey, DriverPaths.edgeValue);
			driver=new EdgeDriver();
			init();
			
		}
		
	}
private void init() {
	//Same 3 lines of code we are writing again-duplication
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
	
}

  @AfterSuite

public void closeBrowse() {
	if (driver!=null) {
		driver.quit(); //driver.close();
	}
	else
	{
		//Throw  exception
		System.out.println("Driver is pointing to null");
	}
}
 /* @BeforeMethod
  public void beforeTCExecution(Method method) {
	 
	 tcName = method.getName();
	 System.out.println("Current TC execution name is:  "+tcName);

}
  @AfterMethod
  public void afterTCExecution(ITestResult result) throws IOException {
	  
	//System.out.println("Test Case execution is completed");
	  if(result.getStatus() == ITestResult.SUCCESS) {
		  System.out.println("TC is Passed: "+result.getName());
	  }
	  else if (result.getStatus() == ITestResult.FAILURE) {
		  System.out.println("TC is Failed: "+result.getName());
		  String exceptionMsg= result.getThrowable().toString();
		  System.out.println(" " +exceptionMsg);
		  ScreenshotUtility.takeScreenshot();
		  
	  }
	  else if (result.getStatus() == ITestResult.SKIP) {
		  System.out.println("TC is Skipped: "+result.getName());
		  String exceptionMsg= result.getThrowable().toString();
		  System.out.println("   " +exceptionMsg);
		  ScreenshotUtility.takeScreenshot();
		  
	  }
  }*/
  

public static WebDriver getDriver() {
	return driver;
}

 public static String getCurDir() {
	return curDir;
}
 
 public static String getTcName() {
	return tcName;
}
}

	
