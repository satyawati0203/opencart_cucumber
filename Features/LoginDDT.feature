Feature: Login Data Driven

	
  Scenario Outline: Login Data Driven
    Given User Launch browser
    And opens URL "http://localhost/opencart/upload/"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login button
    Then User navigates to MyAccount Page

    Examples: 
      | email                	    | password |
      | satyakardam123@gmail.com  | test@123 |
      | g.satya0203@gmail.com 		| test@123 |