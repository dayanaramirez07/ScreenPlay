package co.edu.udea.automatizacion.saucedemo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target CHECKOUT_BUTTON = Target.the("checkout")
            .located(By.id("checkout"));

    public static final Target CART_ITEM_NAMES = Target.the("cart items names")
            .located(By.className("inventory_item_name"));

}
