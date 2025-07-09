package io.github.aleblanco.tasks.web.ecommerce;

import io.github.aleblanco.userinterfaces.web.PurchaseEcommerceLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class PurchaseProductTask implements Task {

    public static PurchaseProductTask purchase() {
        return instrumented(PurchaseProductTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PurchaseEcommerceLoginPage.BUTTON_ADD_TO_CART),
                Click.on(PurchaseEcommerceLoginPage.ICON_SHOPPING_CART),
                Click.on(PurchaseEcommerceLoginPage.BUTTON_CHECKOUT),
                Enter.theValue("Ale").into(PurchaseEcommerceLoginPage.INPUT_FIRST_NAME),
                Enter.theValue("Dev").into(PurchaseEcommerceLoginPage.INPUT_LAST_NAME),
                Enter.theValue("12345").into(PurchaseEcommerceLoginPage.INPUT_ZIP_CODE),
                Click.on(PurchaseEcommerceLoginPage.BUTTON_CONTINUE),
                Click.on(PurchaseEcommerceLoginPage.BUTTON_FINISH));
    }
}
