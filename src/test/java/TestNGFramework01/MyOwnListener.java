package TestNGFramework01;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyOwnListener implements ITestListener {


	public ExtentSparkReporter reporter; // UI Of the report(document name,title,theme..)
	public ExtentReports extent;  // Common information(Hostname, TesterName, os,)
	public ExtentTest test;  // test entities

	public void onTestStart(ITestContext context) {

		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\latestone.html");

		//provide document information

		reporter.config().setDocumentTitle("Automation Testing Report"); //Document title 

		reporter.config().setReportName("Functional Testing"); //report name

		reporter.config().setTheme(Theme.STANDARD);

		//common information about document

		extent=new ExtentReports();
		extent.attachReporter(reporter);

		extent.setSystemInfo("Hostname","LoacalHost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester","Sridhar");
		extent.setSystemInfo("OS","windows10");
		extent.setSystemInfo("Browser name","chrome,edge,firefox");

	}

	public void onTestSuccess(ITestResult tr) {

		test=extent.createTest(tr.getName());
		test.log(Status.PASS,"Test case is pass"+tr.getName());
	}

	public void onTestFailure(ITestResult tr) {

		test=extent.createTest(tr.getName());
		test.log(Status.FAIL,"Test case failed"+tr.getName());
		test.log(Status.FAIL,"Test case is failed"+tr.getThrowable());
		
		
		
	}
	
	public void onTestSkipped(ITestResult tr) {
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP, "Test case is skipped"+tr.getTestName());
	}
	
	public void onFinish(ITestContext context) {
	
		 extent.flush();
	}
}


