package org.example.tasks;

import static org.example.ui.GridResults.CRUISE_PRICE;
import static org.example.ui.GridResults.PRICING_FILTER;

import lombok.SneakyThrows;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.actions.MouseActions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FilterByPrice implements Task {

  MouseActions mouseActions;

  private final int limitA;
  private final int limitB;

  public FilterByPrice(int limitA, int limitB) {
    this.limitA = limitA;
    this.limitB = limitB;
  }

  public static Performable withValues(int limitA, int limitB) {
    return Instrumented.instanceOf(FilterByPrice.class).withProperties(limitA, limitB);
  }

  @SneakyThrows
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(PRICING_FILTER));
    mouseActions.dragAndDrop(limitA, limitB);

    actor.attemptsTo(WaitUntil.the(CRUISE_PRICE.of("1"), isVisible()).forNoMoreThan(10).seconds());
  }
}
