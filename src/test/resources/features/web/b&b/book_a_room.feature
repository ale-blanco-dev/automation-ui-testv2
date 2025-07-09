# encoding: utf-8

Feature: Book a room B&B
  As an QA Automation
  I want to test book a room in a B&B
  To validate the website

  @all @purchase
  Scenario: Successful book room
    Given the user selected a room
    When making a reservation
    Then confirm a reservation of that room