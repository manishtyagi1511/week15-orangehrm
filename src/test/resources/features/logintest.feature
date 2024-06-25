
Feature: Login feature
  In order to perfrom successful login as a user I have to enter correct username and password

  @smoke@author_Manish
  Scenario: verify user should login successfully
    Given I am on homepage
    When I enter email "Admin" in email field
    And I enter password "admin123" in password field
    And I click on login button
    Then I should login page successfully


  #### verifyThatTheLogoDisplayOnHomePage()
  # Login To The application
  # Verify Logo is Displayed

  @smoke@sanity@author_Manish
  Scenario: verify that the logo display on homepage
    Given I am on homepage
    When I enter email "Admin" in email field
    And I enter password "admin123" in password field
    And I click on login button
    Then  the logo is displayed successfully


    ####. verifyUserShouldLogOutSuccessFully()
    # Login To The application
    # Click on User Profile logo
    # Mouse hover on "Logout" and click
    # Verify the text "Login Panel" is displayed

  @smoke@sanity@author_Manish
  Scenario: verify the user should logout successfully
    Given I am on homepage
    When I enter email "Admin" in email field
    And I enter password "admin123" in password field
    And I click on login button
    And I click on  user prfile logo
    And I mouse hover and click on logout button
    Then I should log out successfully


    #### verifyErrorMessageWithInvalidCredentials()
    # Enter username <username>
    # Enter password <password>
    # Click on Login Button
    # Verify Error message <errorMessage
  @smoke@author_Manish
  Scenario Outline: verify error message with invalid credentials
    Given I am on homepage
    When I enter email "<username>" in email field
    And I enter password "<password>" in password field
    And I click on login button
    Then I should not login successfully"<errorMessage>"
    Examples:
      |username | password | errorMessage |
      |         |           | Required |
      |test123@gmail.com |   | Required |
