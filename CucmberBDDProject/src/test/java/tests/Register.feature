# This is a Gherkin language written Feature File for Register Functionality

Feature: User Registration

Background: 
Given User is on registration page

@Register @MandatoryFields @all @Smoke @Regression
Scenario: Register with mandatory fields
When user enters firstname "Saifuddin" in firstname field
And user enters lastname "Slatewala" in lastname field
And user enters email address "szslatewala@gmail.com" in email address field
And user enters telephone "9081778252" in telephone field
And user enters password  "12345" in password field
And user enters password confirm "12345" in confirm password field
And user select on privacy field
And user clicks on continue button
Then user account should be created successfully  

@Register @AllFields @all @Smoke @Regression
Scenario: Register with all fields

When user enters firstname "Saifuddin" in firstname field
And user enters lastname "Slatewala" in lastname field
And user enters email address "szslatewala@gmail.com" in email address field
And user enters telephone "9081778252" in telephone field
And user enters password  "12345" in password field
And user enters password confirm "12345" in confirm password field
And user select privacy field
And user clicks on continue button
And user select newsletter option
Then user account should be created successfully

@Register @NoFields @all @Regression
Scenario: Register without any fields

When user enters nothing in firstname field
And user enters nothing  in lastname field
And user enters  nothing in email address field
And user enters nothing in telephone field
And user enters nothing in password field
And user enters nothing in confirm password field
And user dont select privacy field
And user clicks on continue button
Then user account should not be created successfully and an error messages should be displayed for all fields

@Register @DuplicateEmailField @all @Regression
Scenario: Register with duplicate email address

When user enters firstname "Saifuddin" in firstname field
And user enters lastname "Slatewala" in lastname field
And user enters email address "szslatewala@gmail.com" in email address field
And user enters telephone "9081778252" in telephone field
And user enters password  "12345" in password field
And user enters password confirm "12345" in confirm password field
And user select privacy field
And user clicks on continue button
And user select newsletter option
Then user account should not be created successfully and an error messages should be displayed
