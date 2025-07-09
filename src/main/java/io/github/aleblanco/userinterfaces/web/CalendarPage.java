package io.github.aleblanco.userinterfaces.web;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalendarPage {
    public static Target DATE_BUTTON(String day) {
        return Target.the("calendar date " + day)
                .located(By.xpath("//button[@class='rbc-button-link' and text()='" + day + "']"));
    }
}
