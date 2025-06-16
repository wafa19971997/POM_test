
package run;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
    tags = "@RegisterUser",
    glue = {"stepDefinition", "hooks"},
    features = "src/test/features/testCasesAutomationExercice",
    monochrome = false,
    publish = true,
    plugin = {"pretty",
              "html:target/cucumber-report.html",
              "json:target/cucumber-report.json",
              "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
