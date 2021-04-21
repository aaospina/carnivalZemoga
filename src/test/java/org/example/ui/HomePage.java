package org.example.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:home.page")
public class HomePage extends PageObject {

  public static final Target CLOSE_MODAL =
      Target.the("close modal").located(By.className("vifp-close"));
  public static final Target SAIL_TO_LINK =
      Target.the("sail to link").located(By.id("cdc-destinations"));
  public static final Target DESTINATION_OPTION =
      Target.the("port option").locatedBy("//button[contains(text(), '{0}')]");
  public static final Target DURATION_LINK =
      Target.the("duration link").located(By.id("cdc-durations"));
  public static final Target DURATION_OPTION =
      Target.the("duration option").locatedBy("//button[contains(text(), '{0}')]");
  public static final Target SEARCH_BUTTON =
      Target.the("search button").located(By.xpath("//a[@class='cdc-filters-search-cta']"));
}
