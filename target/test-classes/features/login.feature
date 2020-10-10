@login @spring2
Feature: Login

  #Background:
  #Given I open browser and navigate to SyntaxHRMS #precondition
  #@smoke
  #Scenario: Validate positive login
  #When I enter username
  #And I enter password
  #And I click on login button
  #Then I successfully login SyntaxHRMS
  #@regression
  #Scenario Outline: Validate Error Messages with Negative Login
  #Given I enter  "<username>"
  #And I am enter "<password>"
  #When I click on login button
  #Then I see "<errMsg>"
  #
  #Examples:
  #| username | password    | errMsg                   |
  #| admin    | Hum@nhrm12  | Invalid credentials      |
  #| admi     | Hum@nhrm123 | Invalid credentials      |
  #| admi     | Hum@nhrm12  | Invalid credentials      |
  #|          | Hum@nhrm123 | Username cannot be empty |
  #| admin    |             | Password cannot be empty |
  #@regression
  #Scenario: Validate Error Messages with Cucumber DataTable
    #Given I enter  username and password and I click login button and I see errMsg
      #| username | password    | errMsg                   |
      #| admin    | Hum@nhrm12  | Invalid credentials      |
      #| admi     | Hum@nhrm123 | Invalid credentials      |
      #| admi     | Hum@nhrm12  | Invalid credentials      |
      #|          | Hum@nhrm123 | Username cannot be empty |
      #| admin    |             | Password cannot be empty |

  @regression
  Scenario: Validate Error Messages with Cucumber Excell file
    Given I enter  username and password from an excell and I click login button and I see error message on excell file
