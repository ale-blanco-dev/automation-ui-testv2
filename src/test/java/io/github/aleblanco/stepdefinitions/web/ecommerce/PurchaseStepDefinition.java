package io.github.aleblanco.stepdefinitions.web.ecommerce;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.github.aleblanco.questions.ValidateSuccessfulTitleText;
import io.github.aleblanco.tasks.web.ecommerce.PurchaseProductTask;

import static io.github.aleblanco.userinterfaces.web.PurchaseEcommerceLoginPage.MESSAGE_THANK_YOU;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class PurchaseStepDefinition {

    @And("they complete the checkout process")
    public void theyCompleteTheCheckoutProcess() {
        theActorInTheSpotlight().attemptsTo(PurchaseProductTask.purchase());
    }

    @Then("they should see the order confirmation screen")
    public void theyShouldSeeTheOrderConfirmationScreen() {
        theActorInTheSpotlight().should(seeThat(ValidateSuccessfulTitleText.textIn(MESSAGE_THANK_YOU, "Thank you for your order!"), is(true)));
    }
}
