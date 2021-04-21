package org.example.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.example.ui.GridResults.ARTICLE;
import static org.hamcrest.Matchers.notNullValue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import org.example.questions.IsTheItineraryDetailsShown;

public class ItineraryStepDefinitions {

  @When("He chooses one sail of {int} days")
  public void chooseACruise(int days) {
    theActorInTheSpotlight().attemptsTo(Click.on(ARTICLE.of("1")));
  }

  @Then("the itinerary will be loaded")
  public void checkTheCruiseDetail() {
    theActorInTheSpotlight()
        .should(
            seeThat(
                "the itinerary is loaded",
                IsTheItineraryDetailsShown.description(),
                notNullValue()));
  }

  @Then("the detail of each day will be showed")
  public void checkTheDetailOfTheDay() {
    theActorInTheSpotlight()
        .should(
            seeThat(
                "details of each day", IsTheItineraryDetailsShown.detailDay("1"), notNullValue()));
  }

  @Then("the BOOK NOW button will be placed into the page")
  public void checkTheBookNowButton() {
    theActorInTheSpotlight()
        .should(
            seeThat("book now button", IsTheItineraryDetailsShown.bookNowButton(), notNullValue()));
  }
}
