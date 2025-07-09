package io.github.aleblanco.stepdefinitions.api.reqres;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.aleblanco.data.UserData;
import io.github.aleblanco.entities.UserRequestEntity;
import io.github.aleblanco.questions.api.ApisQuestions;
import io.github.aleblanco.tasks.apis.testingApiReqRes.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class TestingApiStepDefinition {

    @When("I send a {string} request to {string}")
    public void iSendARequestTo(String method, String path) {
        theActorInTheSpotlight().attemptsTo(PerformApiCall.with(method, path, null));
    }

    @When("I send a {string} request to {string} with name {string} and job {string}")
    public void iSendARequestToWithNameAndJob(String method, String path, String name, String job) {
        UserRequestEntity body = UserData.withNameAndJob(name,job);
        theActorInTheSpotlight().attemptsTo(PerformApiCall.with(method,path,body));
    }

    @When("I send a {string} request to {string} with email {string} and password {string}")
    public void iSendARequestToWithEmailAndPassword(String method, String path, String email, String password) {
        UserRequestEntity body = UserData.withEmailAndPassword(email,password);
        theActorInTheSpotlight().attemptsTo(PerformApiCall.with(method,path,body));
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int number) {
        theActorInTheSpotlight().should(seeThat(ApisQuestions.rememberedStatus(), equalTo(number)));
    }


}
