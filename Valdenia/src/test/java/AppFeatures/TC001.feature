Feature: Validate the product price for a full special support plan for 6 months simulation

  Scenario Outline: I want to calculate the price for a full special plan
    Given I open Chrome and launch the application
    When Select type "<type>"
    And Select support plan "<plan>"
    And Write monthly duration of <number>
    And Click in calculate price button
    Then I see the correct price "<price>"

    Examples:
      | type    | plan | number | price  |
      | Special | Full | 6        | 2249.10 $ |



