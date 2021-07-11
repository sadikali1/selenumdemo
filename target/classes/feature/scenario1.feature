Feature: Title of your feature
  I want to use this template for my feature file

  @Smoke
  Scenario: add two number
    Given both numbers are 10 and 20
    When I added both numbers
    Then I verify result is 30
    And I verify
    
    
  @Regression
  Scenario Outline: add two values using scenario
    Given both numbers are <firstValue> and <secondValue>
    When I added both numbers
    Then I verify result is <expected>

    Examples: 
      | firstValue | secondValue | expected |
      |         10 |          20 |       30 |
      |          8 |          20 |       27 |
      |         15 |          10 |       25 |
 
