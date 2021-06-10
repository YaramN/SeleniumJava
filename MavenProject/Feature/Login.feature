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

Feature: Anazon functionalities

@test
Scenario: Search a product
Given I have search field in amazon Page with "https://www.amazon.in/"
Then moveover to signin and click on sign in
Then search for product with "Sony"
Then search for product with "Samsung"
When I clicked on drop downa and  selected options








#@test
#Scenario Outline: Search a product
#Given I have search field in amazon Page with "<url>"
#Then search for product with "<name>"
#Then Product with name "Sony" should be displayed
#
#Examples:
#| url                    | name |
#| https://www.amazon.in/ | Sony |