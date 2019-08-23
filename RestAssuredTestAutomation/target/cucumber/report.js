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
  "duration": 4987449600,
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
  "duration": 7627021700,
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
  "duration": 24697300,
  "status": "passed"
});
formatter.before({
  "duration": 16986300,
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
  "duration": 403844400,
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
  "duration": 3921000,
  "status": "passed"
});
formatter.before({
  "duration": 21089500,
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
  "duration": 406593300,
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
  "duration": 74098400,
  "status": "passed"
});
formatter.uri("GetOperations.feature");
formatter.feature({
  "line": 2,
  "name": "verify all operations with rest-assured",
  "description": "",
  "id": "verify-all-operations-with-rest-assured",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@GetOperation"
    }
  ]
});
formatter.before({
  "duration": 17358200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify get operations",
  "description": "",
  "id": "verify-all-operations-with-rest-assured;verify-get-operations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I perform get operation for \"employees/1\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "validate user first name is \"laxmi\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "employees/1",
      "offset": 29
    }
  ],
  "location": "GetOperationsValidationSteps.iPerformGetOperationFor(String)"
});
formatter.result({
  "duration": 2711948500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "laxmi",
      "offset": 29
    }
  ],
  "location": "GetOperationsValidationSteps.validateFirstName(String)"
});
formatter.result({
  "duration": 941515000,
  "status": "passed"
});
});