package io.github.aleblanco.tasks.web.reservation;

import io.github.aleblanco.tasks.web.ecommerce.LoginTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToBy;
import net.thucydides.core.annotations.Step;

import static io.github.aleblanco.userinterfaces.web.ReservationPage.BUTTON_BOOK_NOW;
import static io.github.aleblanco.userinterfaces.web.ReservationPage.SINGLE_ROOM_RESERVATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRoom implements Task {

    public static SelectRoom out(){
        return instrumented(SelectRoom.class);
    }

    @Override
    @Step("Pruebas quit")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_BOOK_NOW),
                MoveMouse.to(SINGLE_ROOM_RESERVATION),
                Click.on(SINGLE_ROOM_RESERVATION)
        );

    }
}
