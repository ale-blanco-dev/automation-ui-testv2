package io.github.aleblanco.userinterfaces.web;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseEcommerceLoginPage {
    private PurchaseEcommerceLoginPage(){}

    public static final Target TITLE_PRODUCT = Target.the("title product name")
            .located(By.className("inventory_item_name"));
    public static final Target BUTTON_ADD_TO_CART = Target.the("button")
            .located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target ICON_SHOPPING_CART = Target.the("icon shopping cart")
            .located(By.className("shopping_cart_link"));
    public static final Target BUTTON_CHECKOUT = Target.the("button checkout")
            .located(By.id("checkout"));
    public static final Target INPUT_FIRST_NAME = Target.the("input first name")
            .located(By.id("first-name"));
    public static final Target INPUT_LAST_NAME = Target.the("input last name")
            .located(By.id("last-name"));
    public static final Target INPUT_ZIP_CODE = Target.the("input zip code")
            .located(By.id("postal-code"));
    public static final Target BUTTON_CONTINUE = Target.the("button continue")
            .located(By.id("continue"));
    public static final Target BUTTON_FINISH = Target.the("button finish")
            .located(By.id("finish"));
    public static final Target MESSAGE_THANK_YOU = Target.the("message thank you")
            .located(By.className("complete-header"));
}
