package co.edu.udea.automatizacion.saucedemo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {

        public static final Target ADD_BACKPACK = Target.the("add backpack")
                        .located(By.id("add-to-cart-sauce-labs-backpack"));

        public static final Target ADD_BIKE_LIGHT = Target.the("add bike light")
                        .located(By.id("add-to-cart-sauce-labs-bike-light"));

        public static final Target CART_BUTTON = Target.the("cart button")
                        .located(By.id("shopping_cart_container"));

        public static final Target CART_BADGE = Target.the("cart number badge")
                        .located(By.className("shopping_cart_badge"));

}
