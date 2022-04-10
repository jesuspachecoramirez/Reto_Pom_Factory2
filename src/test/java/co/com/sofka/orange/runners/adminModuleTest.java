package co.com.sofka.orange.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(snippets = CucumberOptions.SnippetType.CAMELCASE,
                 features= {"src/test/resources/features/adminModule.feature"},
                 glue = {"co.com.sofka.orange.stepdefinition"},
                 publish=  true
)
public class adminModuleTest {
}
