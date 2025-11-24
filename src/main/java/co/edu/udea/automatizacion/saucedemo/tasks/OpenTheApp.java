package co.edu.udea.automatizacion.saucedemo.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheApp implements Task {

    PageObject page;

    public OpenTheApp(PageObject page) {
        this.page = page;
    }

    public static OpenTheApp navigator(PageObject page) {
        return Tasks.instrumented(OpenTheApp.class, page);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(page));
    }

}
