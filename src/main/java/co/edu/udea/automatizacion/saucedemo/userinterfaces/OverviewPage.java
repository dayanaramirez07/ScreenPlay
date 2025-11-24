package co.edu.udea.automatizacion.saucedemo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class OverviewPage {

    public static final Target FINISH_BUTTON = Target.the("finish")
            .located(By.id("finish"));

}
