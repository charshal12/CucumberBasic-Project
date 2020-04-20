#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login functionality DataTable
  In order to do internet banking 
  As a valid Para Bank Customer
  I want to login successfully

  
  Scenario: Login successful
    Given I am in the Login page of Para Bank Application using DataTable
    When I enter valid credentials using DataTable
    |Test22|password|
    Then I should be taken to the Overview Page using DataTable
    
    