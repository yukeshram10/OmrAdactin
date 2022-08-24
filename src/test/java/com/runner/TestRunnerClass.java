package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Features\\TC5_CancelBooking.feature"},stepNotifications=true,plugin= {"pretty","json:target\\out.json"},monochrome=true,dryRun=false,glue="com.stepdefinition")


public class TestRunnerClass {
	
	@AfterClass
	public static void afterClass() {
		Reporting.generatesJVMReporting("C:\\Users\\Vignesh.R\\eclipse-workspace\\Testing\\target\\out.json");

	}

	
	
	
}
