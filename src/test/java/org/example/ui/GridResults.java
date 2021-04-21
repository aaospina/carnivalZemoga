package org.example.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GridResults extends PageObject {

  public static final Target GRID_RESULTS =
      Target.the("grid results").located(By.className("grid"));
  public static final Target PRICING_FILTER =
      Target.the("pricing filter").located(By.id("sfn-nav-pricing"));
  public static final Target ARTICLE = Target.the("articles").locatedBy("//article[{0}]");
  public static final Target CRUISE_PRICE =
      Target.the("cruise price")
          .locatedBy("//article[{0}]//span[@class='vrl-item__price']/span[1]");
  public static final Target CRUISE_DURATION =
      Target.the("cruise price")
          .locatedBy("//article[{0}]//span[@class='cgc-cruise-glance__duration-title']/span/span");
  public static final Target MINIMUN_PRICE =
      Target.the("minimunt pointer").locatedBy("//span[@ng-style='minPointerStyle']");
}
