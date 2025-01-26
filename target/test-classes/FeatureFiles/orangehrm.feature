@OrangeHRMTest
Feature: Test OrangeHRM Application

  Scenario: Validate login page
    When user enter  username as "Admin"
    Then click on login button
    And capture warning message

  Scenario: Validate login page
    When user enter  password as "admin123"
    Then click on login button
    And capture warning message

  Scenario: Validate login page functinality with invalid credentials
    When user enter  username as "admin"
    When user enter  password as "Admin123"
    Then click on login button
    And capture warning message as "Invalid credentials"

  Scenario: Validate login page functinality with valid credentials
    When user enter  username as "Admin"
    When user enter  password as "admin123"
    Then click on login button
