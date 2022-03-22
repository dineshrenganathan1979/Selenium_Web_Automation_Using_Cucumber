package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures"},
		glue = {"stepdefinitions", "AppHooks"},
	   //format ={"pretty","html:targer/report.html","json:target/report.json","junit:target/report.xml"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedTestsRerun.txt"
				}, 
		//tags ="@smoke",
		monochrome = true,
		dryRun = false,
		strict = true
		
		)

public class MyTestRunner {

}
