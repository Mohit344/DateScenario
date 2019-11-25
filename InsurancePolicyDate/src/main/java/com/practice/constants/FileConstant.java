package com.practice.constants;

import java.io.File;

public class FileConstant {
	/**
	 * FileConstant class is about class constant waits constants grid run variable
	 * 
	 */

	public static final int EXPLICIT_WAIT = 20;
	public static final int TIME = 3000;
	public static final int SCROLL_PIXCEL = 30000;
	public static final int IMPLICIT_WAIT = 30;
	public static final int POLLING_TIME = 1000;
	public static final int WAIT_TIME = 2;
	public static final int SCROLL_RESOLUTION = 300;
	public static final int WAIT = 4000;

	public static final String OBJECT_REPOSITARY = "./src/test/resources/pageObject";
	public static final String TEST_DATA = "./src/test/resources/testdata";
	public static final String logger="./src/test/resources/log4j";
	
	
	public static final String EXTENT_REPORT = "./extentreport/extentReport.html";
	
	
	
	public static final String CHROME_EXE = "lib" + File.separator + "chromedriver.exe";
	public static final String FIREFOX_EXE = "lib" + File.separator + "geckodriver.exe";
	public static final String IE_EXE = "lib" + File.separator + "IEDriverServer.exe";
	public static final String CONFIG_FILE = "config.properties";
	
    public static final String Log4j=logger+File.separator+	"log4j.properties";
    public static final String EFFECTIVE_DATE_CHANGE=TEST_DATA+File.separator+"policyeffectivedate.xlsx";
   
 
	
	
}
