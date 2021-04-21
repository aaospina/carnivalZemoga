package org.example.actions;

import net.serenitybdd.core.pages.PageObject;

public class MouseActions extends PageObject {

  public void dragAndDrop(int limitA, int limitB) {
    getDriver().getCurrentUrl();
    String MIN_POINTER_LOCATOR = "//span[@ng-style='minPointerStyle']";
    String MAX_POINTER_LOCATOR = "//span[@ng-style='maxPointerStyle']";

    // These variables will be obtained from the slider webelement In a future PR
    int minPrice = 400;
    int maxPrice = 1200;

    withAction().dragAndDropBy($(MIN_POINTER_LOCATOR), (limitA - minPrice), 0).build().perform();
    withAction().dragAndDropBy($(MAX_POINTER_LOCATOR), (limitB - maxPrice), 0).build().perform();
  }
}
