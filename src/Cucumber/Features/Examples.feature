Feature: Add Address
  Scenario Outline: Change user address
    Given User is signed up at https://prod-kurs.coderslab.pl/index.php

    When User goes to New Address

    Then keyword <alias> <address> <city> <zip/postal code> <country> <phone> is entered in input field

    And User saves information

    Examples:
    |alias      |   address   |   city    | zip/postal code   | country         | phone      |
    |Krzak      | Long Street | London    |  80-111           | United Kingdom  | 1010101099 |