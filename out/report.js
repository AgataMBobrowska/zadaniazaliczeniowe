$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddressEdit.feature");
formatter.feature({
  "line": 1,
  "name": "Edit Address",
  "description": "",
  "id": "edit-address",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Change user address",
  "description": "",
  "id": "edit-address;change-user-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User goes to AddressesPage",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User edit address",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User saves information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User sees \"Information successfully updated.\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("EditUserProfile.feature");
formatter.feature({
  "line": 1,
  "name": "Change user information after login",
  "description": "",
  "id": "change-user-information-after-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Change user birthdate, gender and sign up for a newsletter",
  "description": "Given: User is Logged",
  "id": "change-user-information-after-login;change-user-birthdate,-gender-and-sign-up-for-a-newsletter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User goes to UserInformationPage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User signs up for our newsletter",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User saves information",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User sees \"Information successfully updated.\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("google-search-text.feature");
formatter.feature({
  "line": 1,
  "name": "Google search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword \u003ckeyword\u003e is entered in input field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain \u003cexpectedWord\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;",
  "rows": [
    {
      "cells": [
        "keyword",
        "expectedWord"
      ],
      "line": 10,
      "id": "google-search;user-can-search-any-keyword;;1"
    },
    {
      "cells": [
        "selenium",
        "selenium"
      ],
      "line": 11,
      "id": "google-search;user-can-search-any-keyword;;2"
    },
    {
      "cells": [
        "Robert Lewandowski",
        "Euro 2021"
      ],
      "line": 12,
      "id": "google-search;user-can-search-any-keyword;;3"
    },
    {
      "cells": [
        "elektroda",
        "temat do zamkniecia"
      ],
      "line": 13,
      "id": "google-search;user-can-search-any-keyword;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword selenium is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain selenium",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleStepsDefinition.openGoogleSearch()"
});
formatter.result({
  "duration": 2856987100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 10
    }
  ],
  "location": "GoogleStepsDefinition.enterKeyword(String)"
});
formatter.result({
  "duration": 785974800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 29
    }
  ],
  "location": "GoogleStepsDefinition.theFirstOneShouldContainKeyword(String)"
});
formatter.result({
  "duration": 333500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepsDefinition.closeBrowser()"
});
formatter.result({
  "duration": 1187239000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword Robert Lewandowski is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain Euro 2021",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleStepsDefinition.openGoogleSearch()"
});
formatter.result({
  "duration": 1842985100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Robert Lewandowski",
      "offset": 10
    }
  ],
  "location": "GoogleStepsDefinition.enterKeyword(String)"
});
formatter.result({
  "duration": 617436600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Euro 2021",
      "offset": 29
    }
  ],
  "location": "GoogleStepsDefinition.theFirstOneShouldContainKeyword(String)"
});
formatter.result({
  "duration": 128000,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepsDefinition.closeBrowser()"
});
formatter.result({
  "duration": 694732700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword elektroda is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain temat do zamkniecia",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleStepsDefinition.openGoogleSearch()"
});
formatter.result({
  "duration": 1826071300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "elektroda",
      "offset": 10
    }
  ],
  "location": "GoogleStepsDefinition.enterKeyword(String)"
});
formatter.result({
  "duration": 789639300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "temat do zamkniecia",
      "offset": 29
    }
  ],
  "location": "GoogleStepsDefinition.theFirstOneShouldContainKeyword(String)"
});
formatter.result({
  "duration": 110400,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepsDefinition.closeBrowser()"
});
formatter.result({
  "duration": 692357000,
  "status": "passed"
});
});