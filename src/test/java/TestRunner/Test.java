package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    
		features= ".\\src\\test\\java\\featureFiles\\RegisterUser.feature",
		glue= "StepDefinationFiles",
		//tags="@tag3",
				plugin = {
				        "pretty", // Prints the Gherkin steps in the console
				        "html:target/cucumber-reports/cucumber.html", // HTML report
				        "json:target/cucumber-reports/cucumber.json", // JSON report
				        "junit:target/cucumber-reports/cucumber.xml"  // JUnit XML report
				    },
				    monochrome = true // Makes the console output readable
	)

public class Test {
	
	

}
