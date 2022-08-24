package com.reports;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	

	public static void generatesJVMReporting(String jsonReportingFile) {
		//1. Mention the path of JVM report Where to store?
		
				File file= new File("C:\\Users\\Vignesh.R\\eclipse-workspace\\OMRBranchAdactinAutomation\\target");
				
				//2. Create the object for configuration class 
				
				Configuration configuration=new Configuration(file, "OMRBranchAdactinAutomation");
				
				//3. Mention the browser version
				
			    configuration.addClassifications("Browser", "Chrome");
			    configuration.addClassifications("BrowserVersion", "104");
			    configuration.addClassifications("OS", "WIN10");
			    configuration.addClassifications("Sprint", "34");
			    
			    //4. Create object for report builder class--->Pass the Json file to featch the value from Json
			    
			    ArrayList<String> jsonFiles = new ArrayList<String>();
			   
			    jsonFiles.add(jsonReportingFile);
			    
			    ReportBuilder builder=new ReportBuilder(jsonFiles, configuration);
			    
			    //5. generate report--->Get the all passed, failed and skipped details from json and build the jvm report 
			    
			    builder.generateReports();
			    
			    
			    
			    
			    
				

	}
	
	
		
		
		
		
		
	}


