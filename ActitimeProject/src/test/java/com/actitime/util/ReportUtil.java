package com.actitime.util;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ReportUtil {

	
	public static ExtentSparkReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	public void initializeReport(String suiteName) {
		String reportFolder="C:\\actitime_Automation-Reports\\WEB_Reports\\";
		createFolder(reportFolder);
		String reportName=reportFolder+"_"+suiteName+"_WEB_Chrome "+dateformat()+".html";
		System.out.println(reportName);
		reporter = new ExtentSparkReporter(reportName);
		reporter.config().setDocumentTitle("Shreedevi_Focus");
		reports = new ExtentReports();
		reports.attachReporter(reporter);
	}
	
	public void createTest(String className) {
		test=reports.createTest(className);
	}
	
	public void killReport() {
		reports.flush();
	}
	
	public void createFolder(String foldPath) {
		File file= new File(foldPath);
		if(!file.exists()) {
			file.mkdirs();
		}
		}
	
	public void logStatus(String status,String details) {
		if(status.equalsIgnoreCase("info")) {
		test.info(MarkupHelper.createLabel(details,ExtentColor.BLUE));
		}
		else if(status.equalsIgnoreCase("pass")) {
		test.pass(MarkupHelper.createLabel(details,ExtentColor.GREEN));
		}
		else if(status.equalsIgnoreCase("fail")) {
		test.fail(MarkupHelper.createLabel(details,ExtentColor.RED));
		}
		else if(status.equalsIgnoreCase("warning")) {
		test.warning(MarkupHelper.createLabel(details,ExtentColor.YELLOW));
		}
		
	}
	public void createNode(String stepName,String stepDefinitionName) {
		test = test.createNode(stepName+" : "+stepDefinitionName);
		System.out.println("Executing the Step Definition   -   "+stepName+" : "+stepDefinitionName);

	}
	
	
	public String getFeature(String featureFile) {
		int count = 0;
		for (int i = 0; i < featureFile.length() - 1; i++) {

			char ch = featureFile.charAt(featureFile.length() - (i + 1));

			String str = String.valueOf(ch);

			if (str.equals("/")) {
				break;
			}
			count++;
		}

		featureFile = featureFile.substring(featureFile.length()-count);

		return featureFile;
	}
	
	public String getScenario(Scenario scenario) {
		
		System.out.println("Fetching the Scenario Name");
		
		String name = getFeature(scenario.getUri().toString())+" : "+scenario.getName();
		
//		scenarioName=name;
		
		System.out.println(name);
		
		return name;
	}
	
	public String dateformat() {
	 SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss");
	 Date date = new Date();
	 String actualDate = sdf.format(date);
	 return actualDate;
			 
	} 	
}
