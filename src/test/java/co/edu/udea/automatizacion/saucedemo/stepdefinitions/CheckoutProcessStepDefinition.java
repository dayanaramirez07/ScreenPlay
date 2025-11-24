package co.edu.udea.automatizacion.saucedemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import co.edu.udea.automatizacion.saucedemo.questions.MissingInfoError;
import co.edu.udea.automatizacion.saucedemo.questions.PurchaseConfirmation;
import co.edu.udea.automatizacion.saucedemo.tasks.CompleteRequiredSteps;
import co.edu.udea.automatizacion.saucedemo.tasks.SkipRequiredSteps;
import co.edu.udea.automatizacion.saucedemo.utils.WaitTime;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class CheckoutProcessStepDefinition {

    @When("I complete the required steps")
    public void iCompleteTheRequiredSteps() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompleteRequiredSteps.forCheckout(),
                WaitTime.putWaitTimeOf(1000));
    }

    @Then("I can see the confirmation of the completed purchase")
    public void iCanSeeTheConfirmationOfTheCompletedPurchase() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitTime.putWaitTimeOf(1000));
        OnStage.theActorInTheSpotlight().should(
                seeThat(PurchaseConfirmation.isShown()));
    }

    @When("I skip required steps")
    public void iSkipRequiredSteps() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SkipRequiredSteps.duringCheckout());
    }

    @Then("I see error messages indicating the missing information")
    public void iSeeErrorMessagesIndicatingTheMissingInformation() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitTime.putWaitTimeOf(1000));
        OnStage.theActorInTheSpotlight().should(
                seeThat(MissingInfoError.isDisplayed()));
    }

}
