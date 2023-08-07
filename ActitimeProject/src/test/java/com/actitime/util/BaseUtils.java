package com.actitime.util;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtils extends AbstractTestNGCucumberTests{

	public RemoteWebDriver driver;
	public ReportUtil reportUtil;

	@BeforeSuite(alwaysRun = true)
	public void ReportConfig(@Optional ITestContext ctx) {
		String suiteName=ctx.getCurrentXmlTest().getSuite().getName();
		reportUtil=new ReportUtil();
		reportUtil.initializeReport(suiteName);
		reportUtil.killReport();
	}



	@AfterSuite(alwaysRun = true)
	public void closeReport() {
		reportUtil.killReport();
	}

}