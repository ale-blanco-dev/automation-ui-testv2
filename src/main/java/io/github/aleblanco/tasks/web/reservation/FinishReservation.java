package io.github.aleblanco.tasks.web.reservation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Step;

import static io.github.aleblanco.userinterfaces.web.ReservationPage.*;
import static io.github.aleblanco.utils.constants.Constants.FIRSTNAME_USER;
import static io.github.aleblanco.utils.constants.Constants.LASTNAME_USER;
import static io.github.aleblanco.utils.constants.Constants.EMAI_USER;
import static io.github.aleblanco.utils.constants.Constants.PHONE_USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinishReservation implements Task {

    public static FinishReservation out(){
        return instrumented(FinishReservation.class);
    }

    @Override
    @Step("Pruebas quit")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(BUTTON_RESERVATION),
                Click.on(BUTTON_RESERVATION),
                Enter.theValue(FIRSTNAME_USER).into(INPUT_FIRSTNAME),
                Enter.theValue(LASTNAME_USER).into(INPUT_LASTNAME),
                Enter.theValue(EMAI_USER).into(INPUT_EMAIL),
                Enter.theValue(PHONE_USER).into(INPUT_PHONE),
                Click.on(BUTTON_FINISH_RESERVATION)
        );

    }
}
