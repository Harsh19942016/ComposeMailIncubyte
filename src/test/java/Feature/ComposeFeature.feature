Feature: Compose Email Functionality in Gmail

  Background:

    Given  User is on Gmail login page
    When   User logs in with valid credentials

  Scenario: Verify that the compose function opens correctly

    Then User should be able to open the compose window
    And User should be able to close the compose window

  Scenario: Verify that the email subject field is present and accepts input

    When User able opens the compose window
    Then User should be able to enter a subject in the email
    And User should be able to verify the entered subject

  Scenario: Verify that the email body field is present and accepts input

    When User opens the compose window
    Then User should be able to enter a body in the email
    And User should be able to verify the entered body

  Scenario: Verify that the email can be sent successfully

    Then User opens the compose window
    And User fills recipient, subject, and body fields
    And User should be able to send the email
    And User should view  confirmation message
