Feature: Change user information after login

  Scenario: Change user birthdate, gender and sign up for a newsletter
    Given User is Logged
    When User goes to UserInformationPage

    And User signs up for our newsletter

    And User saves information

    Then User sees "Information successfully updated."