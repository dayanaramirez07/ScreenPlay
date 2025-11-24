package co.edu.udea.automatizacion.saucedemo.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.edu.udea.automatizacion.saucedemo.tasks.AddItems;
import co.edu.udea.automatizacion.saucedemo.tasks.LogIn;
import co.edu.udea.automatizacion.saucedemo.tasks.OpenTheApp;
import co.edu.udea.automatizacion.saucedemo.userinterfaces.AppHome;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CommonStepDefinitions {

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before(order = 1)
    public void config() {
        OnStage.setTheStage(new OnlineCast());
        Actor user = OnStage.theActorCalled("user");
        user.can(BrowseTheWeb.with(theDriver));
    }

    @Given("I am logged in")
    public void iAmLoggedIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenTheApp.navigator(new AppHome()),
                LogIn.successfully());
    }

    @When("I add items to my order")
    public void iAddItemsToMyOrder() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddItems.toOrder());
    }

}
