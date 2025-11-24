package co.edu.udea.automatizacion.saucedemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import co.edu.udea.automatizacion.saucedemo.questions.CartItemCount;
import co.edu.udea.automatizacion.saucedemo.questions.ItemsInCart;
import co.edu.udea.automatizacion.saucedemo.utils.WaitTime;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

public class CartManagementStepDefinition {

    @Then("the cart icon shows the correct number of items")
    public void theCartIconShowsTheCorrectNumberOfItems() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitTime.putWaitTimeOf(1000));
        OnStage.theActorInTheSpotlight().should(
                seeThat(CartItemCount.displayed(), equalTo(2)));
    }

    @Then("the added items appear in the cart with their details")
    public void theAddedItemsAppearInTheCartWithTheirDetails() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitTime.putWaitTimeOf(1000));
        OnStage.theActorInTheSpotlight().should(
                seeThat(ItemsInCart.displayed(), hasItems("Sauce Labs Backpack", "Sauce Labs Bike Light")));
    }

}