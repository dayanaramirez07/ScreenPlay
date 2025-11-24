package co.edu.udea.automatizacion.saucedemo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USERNAME = Target.the("username field")
            .located(By.id("user-name"));

    public static final Target PASSWORD = Target.the("password field")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.id("login-button"));
            
}