# encoding: utf-8

  Feature: Purchase validation
    As an QA Automation
    I want to test purchase of the e-commerce
    To validate different flows behaviour correctly

    @all @purchase
    Scenario Outline: Successful product purchase
      Given the user is on the login page
      When they log in as "<user>" and "<password>"
      And they complete the checkout process
      Then they should see the order confirmation screen

      Examples:
        | user          | password     |
        | standard_user | secret_sauce |