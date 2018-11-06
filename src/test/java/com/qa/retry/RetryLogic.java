package com.qa.retry;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogic {
	String log4jConfPath = "C:\\Users\\nimal\\eclipse-workspace\\retryLogic\\src\\test\\java\\com\\qa\\retry\\log4j.properties";

	
	
	@Test  //(retryAnalyzer = retryAnalyser.RetryAnalyzer.class)  this is how retry logic is implemented at the test level 
	public void RetryTest() 
	{
		PropertyConfigurator.configure(log4jConfPath);

		Logger log = Logger.getRootLogger();
		log.info("starting test cases");
		
		Assert.assertTrue(true);
		
		
	}
	
	
	@Test  
	public void RetryTest1() 
	{
		
		Assert.assertTrue(false);
		
	}
	

}
