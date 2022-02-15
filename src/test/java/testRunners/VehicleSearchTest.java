package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/Feature1-VehicleSeachTest.feature"},
		glue = {"stepDefinition","appHooks"},
		tags = "@Regression",
	    plugin = {"pretty",
					"json:target/MyReports/report.json",
					"junit:target/MyReports/report.xml"},
		monochrome = true,
		dryRun = false,
		publish = true
		)
public class VehicleSearchTest {

}
