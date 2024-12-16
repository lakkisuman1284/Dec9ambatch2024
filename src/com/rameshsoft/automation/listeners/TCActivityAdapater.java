package com.rameshsoft.automation.listeners;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.rameshsoft.automation.utilities.ScreenshotUtility;

public class TCActivityAdapater extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TC Execution started  :"+result.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("suite execution is completed");
	}

	@Override
	public void onConfigurationSuccess(ITestResult tr, ITestNGMethod tm) {
		// TODO Auto-generated method stub
		super.onConfigurationSuccess(tr, tm);
	}

	@Override
	public void onConfigurationFailure(ITestResult tr, ITestNGMethod tm) {
		// TODO Auto-generated method stub
		super.onConfigurationFailure(tr, tm);
	}

	@Override
	public void onConfigurationSkip(ITestResult tr, ITestNGMethod tm) {
		// TODO Auto-generated method stub
		super.onConfigurationSkip(tr, tm);
	}

	@Override
	public void beforeConfiguration(ITestResult tr) {
		// TODO Auto-generated method stub
		super.beforeConfiguration(tr);
	}

	@Override
	public void beforeConfiguration(ITestResult tr, ITestNGMethod tm) {
		// TODO Auto-generated method stub
		super.beforeConfiguration(tr, tm);
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return super.isEnabled();
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
	public void onTestFailedWithTimeout(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailedWithTimeout(tr);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailedButWithinSuccessPercentage(tr);
	}

	@Override
	protected ITestNGMethod[] getAllTestMethods() {
		// TODO Auto-generated method stub
		return super.getAllTestMethods();
	}

	@Override
	public void onStart(ITestContext testContext) {
		// TODO Auto-generated method stub
		super.onStart(testContext);
	}

	@Override
	public List<ITestResult> getFailedButWithinSuccessPercentageTests() {
		// TODO Auto-generated method stub
		return super.getFailedButWithinSuccessPercentageTests();
	}

	@Override
	public List<ITestResult> getFailedTests() {
		// TODO Auto-generated method stub
		return super.getFailedTests();
	}

	@Override
	public List<ITestResult> getPassedTests() {
		// TODO Auto-generated method stub
		return super.getPassedTests();
	}

	@Override
	public List<ITestResult> getSkippedTests() {
		// TODO Auto-generated method stub
		return super.getSkippedTests();
	}

	@Override
	public Collection<ITestResult> getTimedoutTests() {
		// TODO Auto-generated method stub
		return super.getTimedoutTests();
	}

	@Override
	public void setAllTestMethods(List<ITestNGMethod> allTestMethods) {
		// TODO Auto-generated method stub
		super.setAllTestMethods(allTestMethods);
	}

	@Override
	public void setFailedButWithinSuccessPercentageTests(List<ITestResult> failedButWithinSuccessPercentageTests) {
		// TODO Auto-generated method stub
		super.setFailedButWithinSuccessPercentageTests(failedButWithinSuccessPercentageTests);
	}

	@Override
	public void setFailedTests(List<ITestResult> failedTests) {
		// TODO Auto-generated method stub
		super.setFailedTests(failedTests);
	}

	@Override
	public void setPassedTests(List<ITestResult> passedTests) {
		// TODO Auto-generated method stub
		super.setPassedTests(passedTests);
	}

	@Override
	public void setSkippedTests(List<ITestResult> skippedTests) {
		// TODO Auto-generated method stub
		super.setSkippedTests(skippedTests);
	}

	@Override
	public List<ITestContext> getTestContexts() {
		// TODO Auto-generated method stub
		return super.getTestContexts();
	}

	@Override
	public List<ITestResult> getConfigurationFailures() {
		// TODO Auto-generated method stub
		return super.getConfigurationFailures();
	}

	@Override
	public void onConfigurationFailure(ITestResult itr) {
		// TODO Auto-generated method stub
		super.onConfigurationFailure(itr);
	}

	@Override
	public List<ITestResult> getConfigurationSkips() {
		// TODO Auto-generated method stub
		return super.getConfigurationSkips();
	}

	@Override
	public void onConfigurationSkip(ITestResult itr) {
		// TODO Auto-generated method stub
		super.onConfigurationSkip(itr);
	}

	@Override
	public void onConfigurationSuccess(ITestResult itr) {
		// TODO Auto-generated method stub
		super.onConfigurationSuccess(itr);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
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
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
