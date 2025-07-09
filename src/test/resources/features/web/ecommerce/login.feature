# encoding: utf-8

  Feature: Login validation
    As an QA Automation
    I want to test login of the e-commerce
    To validate different flows behaviour correctly

    @all @login
    Scenario Outline: Login attempt outcome based on user type
      Given the user is on the login page
      When they log in as "<user>" and "<password>"
      Then they should see the dashboard if "<status>"

      Examples:
        | user          | password     | status |
        | standard_user | secret_sauce | true   |
        | unknown_user  | secret_sauce | false  |

    @all @login
    Scenario: Login attempt outcome based on incorrect password
      Given the user is on the login page
      When they attempt to log in as "standard_user" with the incorrect password "incorrect_password"
      Then they should see the dashboard if "false"

    @all @login
    Scenario: Logout attempt outcome
      Given the user is on the login page
      When they attempt to log in as "standard_user" with the incorrect password "secret_sauce"
      Then they should logout