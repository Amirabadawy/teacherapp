Feature: Check creating course

  Scenario Outline: Validate E2E scenario for creating course
    Given click on get started button
    When login with valid email "<email>" and valid password "<password>" in login page
    And click on login button in login page
    And click on skip button in home page
    And click on mobile course in home page
    And click on member tab in course page
    And click on skip button in course page
    And click on Test Student in course page
    Then title should be "<title>"
    Examples:
      | email                       | password   | title                     |
      | Test.teacher@mailinator.com | Abc_123    | Mobile Automation         |