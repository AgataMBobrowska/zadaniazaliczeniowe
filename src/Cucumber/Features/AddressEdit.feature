Feature: Edit Address
Scenario: Change user address
When User goes to AddressesPage

And User edit address

And User saves information

Then User sees "Information successfully updated."