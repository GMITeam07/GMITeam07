@checkPassword

Feature: User create new password

  Background: user tests password
    Given user is on new user registration page

  Scenario Outline:user tests empty password
    Then user enters a valid ssn "<ssnNumber>"
    Then user enters a valid first name "<firstName>"
    Then user enters a valid last name "<lastName>"
    Then user enter a valid address "<address>"
    Then user enter a valid Mobile Phone Number "<phone>"
    Then user enters a null password "<shortPassword>"
    Then user verifies the passwordrequired text is displayed

    Examples:
      | ssnNumber   | firstName | lastName | address    | phone        | shortPassword |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 |               |

  Scenario Outline: user tests short(3 digits) password
    Then user enters a valid ssn "<ssnNumber>"
    Then user enters a valid first name "<firstName>"
    Then user enters a valid last name "<lastName>"
    Then user enter a valid address "<address>"
    Then user enter a valid Mobile Phone Number "<phone>"
    Then user enters a password with three digits "<shortPassword>"
    Then user verifies the passwordrequired text is displayed

    Examples:
      | ssnNumber   | firstName | lastName | address    | phone        | shortPassword |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 123           |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 12A           |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 1Ac           |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | .2x           |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | aZ.           |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | abc           |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | XZY           |

  Scenario Outline: user tests short(4 digits and more) password
    Then user enters a valid ssn "<ssnNumber>"
    Then user enters a valid first name "<firstName>"
    Then user enters a valid last name "<lastName>"
    Then user enter a valid address "<address>"
    Then user enter a valid Mobile Phone Number "<phone>"
    Then user enters a password with four digits and more "<shortPassword>"
    Then user verifies the passwordrequired text is displayed

    Examples:
      | ssnNumber   | firstName | lastName | address    | phone        | shortPassword |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 1234          |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 12Az          |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 1Ac-          |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | .2x1          |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | aZ.123        |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | abcAC45.*     |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | XZY 123 wqz   |

   Scenario Outline: user tests valid password
    Then user enters a valid ssn "<ssnNumber>"
    Then user enters a valid first name "<firstName>"
    Then user enters a valid last name "<lastName>"
    Then user enter a valid address "<address>"
    Then user enter a valid Mobile Phone Number "<phone>"
    Then user enters a valid password "<validPassword>"
    Then user verifies the passwordrequired text is displayed

    Examples:
      | ssnNumber   | firstName | lastName | address    | phone        | validPassword |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 1234Ac.          |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 12Az45*          |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 1Ac-aaa          |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | XZY 123 wqz   |

  Scenario Outline: user tests  the first and second passwords different
    Then user enters a valid ssn "<ssnNumber>"
    Then user enters a valid first name "<firstName>"
    Then user enters a valid last name "<lastName>"
    Then user enter a valid address "<address>"
    Then user enter a valid Mobile Phone Number "<phone>"
    Then user enters a valid password "<validPassword>"
    Then user enters a different password to second box "<secondPassword>"
    Then user verifies the passwordrequired text is displayed

    Examples:
      | ssnNumber   | firstName | lastName | address    | phone        | validPassword |secondPassword|
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 1234Ac.          |           |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 12Az45*          |12az45*    |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | 1Ac-aaa          |1Ac-AAb    |
      | 123-11-1234 | Ali       | Can      | California | 538-456-1011 | XZY 123 wqz   |XYZ123wqz     |