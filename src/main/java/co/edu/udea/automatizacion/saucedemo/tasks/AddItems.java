package co.edu.udea.automatizacion.saucedemo.tasks;

import co.edu.udea.automatizacion.saucedemo.userinterfaces.ProductsPage;
import co.edu.udea.automatizacion.saucedemo.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddItems implements Task {

    public static AddItems toOrder() {
        return Tasks.instrumented(AddItems.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.ADD_BACKPACK),
                WaitTime.putWaitTimeOf(1000),
                Click.on(ProductsPage.ADD_BIKE_LIGHT),
                WaitTime.putWaitTimeOf(1000),
                Click.on(ProductsPage.CART_BUTTON),
                WaitTime.putWaitTimeOf(1000));
    }

}
