package co.edu.udea.automatizacion.saucedemo.tasks;

import co.edu.udea.automatizacion.saucedemo.userinterfaces.CartPage;
import co.edu.udea.automatizacion.saucedemo.userinterfaces.CheckoutPage;
import co.edu.udea.automatizacion.saucedemo.userinterfaces.OverviewPage;
import co.edu.udea.automatizacion.saucedemo.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteRequiredSteps implements Task {

    public static CompleteRequiredSteps forCheckout() {
        return Tasks.instrumented(CompleteRequiredSteps.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.CHECKOUT_BUTTON),
                WaitTime.putWaitTimeOf(1000),

                Enter.theValue("Dayana").into(CheckoutPage.FIRST_NAME),
                WaitTime.putWaitTimeOf(1000),
                Enter.theValue("Ramirez").into(CheckoutPage.LAST_NAME),
                WaitTime.putWaitTimeOf(1000),
                Enter.theValue("050001").into(CheckoutPage.POSTAL_CODE),
                WaitTime.putWaitTimeOf(1000),

                Click.on(CheckoutPage.CONTINUE_BUTTON),
                WaitTime.putWaitTimeOf(1000),
                Click.on(OverviewPage.FINISH_BUTTON),
                WaitTime.putWaitTimeOf(1000));
    }

}
