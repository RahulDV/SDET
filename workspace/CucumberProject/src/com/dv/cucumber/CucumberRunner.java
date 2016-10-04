package com.dv.cucumber;

import java.io.File;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:target/"},
//		format     =   {"com.sapient.utils.ScenarioHtmlFormatter:target/cucumber-reports"},   
		features   =   {"src/com/dv/cucumber/features/MyFeature.feature"},
		glue       =   {"com.sapient.steps"},
		tags       =   {},
		dryRun     =   false,
		strict     =   false,
		monochrome =   false
		)
public class CucumberRunner {
	
	@Before
	public static void setup(){
		File file = new File("C:\\Users\\vdant1\\Desktop\\cucumberJars\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	}
	
		

}
