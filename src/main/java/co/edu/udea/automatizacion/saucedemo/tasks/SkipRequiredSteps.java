package co.edu.udea.automatizacion.saucedemo.tasks;

import co.edu.udea.automatizacion.saucedemo.userinterfaces.CartPage;
import co.edu.udea.automatizacion.saucedemo.userinterfaces.CheckoutPage;
import co.edu.udea.automatizacion.saucedemo.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SkipRequiredSteps implements Task {

    public static SkipRequiredSteps duringCheckout() {
        return Tasks.instrumented(SkipRequiredSteps.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.CHECKOUT_BUTTON),
                WaitTime.putWaitTimeOf(1000),
                Click.on(CheckoutPage.CONTINUE_BUTTON),
                WaitTime.putWaitTimeOf(1000));
    }

}
