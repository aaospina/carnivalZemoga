package org.example.tasks;

import static org.example.ui.HomePage.DESTINATION_OPTION;
import static org.example.ui.HomePage.DURATION_LINK;
import static org.example.ui.HomePage.DURATION_OPTION;
import static org.example.ui.HomePage.SAIL_TO_LINK;
import static org.example.ui.HomePage.SEARCH_BUTTON;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.thucydides.core.annotations.Step;

public class EnterSearchParameters implements Task {

  private final String port;
  private final String duration;

  public EnterSearchParameters(String port, String duration) {
    this.port = port;
    this.duration = duration;
  }

  public static Performable withValues(String port, String duration) {
    return Instrumented.instanceOf(EnterSearchParameters.class).withProperties(port, duration);
  }

  @Override
  @Step("{0} sets the filter parameters")
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        Click.on(SAIL_TO_LINK),
        Click.on(DESTINATION_OPTION.of(port)),
        Click.on(DURATION_LINK),
        Click.on(DURATION_OPTION.of(duration)),
        Click.on(SEARCH_BUTTON));
  }
}
