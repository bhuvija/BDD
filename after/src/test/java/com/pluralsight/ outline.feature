Feature: Github Login

Scenario: Sign in to github account
   Given that I am on github page
   When I enter username as bhuvijayerra@gmail.co
   And I enter password as yerra@123 
   Then I should be logged into my github account
   
Scenario: Sign in failed Relogin should appear
   Given that I am on github page
   When I enter username as bhuvijayerra@gmail.com 
   And I enter password as yerra@
   Then I should relogin
   
Scenario: Sign in failed Relogin should appears
   Given that I am on github page
   When I enter username as bhuvijayerra@gmail.com 
   And I enter password as yerra@123
   Then I should relogin to success