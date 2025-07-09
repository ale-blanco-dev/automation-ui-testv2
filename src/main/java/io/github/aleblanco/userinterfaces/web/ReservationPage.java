package io.github.aleblanco.userinterfaces.web;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservationPage {
    private ReservationPage(){}

    public static final Target BUTTON_BOOK_NOW = Target.the("button book now")
            .located(By.xpath("//a[@class='btn btn-primary btn-lg']"));
    public static final Target SINGLE_ROOM_RESERVATION = Target.the("single room reservation")
            .located(By.xpath("//a[starts-with(@href, '/reservation/1?checkin=')]"));
    public static final Target DOUBLE_ROOM_RESERVATION = Target.the("double room reservation")
            .located(By.xpath("//a[starts-with(@href, '/reservation/2?checkin=')]']"));
    public static final Target SUITE_ROOM_RESERVATION = Target.the("suite room reservation")
            .located(By.xpath("//a[starts-with(@href, '/reservation/3?checkin=')]"));
    public static final Target BUTTON_RESERVATION = Target.the("button reservation")
            .located(By.id("doReservation"));
    public static final Target BUTTON_FINISH_RESERVATION = Target.the("button finish reservation")
            .located(By.xpath("//button[contains(text(),'Reserve Now')]"));
    public static final Target INPUT_FIRSTNAME = Target.the("input firstname")
            .located(By.xpath("//input[@placeholder='Firstname']"));
    public static final Target INPUT_LASTNAME = Target.the("input lastname")
            .located(By.xpath("//input[@placeholder='Lastname']"));
    public static final Target INPUT_EMAIL = Target.the("input email")
            .located(By.xpath("//input[@placeholder='Email']"));
    public static final Target INPUT_PHONE = Target.the("input phone")
            .located(By.xpath("//input[@placeholder='Phone']"));
    public static final Target MESSAGE_BOOK_CONFIRMED = Target.the("message book confirmed")
            .located(By.xpath("//h2[contains(text(),'Booking Confirmed')]"));
}
