package org.example.questions;

import static org.example.ui.GridResults.CRUISE_PRICE;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

public class IsTheCruiseDetailsShown {

  @Subject("It is the price OK")
  public static Question<String> price(String attribute) {
    System.out.println(TheTarget.textOf(CRUISE_PRICE.of(attribute)).toString());
    return TheTarget.textOf(CRUISE_PRICE.of(attribute));
  }
}
