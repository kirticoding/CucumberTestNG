
Feature: Login of Saucedemo

  Scenario: Title of your scenario
    Given User is on Login page
    When User enters valid "<userName>" and "<password>"
    And User clicks on Login button
    Then User is navigate to home page
    And close the browser

Examples:
| userName | password |
| standard_user | secret_sauce |
| problem_user | secret_sauce |
| performance_glitch_user | secret_sauce |