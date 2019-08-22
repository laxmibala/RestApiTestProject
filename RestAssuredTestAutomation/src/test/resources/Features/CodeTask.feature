@codeTask
Feature: Incubation api code task


  Scenario: validate status of base url
    Given get base url
    Then validate status code 200 and status message "OK"