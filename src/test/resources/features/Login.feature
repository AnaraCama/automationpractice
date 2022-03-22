Feature: LoginFunctionality




    Scenario: Verify error message when user signs in with invalid credentials
      Given User navigates to "http://automationpractice.com/index.php"
      When User clicks on sign in button
      Then User launches to Login Page
      And User logins with invalid credentials
      | emailAddress  |  password  |
      | anar.com      |  123qwe    |
      When User clicks on Sign in button
      Then User should see "There is 1 error", "Invalid email address." error messages













