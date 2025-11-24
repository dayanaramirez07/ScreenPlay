package co.edu.udea.automatizacion.saucedemo.questions;

import co.edu.udea.automatizacion.saucedemo.userinterfaces.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MissingInfoError implements Question<Boolean> {

    public static MissingInfoError isDisplayed() {
        return new MissingInfoError();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String message = Text.of(CheckoutPage.ERROR_MESSAGE).answeredBy(actor);
        return message.contains("Error:");
    }
    
}
