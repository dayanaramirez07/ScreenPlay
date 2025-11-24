package co.edu.udea.automatizacion.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {
                "co.edu.udea.automatizacion.saucedemo.stepdefinitions",
                "co.edu.udea.automatizacion.saucedemo.hooks"  
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:build/reports/cucumber.html"}
)
public class Runner {}