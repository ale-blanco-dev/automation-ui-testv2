package io.github.aleblanco.tasks.web.reservation;

import io.github.aleblanco.userinterfaces.web.CalendarPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectDateRange implements Task {

    private final String startDate;
    private final String endDate;

    public SelectDateRange(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public static SelectDateRange fromTo(String start, String end) {
        return new SelectDateRange(start, end);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        WebElement startElement = CalendarPage.DATE_BUTTON(startDate).resolveFor(actor).getWrappedElement();
        WebElement endElement = CalendarPage.DATE_BUTTON(endDate).resolveFor(actor).getWrappedElement();

        Actions actions = new Actions(driver);

        actions
                .clickAndHold(startElement)
                .moveToElement(endElement)
                .release()
                .build()
                .perform();
    }
}

