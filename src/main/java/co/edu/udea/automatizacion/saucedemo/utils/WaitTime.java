package co.edu.udea.automatizacion.saucedemo.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class WaitTime implements Interaction {

    private final Integer millis;

    public WaitTime(Integer millis) {
        this.millis = millis;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Interrupted while waiting", e);
        }
    }

    public static Performable putWaitTimeOf(Integer millis) {
        return Tasks.instrumented(WaitTime.class, millis);
    }

}
