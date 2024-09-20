# This is a Gherkin Language written Feature File for Search Functionality

Feature: Search Functionality

@Search @ValidSearch @all @Smoke @Regression
Scenario: Search for a valid product
Given user open the application
When user enter valid product name in search field
And user click on search button
Then Valid product details should be shown in search results

@Search @InValidSearch @all @Regression
Scenario: Search for a invalid product
Given user open the application
When user enter invalid product name in search field
And user click on search button
Then proper error message should be shown

@Search @NoSearch @all @Regression
Scenario: Search for a no input 
Given user open the application
When user enter nothing in search field
And user click on search button
Then proper error message should be shown