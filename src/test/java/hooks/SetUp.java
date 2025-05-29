
package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class SetUp {

    // Use ThreadLocal for parallel test safety
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    @Before
    public void initial() {
        DriverManager.type_driver = "edge";
        WebDriver driver = DriverManager.GetDriver();
        driverThreadLocal.set(driver);
    }

    @BeforeStep
    public void avant_etape() {
        System.out.println("etape en cours");
    }

    @AfterStep
    public void TakeScreenshot(Scenario scenario) {
        WebDriver driver = getDriver();
        if (driver instanceof TakesScreenshot) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }
    }

    @After
    public void terminal() {
        WebDriver driver = getDriver();
        if (driver != null) {
            driver.quit(); // More complete than close()
            driverThreadLocal.remove(); // Clean up thread-local reference
        }
    }
}
