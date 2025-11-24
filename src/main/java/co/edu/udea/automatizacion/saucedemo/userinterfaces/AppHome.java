package co.edu.udea.automatizacion.saucedemo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AppHome extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Text Box ini")
            .located(By.id("user-name"));

}