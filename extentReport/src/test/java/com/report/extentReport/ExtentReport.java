package com.report.extentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {






	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub



		ExtentReports extent = new ExtentReports();//This is an engine. Repoter needs to be attached to this Engine.
		ExtentSparkReporter sparkReporter  = new ExtentSparkReporter("ExtentReprt/reportHere.html");  ///either creating in a folder a making a file
		extent.attachReporter(sparkReporter);

		ExtentTest  testttt1    =  extent.createTest("Test 1"); //By default if you create a dummy test, it will show passed.
		testttt1.pass("This is passed");//	So its creating a pass log in report.

		ExtentTest  testttt2    =  extent.createTest("Test 2");
		testttt2.log(Status.SKIP, "This method I am skipping");

		extent.createTest("Test 3").log(Status.FAIL, "This is failed method hello");// We are not creating object of this instance because we can are using concept of method chaining here. Means we don't need to create an other variable like in method 1 & 2.


		extent.flush(); //After everything this is done to generate report

		Desktop.getDesktop().browse(new File("ExtentReprt/reportHere.html").toURI());//This will be opened in your system default browser from here.



	}	


}


