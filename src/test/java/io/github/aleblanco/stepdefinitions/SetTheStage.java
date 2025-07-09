package io.github.aleblanco.stepdefinitions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.Before;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetTheStage {

    @Before(order=1)
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order=2)
    public void setActorName(){
        theActorCalled("Aleblanco");
    }

}
