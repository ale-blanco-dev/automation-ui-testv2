package io.github.aleblanco.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/web/ecommerce/",
        glue = {"io.github.aleblanco.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class EcommerceRunner {
}
