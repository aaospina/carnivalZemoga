package org.example.questions;

import static org.example.ui.CruiseDetail.BOOKING_NOW_BUTTON;
import static org.example.ui.CruiseDetail.CRUISE_DESCRIPTION;
import static org.example.ui.CruiseDetail.DETAIL_OF_THE_DAY;
import static org.example.ui.GridResults.CRUISE_PRICE;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.targets.TheTarget;

public class IsTheItineraryDetailsShown {

  @Subject("It is the description")
  public static Question<String> description() {
    return TheTarget.textOf(CRUISE_DESCRIPTION);
  }

  public static Question<String> detailDay(String day) {
    return TheTarget.textOf(DETAIL_OF_THE_DAY.of(day));
  }

  public static Question<String> bookNowButton() {
    return TheTarget.textOf(BOOKING_NOW_BUTTON);
  }
}
