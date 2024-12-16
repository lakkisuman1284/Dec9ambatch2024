package com.rameshsoft.automation.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rameshsoft.automation.utilities.ScreenshotUtility;

public class TCActivityListener implements ITestListener {

	/*@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return ITestListener.super.isEnabled();
	}*/

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TC Execution started  :"+result.getName());
		//ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC Execution success  :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TC is Failure  :"+result.getName());
		try {
			ScreenshotUtility.takeScreenshot(result.getName());
			String exceptionMsg = result.getThrowable().toString();
			System.out.println(exceptionMsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TC is Skipped  :"+result.getName());
		try {
			ScreenshotUtility.takeScreenshot(result.getName());
			String exceptionMsg = result.getThrowable().toString();
			System.out.println(exceptionMsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("suite execution is started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("suite execution is completed");
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/*@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}*/
	

}
