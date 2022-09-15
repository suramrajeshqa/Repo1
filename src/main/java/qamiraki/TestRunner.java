package qamiraki;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="features\\poline.feature",glue="qamiraki",plugin="html:reports.html")

public class TestRunner extends AbstractTestNGCucumberTests {

	 

}




/*@CucumberOptions(
		features = "features\\\\polinehr.feature",
		glue= {"qamiraki"},
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports"},
		monochrome = true
	)
public class TestRunner{

}*/
