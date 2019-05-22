package Practicrwork1;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src\\test\\Resources\\Features",tags = "@register",format = {"pretty","html:target/cucumber-report"})

@CucumberOptions(features = ".",tags = "@eurocurrancy",format = {"pretty","html:target/cucumber-reports"})
public class RunTest {

}

