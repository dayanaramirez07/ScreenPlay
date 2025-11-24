package co.edu.udea.automatizacion.saucedemo.questions;

import co.edu.udea.automatizacion.saucedemo.userinterfaces.ConfirmationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PurchaseConfirmation implements Question<Boolean> {

    public static PurchaseConfirmation isShown() {
        return new PurchaseConfirmation();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(ConfirmationPage.CONFIRMATION_MSG).answeredBy(actor)
                .equalsIgnoreCase("Thank you for your order!");
    }

}
