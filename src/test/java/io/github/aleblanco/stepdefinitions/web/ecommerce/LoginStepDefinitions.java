package io.github.aleblanco.stepdefinitions.web.ecommerce;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.aleblanco.questions.ValidateSuccessfulObject;
import io.github.aleblanco.questions.ValidateSuccessfulTitleText;
import io.github.aleblanco.tasks.web.ecommerce.LoginTask;
import io.github.aleblanco.tasks.web.ecommerce.LogoutTask;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static io.github.aleblanco.userinterfaces.web.LoginEcommerceLoginPage.*;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    private EnvironmentVariables environmentVariables;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url(environmentVariables.getProperty("URL_ECOMMERCE")));
    }

    @When("they log in as {string} and {string}")
    public void theyLogInAsAnd(String user, String password) {
        theActorInTheSpotlight().attemptsTo(LoginTask.in(user,password));
    }

    @When("they attempt to log in as {string} with the incorrect password {string}")
    public void theyAttemptToLogInAsWithTheIncorrectPassword(String user, String password) {
        theActorInTheSpotlight().attemptsTo(LoginTask.in(user,password));
    }
    @Then("they should see the dashboard if {string}")
    public void theyShouldSeeTheDashboardIf(String status) {
        boolean expectedStatus = Boolean.parseBoolean(status);
        theActorInTheSpotlight().should(seeThat(ValidateSuccessfulTitleText.textIn(TITLE_PRODUCTS, "Sauce Labs Backpack"), is(expectedStatus)));
    }

    @Then("they should logout")
    public void theyShouldLogout() {
        theActorInTheSpotlight().attemptsTo(LogoutTask.out());
        theActorInTheSpotlight().should(seeThat(ValidateSuccessfulObject.of(BUTTON_LOGIN)));
    }
}
