package com.utils;

public class Constants {
	public static final String PROPERTIES_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/configs/configuration.properties";
	
	public static final int IMPLICIT_WAIT_TIME=10;
	
	public static final int PAGE_LOAD_TIMEOUT = 30;
	
	public static final int EXPLICIT_WAIT_TIME=20;
	
	public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"/target/screenshots/";
	
	public static final String TEST_DATA_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/testData/TestData1.xlsx";
	
	public static final String NEGATIVE_LOGIN_SHEETNAME = "NegativeLogin";
}
