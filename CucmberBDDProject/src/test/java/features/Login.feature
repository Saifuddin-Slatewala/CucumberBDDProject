# This is a Gherkin language written Feature File for Login Functionality

Feature: User Login
Registered User should be able to Login

Background:
Given User navigates to Login Page

@Login @ValidCredentials @all @Smoke @Regression
Scenario Outline: Login with Valid credentials
When User enters valid email address <email>
And User enters valid password <password>
And User clicks on Login button
Then User should be logged in successfully 
# using examples for more than one data !!
Examples:
|email                |password |
|szslatewalagmail.com |12345    |
|aqslatewala@gmail.com|123456789|

@Login @ValidEmailInvalidPasswordCredentials @all @Smoke @Regression
Scenario: Login with valid email address and invalid password credentials
When User enters valid email address "szslatewala@gmail.com"
And User enters invalid password "123"
And User clicks on Login button
Then User should not be logged in and display an error message 

@Login @InvalidEmailValidPasswordCredentials @all @Regression
Scenario: Login with invalid email address and valid password credentials
When User enters invalid email address "szslatewa@gmail.com"
And User enters valid password "12345" 
And User clicks on Login button
Then User should not be logged in and display an error message 

@Login @InvalidCredentials @all @Regression
Scenario: Login with invalid credentials 
When User enters invalid email address "szslatewa@gmail.com"
And User enters invalid password "13456"
And User clicks on Login button
Then User should not be logged in and display an error message 

@Login @NoCredentials @all @Regression
Scenario: Login with no credentials
When User enters no email address
And User enters no password
And User clicks on Login button
Then User should not be logged in and display an error message 

