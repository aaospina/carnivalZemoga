package org.example.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.example.ui.HomePage.CLOSE_MODAL;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.tasks.EnterSearchParameters;
import org.example.ui.HomePage;

public class SharedStepDefinitions {

  @Before
  public void setTheStage() {
    OnStage.setTheStage(new OnlineCast());
    theActorCalled("user")
        .attemptsTo(Open.browserOn().the(HomePage.class), JavaScriptClick.on(CLOSE_MODAL));
  }

  @When("He searches cruises to {word} with duration of {string}")
  @Given("Luis has a grid of cruises to {word} with a duration of {string}")
  public void searchCruises(String destination, String duration) {
    theActorInTheSpotlight().attemptsTo(EnterSearchParameters.withValues(destination, duration));
  }
}
