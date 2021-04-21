Feature: Cruise search

  Scenario: Cruises search
    Given Pedro is on the cruise search platform
    When He searches cruises to Bahamas with duration of '6 - 9 Days'
    Then a set of result will be desplayed

  Scenario: Filter cruises by price
    Given Pedro has a grid of cruises to Bahamas
    When He filters cruises by price between 500 and 1000
    Then the cruises with the price selected will be desplayed