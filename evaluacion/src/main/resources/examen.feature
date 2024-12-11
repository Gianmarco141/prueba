Feature: core_enrol_get_users_courses

  Background:
    * def tokenXY = null

  Scenario: obtener token
    Given url 'https://bensg.com/test-qalab/login/token.php'
    And param username = 'pf40002'
    And param password = 'Password1!'
    And param service = 'moodle_mobile_app'
    When method post
    Then status 200
    And match response.token != null
    * def tokenXY = response.token

    Scenario: usando token
      Given url 'https://bensg.com/test-qalab/webservice/rest/server.php'
      And header Content-Type = 'aplication/x-www-form-urlencoded'
      And param wsfunction = 'core_enrol_get_users_courses'
      And param wstoken = tokenXY
      And param moodlewsrestformat = 'json'
      When method get
      Then status 200
      * print 'El body response es:' response

   

