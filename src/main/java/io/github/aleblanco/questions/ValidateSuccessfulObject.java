package io.github.aleblanco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateSuccessfulObject implements Question<Boolean> {

    private final Target element;

    public ValidateSuccessfulObject(Target element) {
        this.element = element;
    }

    public static ValidateSuccessfulObject of(Target element) {
        return new ValidateSuccessfulObject(element);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return element.resolveFor(actor).isVisible();
    }
}
