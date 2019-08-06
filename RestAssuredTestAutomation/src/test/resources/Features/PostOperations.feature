Feature: verify all post operations


  Scenario: Add one employee data in employee record
    Given add employee data in "employees" url
    |first_name|last_name|email|
    |laxmi|bala|laxmi@epam.com|
    Then verify employee "laxmi" added successfully


  Scenario: Add one employee data in employee record
    Given add employee data in "employees" url
      |first_name|last_name|email|
      |ram|singh|ram@epam.com|
    Then verify employee "ram" added successfully








