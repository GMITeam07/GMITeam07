@checkPassword

Feature: User create new password

  Background: user is on the GMIBank homepage

  Scenario: Check password
    Given user is on the GMIBank homepage
    Then click user icon
    Then click register button
    Then click new password
    Then enter the given password
    Then password must contain at least seven characters
    Then checks if the password has numbers
    Then checks if the password has an uppercase letter
    Then checks if the password has a lowercase letter
    Then checks if the password has a special character
    Then If all conditions are met, verify that the password has met the requested criteria.



