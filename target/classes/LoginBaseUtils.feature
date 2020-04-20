Feature: Login functionality with BaseUtils
  In order to do internet banking 
  As a valid Para Bank Customer
  I want to login successfully

  
  Scenario Outline: Login successful with BaseUtils
    Given I am in the Login page of Para Bank Application BaseUtils
    When I enter valid credentials BaseUtils <username> and <password> with <userFullName>
    Then I should be taken to the Overview Page BaseUtils
    
    Examples: 
    |username|password|userFullName|
    |"Test22"|"password"|"aaa bbb"|
    |"Test123"|"password"|"Test 1234"|
    