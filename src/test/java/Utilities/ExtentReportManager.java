package Utilities;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import TestBase.BaseClass1;

public class ExtentReportManager implements ITestListener{ 
	public ExtentSparkReporter sparkreporter;//UI of the test report
	public ExtentReports extent;//common info to the report
	public ExtentTest test;//entry the data into the report
	
	public void onStart(ITestContext context) {
		//specify the location of folder
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		sparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Extentreports/"+timestamp+".html");
		sparkreporter.config().setDocumentTitle("Automation Testing");
		sparkreporter.config().setReportName("Registration Functionality");
		sparkreporter.config().setTheme(Theme.DARK);
		//common info
		extent=new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("computer name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Testername", "subhani");
		extent.setSystemInfo("OS", "windows");
		extent.setSystemInfo("Browser", "chrome");
	}
	
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test is passed"+result.getName());
		try {
			String imgpath=new BaseClass1().captureScreen(result.getName());//store screenshot into imgpath
			test.addScreenCaptureFromPath(imgpath);//add screenshot to report
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "test is failed"+result.getName());
		test.log(Status.FAIL, result.getThrowable());//capture reason of failure
		
		try {
			String imgpath=new BaseClass1().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgpath);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "test is failed"+result.getName());
		test.log(Status.SKIP, result.getThrowable());
		
		try {
			String imgpath=new BaseClass1().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgpath);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}



}
