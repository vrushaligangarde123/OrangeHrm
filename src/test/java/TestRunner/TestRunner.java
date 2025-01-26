package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/FeatureFiles"}, 
        glue = {"StepDefinations"}, 
        dryRun =false, 
        monochrome = true,
        tags="@OrangeHRMTest"

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
