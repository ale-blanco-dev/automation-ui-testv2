package io.github.aleblanco.stepdefinitions.web.reservation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.aleblanco.questions.ValidateSuccessfulTitleText;
import io.github.aleblanco.tasks.web.reservation.FinishReservation;
import io.github.aleblanco.tasks.web.reservation.SelectDateRange;
import io.github.aleblanco.tasks.web.reservation.SelectRoom;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static io.github.aleblanco.userinterfaces.web.PurchaseEcommerceLoginPage.MESSAGE_THANK_YOU;
import static io.github.aleblanco.userinterfaces.web.ReservationPage.MESSAGE_BOOK_CONFIRMED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class ReservationStepDefinitions {

    private EnvironmentVariables environmentVariables;
    
    @Given("the user selected a room")
    public void theUserSelectedARoom() {
        theActorInTheSpotlight().wasAbleTo(Open.url(environmentVariables.getProperty("BOOKING_A_ROOM")));
    }

    @When("making a reservation")
    public void makingAReservation() {
        theActorInTheSpotlight().attemptsTo(
                SelectRoom.out(),
                SelectDateRange.fromTo("01","02"),
                FinishReservation.out()
        );
        
    }

    @Then("confirm a reservation of that room")
    public void confirmAReservationOfThatRoom() {
        theActorInTheSpotlight().should(seeThat(ValidateSuccessfulTitleText.textIn(MESSAGE_BOOK_CONFIRMED, "Booking Confirmed"), is(true)));
    }
}
