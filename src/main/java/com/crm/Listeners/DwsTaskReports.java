package com.crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DwsTaskReports implements ITestListener {
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
	String name = result.getMethod().getMethodName();
	test = report.createTest(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.INFO, "OnTestSuccess");
		test.log(Status.PASS, name+ " is Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.INFO, "OnTestFailure");
		test.log(Status.FAIL, name+ " is failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.INFO, "OnTestSkipped");
		test.log(Status.SKIP, name+ " is Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		//create ExtentReportSparkReporter
		spark = new ExtentSparkReporter("./src/main/resources/Task.html");
		spark.config().setDocumentTitle("Follow us menu");
		spark.config().setReportName("Priyanka");
		spark.config().setTheme(Theme.DARK);
		//create ExtentReports
		report = new ExtentReports();
		report.setSystemInfo("Os", "Linux");
		report.setSystemInfo("browser", "chrome-01");
		//attach spark
		report.attachReporter(spark);
		//create extent test
	}
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
}
