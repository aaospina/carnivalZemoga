package org.example.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CruiseDetail {

  public static final Target CRUISE_DESCRIPTION =
      Target.the("cruise description").located(By.id("cruiseDescrGlance"));
  public static final Target DETAIL_OF_THE_DAY =
      Target.the("detail of the day").locatedBy("//p[@class='day']/span[contains(text(), '{0}')]");
  public static final Target BOOKING_NOW_BUTTON =
      Target.the("booking now button")
          .located(By.xpath("//li//span[@ng-click='goToBooking(url)']"));
}
