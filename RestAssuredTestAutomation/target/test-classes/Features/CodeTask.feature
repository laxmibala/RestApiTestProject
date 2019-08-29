@codeTask
Feature: Incubation api code task

Background:
  Given get base url

  Scenario: validate status of base url
    Then validate status code 200 and status message "OK"

  Scenario: validate header content type
     Then validate content type header value is"application/json; charset=utf-8"

  Scenario: validate the content of the response body
     Then validate the content of the response body is the array of 10 users

   Scenario: get all users name
     Then get all users name

   Scenario: validate company name for given user
     Then validate user "Leanne Graham" company name is "Romaguera-Crona"