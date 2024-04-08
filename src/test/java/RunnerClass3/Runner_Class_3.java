package RunnerClass3;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
features = {"C:\\Users\\varsh\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\Cucumber_2\\src\\test\\resources\\Form2\\Form2.feature"},  
glue = ("CucumberDemo2")
		
		)
public class Runner_Class_3 extends  AbstractTestNGCucumberTests{

}
