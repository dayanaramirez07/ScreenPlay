package co.edu.udea.automatizacion.saucedemo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

        public static final Target FIRST_NAME = Target.the("first name")
                        .located(By.id("first-name"));

        public static final Target LAST_NAME = Target.the("last name")
                        .located(By.id("last-name"));

        public static final Target POSTAL_CODE = Target.the("postal code")
                        .located(By.id("postal-code"));

        public static final Target CONTINUE_BUTTON = Target.the("continue")
                        .located(By.id("continue"));

        public static final Target ERROR_MESSAGE = Target.the("error message")
                        .located(By.cssSelector("h3[data-test='error']"));

}
