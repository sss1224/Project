package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features= {"features/DemoBlaze.feature","features/LoginDemoBlaze.feature","features/ContactDemoBlaze.feature","features/AddToCart.feature","features/PlaceOrder.feature"},
glue= {"stepsdefintion"},
plugin = {"html:target/cucumber/cucumber-test-report.html"}
)

	

public class runner extends AbstractTestNGCucumberTests {

}
