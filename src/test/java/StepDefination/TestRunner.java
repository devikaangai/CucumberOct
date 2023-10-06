package StepDefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\devik\\IdeaProjects\\CucumberOctoberSix\\src\\test\\java\\featurefile\\login.feature", glue = {"StepDefination"})

public class TestRunner {
}


