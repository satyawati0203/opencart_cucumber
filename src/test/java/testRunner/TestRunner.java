package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {".//Features/"},
					//features= {".//Features/Login.feature"},
		            //features= {".//Features/LoginDDT.feature"},
					//features= {".//Features/LoginDDTExcel.feature"},
					//features= {".//Features/Login.feature",".//Features/xyz.feature"},
					//features= {"@target/rerun.txt"},
					glue="stepDefinitions",
					plugin= {"pretty", "html:reports/myreport.html",
							"rerun:target/rerun.txt"
					        },
					 dryRun=false // mapping between feature file and stepdefinition file
					//tags="@sanity"
					//tags="@regression"
				)
public class TestRunner {

}
