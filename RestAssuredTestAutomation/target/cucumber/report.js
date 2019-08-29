$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CodeTask.feature");
formatter.feature({
  "line": 2,
  "name": "Incubation api code task",
  "description": "",
  "id": "incubation-api-code-task",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@codeTask"
    }
  ]
});
formatter.before({
  "duration": 600605200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "get base url",
  "keyword": "Given "
});
formatter.match({
  "location": "CodeTaskSteps.getBaseUrl()"
});
formatter.result({
  "duration": 1130831200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "validate status of base url",
  "description": "",
  "id": "incubation-api-code-task;validate-status-of-base-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "validate status code 200 and status message \"OK\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 21
    },
    {
      "val": "OK",
      "offset": 45
    }
  ],
  "location": "CodeTaskSteps.validateStatusCodeAndStatusMessage(int,String)"
});
formatter.result({
  "duration": 2694000,
  "status": "passed"
});
formatter.before({
  "duration": 1583400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "get base url",
  "keyword": "Given "
});
formatter.match({
  "location": "CodeTaskSteps.getBaseUrl()"
});
formatter.result({
  "duration": 291694601,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "validate header content type",
  "description": "",
  "id": "incubation-api-code-task;validate-header-content-type",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "validate content type header value is\"application/json; charset\u003dutf-8\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "application/json; charset\u003dutf-8",
      "offset": 38
    }
  ],
  "location": "CodeTaskSteps.validateContentTypeHeaderValueIs(String)"
});
formatter.result({
  "duration": 1980601,
  "status": "passed"
});
formatter.before({
  "duration": 7118600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "get base url",
  "keyword": "Given "
});
formatter.match({
  "location": "CodeTaskSteps.getBaseUrl()"
});
formatter.result({
  "duration": 281206601,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "validate the content of the response body",
  "description": "",
  "id": "incubation-api-code-task;validate-the-content-of-the-response-body",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "validate the content of the response body is the array of 10 users",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 58
    }
  ],
  "location": "CodeTaskSteps.validateTheContentOfTheResponseBodyIsTheArrayOfUsers(int)"
});
formatter.result({
  "duration": 513239099,
  "status": "passed"
});
formatter.before({
  "duration": 2529300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "get base url",
  "keyword": "Given "
});
formatter.match({
  "location": "CodeTaskSteps.getBaseUrl()"
});
formatter.result({
  "duration": 251949000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "get all users name",
  "description": "",
  "id": "incubation-api-code-task;get-all-users-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "get all users name",
  "keyword": "Then "
});
formatter.match({
  "location": "CodeTaskSteps.getAllUsersName()"
});
formatter.result({
  "duration": 1510700,
  "status": "passed"
});
formatter.before({
  "duration": 2304100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "get base url",
  "keyword": "Given "
});
formatter.match({
  "location": "CodeTaskSteps.getBaseUrl()"
});
formatter.result({
  "duration": 266898800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "validate company name for given user",
  "description": "",
  "id": "incubation-api-code-task;validate-company-name-for-given-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "validate user \"Leanne Graham\" company name is \"Romaguera-Crona\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Leanne Graham",
      "offset": 15
    },
    {
      "val": "Romaguera-Crona",
      "offset": 47
    }
  ],
  "location": "CodeTaskSteps.validateUserCompanyNameIs(String,String)"
});
formatter.result({
  "duration": 291263899,
  "status": "passed"
});
});