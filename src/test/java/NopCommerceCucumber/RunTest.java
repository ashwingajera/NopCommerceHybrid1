package NopCommerceCucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\Resouces\\Features", tags = "@guestUserReferAProduct")

public class RunTest {



}
