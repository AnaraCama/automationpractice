@create-account
Feature: New Account

  Scenario: User logins with the newly created valid credentials
    Given User navigates to "http://automationpractice.com/index.php"
    When User creats a new account with following email
      | email | johndoe22@gmail.com |
    And User clicks on Create an account button
    Then User launches to Account page
    And User creates an account with following information
      | FirstName   | John       |
      | LastName    | Doe        |
      | Email       | johndoe22@gmail |
      | Password    | 123qwe!    |
      | Address     | Clark st   |
      | City        | Chicago    |
      | State       | Illinois         |
      | PostalCode  | 60613      |
      | MobilePhone | 3123459812 |
    And User clicks on Register button
    Then User signs out

    Then User clicks on sign in button
    And User launches to Login Page
    And User logins with invalid credentials
      | emailAddress  |  password  |
      | anar.com      |  123qwe    |
    When User clicks on Sign in button