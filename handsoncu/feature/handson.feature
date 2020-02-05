Feature: login:
Scenario Outline: verify the admin login:

 Given User is on home page
 When User is on login page
 And User enter "<username>" and "<password>"
 Then  User should successfully login
 
 Examples:
 |username|password|
 |admin|admin|
 
 Scenario Outline: Subcategory
 Given User successfully login
 When User have to select the category
 And user will select "<category>" and "<subCategory>"
 Then user successfully add the product
 
 Examples:
 |category|subcategory|
 |sports|Basketball|
 |sports|Volleyball|

  

