Feature: User Feature
  In order to perform successful operation as a admin has to perform certain operations



  #####adminShouldAddUserSuccessFully().
  # Login to Application
  # click On "Admin" Tab
  # Verify "System Users" Text
  # click On "Add" button
  # Verify "Add User" Text
  # Select User Role "Admin"
  # enter Employee Name "Ananya Dash"
  # enter Username
  # Select status "Disable"
  #enter psaaword
  # enter Confirm Password
  # click On "Save" Button
  # verify message "Successfully Saved"
  @sanity @smoke @author_Manish
  Scenario: Admin should add user successfully
    Given I am on homepage
    When I enter email "Admin" in email field
    And I enter password "admin123" in password field
    And I click on login button
    And I click on admin button
    And I should reach admin page successfully
    And I click on add button
    And I should reach add option successfully
    And I select the user role"Admin"
    And I enter employee name "Ranga Akunuri"
    And I select status "Disabled"
    And I enter username "rupaani"
    And I enter the password"prime123"
    And I enter confirm Password"prime123"
    And I click on save button
    Then I should saved user successfully



  #### searchTheUserCreatedAndVerifyIt().
  # Login to Application
  # click On "Admin" Tab
  # Verify "System Users" Text
  # Enter Username
  # Select User Role
  # Select Satatus
  # Click on "Search" Button
  # Verify the User should be in Result list

  @sanity@smoke@author_Manish
  Scenario: search the user created and verify it
    Given I am on homepage
    When I enter email "Admin" in email field
    And I enter password "admin123" in password field
    And I click on login button
    And I click on admin button
    And I should reach admin page successfully
    And I enter username "rupaani"
    And I select the user role"Admin"
    And I enter employee name "Ranga Akunuri"
    And I select status "Disabled"
    And I click on search button
    Then I should check user should in results


    ##### verifyThatAdminShouldDeleteTheUserSuccessFully().
    # Login to Application
    # click On "Admin" Tab
    # Verify "System Users" Text
    # Enter Username
    # Select User Role
    # Select Satatus
    # Click on "Search" Button
    # Verify the User should be in Result list.
    # Click on Check box
    # Click on Delete Button
    # Popup will display
    # Click on Ok Button on Popup
    # verify message "Successfully Deleted"
  @sanity @author_Manish
  Scenario: verify that admin should delete the user successfully
    Given I am on homepage
    When I enter email "Admin" in email field
    And I enter password "admin123" in password field
    And I click on login button
    And I click on admin button
    And I should reach admin page successfully
    And I enter username "rupaani"
    And I select the user role"Admin"
    And I enter employee name "Ranga Akunuri"
    And I select status "Disabled"
    And I click on search button
    And I should check user should in results
    And I click on check button
    And I click on delete button
    And I click on popup display
    Then I should successfully deleted the user

    #####searchTheUserAndVerifyTheMessageRecordFound().
    # Login to Application
    # click On "Admin" Tab
    # Verify "System Users" Text
    # Enter Username <username>
    # Select User Role <userRole>
    # Enter EmployeeName <employeeName>
    # Select Satatus <status>
    # Click on "Search" Button
    # verify message "(1) Record Found"
    # Verify username <username>
    # Click on Reset Tab
  @author_Manish@regression
  Scenario Outline: verify the search the user and verify the message record found
    Given I am on homepage
    When I enter email "Admin" in email field
    And I enter password "admin123" in password field
    And I click on login button
    And I click on admin button
    And I should reach admin page successfully
    And I enter username "<username>"
    And I select the user role"<userrole>"
    And I enter employee name "<employeename>"
    And I select status "<status>"
    And I click on search button
    And I should check user should in results
    Then I should succeessfully check my name here"<username>"
    And I click on reset tab
    Examples:

      |username|userrole|employeename|status|
      |FMLName|ESS|Qwerty Qwerty LName|Enabled|


