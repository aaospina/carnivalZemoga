Feature: Itinerary detail

  Scenario: Filter cruises by price

    Given Luis has a grid of cruises to Bahamas with a duration of '2 - 5 Days'
    When He chooses one sail of 2 days
    Then the itinerary will be loaded
    And the detail of each day will be showed
    And the BOOK NOW button will be placed into the page