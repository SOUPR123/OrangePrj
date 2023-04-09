package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/Cucum_feature",
	glue="Cucum",
    dryRun=false,
	monochrome=true,
	
	plugin= {"pretty","html:target/cucumber_reports/report.html",
			"json:target/cucumber_reports/report1.json",
			"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
			
			}
//tags= "@Test1"
	
	
		)
public class TestRun {
	
}