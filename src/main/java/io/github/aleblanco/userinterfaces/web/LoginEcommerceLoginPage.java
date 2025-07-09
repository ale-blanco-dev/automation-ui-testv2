package io.github.aleblanco.userinterfaces.web;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginEcommerceLoginPage {
    private LoginEcommerceLoginPage(){}

    public static final Target INPUT_USERNAME = Target.the("input user name")
            .located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("password user name")
            .located(By.id("password"));
    public static final Target BUTTON_LOGIN = Target.the("button login")
            .located(By.id("login-button"));
    public static final Target TITLE_PRODUCTS = Target.the("title dashboard")
            .located(By.className("inventory_item_name"));
    public static final Target BUTTON_MENU_BAR = Target.the("icon menu bar")
            .located(By.id("react-burger-menu-btn"));
    public static final Target BUTTON_LOGOUT = Target.the("button logout")
            .located(By.id("logout_sidebar_link"));

}
