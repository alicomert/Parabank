package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
//ÖRNEKTİR

@CucumberOptions(
        //ÖRNEKTİR

        tags = "@SmokeTest or @Regression", // bütün senaryolarda SmokeTest ve Regression tag ine sahip olanları çalıştır
        features = {"src/test/java/FeatureFiles"},  //klasördeki bütün feature lar
        glue = {"src/test/StepDefinitions"},
        dryRun = false, // true olduğunda testleri çalıştırmaz, sadece STEP leri var mı kontrol eder
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _01_TestRunnerExtentReport extends AbstractTestNGCucumberTests {
    //Örnek Paralel Test
    @BeforeClass
    @Parameters("browserTipi")
    public void beforeClass(String browserName)
    {
        //ÖRNEKTİR

        GWD.threadBrowserName.set(browserName);
        //Bu thread e browser adını set ettim.
    }
}
