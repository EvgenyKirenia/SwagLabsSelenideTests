package cucumberBDD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "cucumberBDD/steps",
        tags = "@test",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class RunCucumberTest {
}
