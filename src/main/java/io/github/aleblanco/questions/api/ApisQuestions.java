package io.github.aleblanco.questions.api;

import net.serenitybdd.screenplay.Question;

public class ApisQuestions {

    public static Question<String> rememberedId() {
        return actor -> actor.recall("id");
    }
    public static Question<Integer> rememberedStatus() {
        return actor -> actor.recall("status");
    }
}
