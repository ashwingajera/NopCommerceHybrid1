Feature: To verify user can register successfully
  @register
  Scenario: User should able to register successfully
    Given User is  on register page
    When User enter all details for registration
    Then User should able to register successfully
