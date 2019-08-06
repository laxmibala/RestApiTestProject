Feature: verify delete operation with rest-assured


  Scenario Outline: delete one employee data in employee record
   Given perform delete operation for employee id "<id>" in "employees/{eid}"
    Then verify employee id "<id>" deleted successfully


Examples:
    |id|
    |2|


