# This is a Gherkin language written Feature File for Register Functionality

Feature: User Registration

Background: 
Given User is on registration page

@Register @MandatoryFields @all @Smoke @Regression
Scenario: Register with mandatory fields
# Using Data table for more than one fields!!
When User enters below details
|firstname	     | Saifuddin          |
|lastname			   | Slatewala					|
|emailaddress	 	 |szslatewla@gmail.com|
|telephone			 |9081778252					|
|password        |12345    						|
|confirmpassword |12345     					|
And user select on privacy field
And user clicks on continue button
Then user account should be created successfully  

@Register @AllFields @all @Smoke @Regression
Scenario: Register with all fields

When User enters below details
|firstname	     | Saifuddin          |
|lastname			   | Slatewala					|
|emailaddress	 |szslatewla@gmail.com|
|telephone			 |9081778252					|
|password        |12345    						|
|confirmpassword|12345     					|
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

When User enters below details
|firstname	     | Saifuddin          |
|lastname			   | Slatewala					|
|emailaddress	 	 |szs@gmail.com|
|telephone			 |9081778252					|
|password        |12345    						|
|confirmpassword|12345     					|
And user select privacy field
And user clicks on continue button
And user select newsletter option
Then user account should not be created successfully and an error messages should be displayed
