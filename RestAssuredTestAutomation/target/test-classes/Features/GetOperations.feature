Feature: verify all operations with rest-assured

Scenario: verify get operations
  Given I perform get operation for "employees/1"
  Then validate user first name is "laxmi"



