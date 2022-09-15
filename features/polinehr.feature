Feature: Poline Hr

  Scenario: Checking the all  functionalities of Hr module
    Given get the url and navigate to it
    When click on hr button
    And enter the email as "hr@poline.com"
    And enter the password as  "Pa$$w0rd!!"
    Then click on sign in button
    Then click on branch
    And click on logout button
