
@tag1
Feature: Login

@tag2
Scenario: Successful Login with valid credentials
      
       Given User should be launched chrome browser
       When User Enter the NoCommerce Application URL address
       And User should enter the Emailid and password 
       And  User should Click Login Button
      Then User should Verify the Title
      When User should Click Logout Button
     #  Then Page Title should be 
       And User should Close the Browser