package org.example.questions;

import static org.example.ui.GridResults.GRID_RESULTS;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

public class IsTheGridResultsShown {

  @Subject("It is a grid")
  public static Question<String> grid() {
    return TheTarget.attributeNamed("class").forTarget(GRID_RESULTS);
  }
}
