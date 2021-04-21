package org.example.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.questions.IsTheCruiseDetailsShown;
import org.example.questions.IsTheGridResultsShown;
import org.example.tasks.EnterSearchParameters;
import org.example.tasks.FilterByPrice;

public class CruisesStepDefinitions {

  @Given("Pedro is on the cruise search platform")
  public void openThePlatform() {}

  @Then("a set of result will be desplayed")
  public void checkCruisesGrid() {
    theActorInTheSpotlight()
        .should(seeThat("results", IsTheGridResultsShown.grid(), equalTo("grid")));
  }

  @Given("Pedro has a grid of cruises to {word}")
  public void searchCruises2(String destination) {
    theActorInTheSpotlight()
        .attemptsTo(EnterSearchParameters.withValues(destination, "6 - 9 Days"));
  }

  @When("He filters cruises by price between {int} and {int}")
  public void filterByPrice(int limitA, int limitB) {
    theActorInTheSpotlight().attemptsTo(FilterByPrice.withValues(limitA, limitB));
  }

  @Then("the cruises with the price selected will be desplayed")
  public void checkTheFilteredGrid() {

    theActorInTheSpotlight()
        .should(
            seeThat("the cruise price", IsTheCruiseDetailsShown.price("1"), notNullValue()),
            seeThat("the cruise price", IsTheCruiseDetailsShown.price("2"), notNullValue()));

    //Pending tests to validate the the filter and the cruises prices shown
    //Take the price to the WebElementFacade in a future PR
  }


  //These methods will build in a future PR

  @When("He sorts cruises by price")
  public void sortByPrice() {}

  @Then("the cruises will be sorted by price")
  public void checkTheSortedGrid() {}
}
