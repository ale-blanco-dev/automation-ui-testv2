package io.github.aleblanco.tasks.web.ecommerce;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static io.github.aleblanco.userinterfaces.web.LoginEcommerceLoginPage.BUTTON_LOGOUT;
import static io.github.aleblanco.userinterfaces.web.LoginEcommerceLoginPage.BUTTON_MENU_BAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogoutTask implements Task{
    public static LogoutTask out(){
        return instrumented(LogoutTask.class);
    }

    @Override
    @Step("Login user")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_MENU_BAR),
                Click.on(BUTTON_LOGOUT));
    }
}