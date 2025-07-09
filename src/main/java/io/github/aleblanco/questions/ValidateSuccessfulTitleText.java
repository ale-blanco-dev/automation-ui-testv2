package io.github.aleblanco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.targets.Target;

@Subject("Validate if the text '#expectedText' is present in the target")
public class ValidateSuccessfulTitleText implements Question<Boolean> {

    private final Target target;
    private final String expectedText;

    public ValidateSuccessfulTitleText(Target target, String expectedText) {
        this.target = target;
        this.expectedText = expectedText;
    }

    public static ValidateSuccessfulTitleText textIn(Target target, String expectedText) {
        return new ValidateSuccessfulTitleText(target, expectedText);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return !target.resolveAllFor(actor).isEmpty() && target.resolveFor(actor).getText().contains(expectedText);
    }
}
