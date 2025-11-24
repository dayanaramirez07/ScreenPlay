package co.edu.udea.automatizacion.saucedemo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmationPage {

    public static final Target CONFIRMATION_MSG = Target.the("confirmation message")
            .located(By.className("complete-header"));

}
