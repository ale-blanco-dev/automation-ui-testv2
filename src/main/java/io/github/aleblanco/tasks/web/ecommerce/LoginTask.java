package io.github.aleblanco.tasks.web.ecommerce;

import io.github.aleblanco.userinterfaces.web.LoginEcommerceLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task{
    private final String user;
    private final String password;

    public LoginTask(String user, String password){
        this.user = user;
        this.password = password;
    }

    public static LoginTask in(String user, String password){
        return instrumented(LoginTask.class,user,password);
    }

    @Override
    @Step("Login user")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(LoginEcommerceLoginPage.INPUT_USERNAME),
                Enter.theValue(password).into(LoginEcommerceLoginPage.INPUT_PASSWORD),
                Click.on(LoginEcommerceLoginPage.BUTTON_LOGIN));
    }
}