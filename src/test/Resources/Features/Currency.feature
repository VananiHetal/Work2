
@eurocurrancy

Feature: When user select on euro
  user should able to see product in eurocurrancy only.

  Scenario: user should able to see product in eurocurrancy

    Given user is on hompage
    When user select euro currancy
    Then user is able to see product in euro currancy
