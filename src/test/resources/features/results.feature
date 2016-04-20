Feature: landing page 
  Scenario: client makes call to GET /results
    When the client calls /results
    Then the client receives status code of 200
    And the client receives the string "Political"