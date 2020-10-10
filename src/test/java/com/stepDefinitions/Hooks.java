package com.stepDefinitions;

import com.testBase.BaseClass;
import com.testBase.PageInitializer;
import com.utils.CommonMethods;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods {
	
	@Before
	public void start(Scenario scenario) {
		System.out.println("StartingTest : " +scenario.getName());
		BaseClass.setUp();
		PageInitializer.initializePageObjects();
	}
	
	
	@After
	public void end(Scenario scenario) {
		System.out.println("Test Ended :");
		System.out.println(scenario.getStatus());
		BaseClass.tearDown();
	}

}
