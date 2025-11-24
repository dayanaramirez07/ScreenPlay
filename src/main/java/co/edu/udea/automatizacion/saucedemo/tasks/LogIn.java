package co.edu.udea.automatizacion.saucedemo.tasks;

import co.edu.udea.automatizacion.saucedemo.userinterfaces.LoginPage;
import co.edu.udea.automatizacion.saucedemo.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LogIn implements Task {

    public static LogIn successfully() {
        return Tasks.instrumented(LogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(LoginPage.USERNAME),
                WaitTime.putWaitTimeOf(1000),
                Enter.theValue("secret_sauce").into(LoginPage.PASSWORD),
                WaitTime.putWaitTimeOf(1000),
                Click.on(LoginPage.LOGIN_BUTTON),
                WaitTime.putWaitTimeOf(1000));
    }

}
