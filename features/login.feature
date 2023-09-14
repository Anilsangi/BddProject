Feature: Login

  Scenario: Successful login with valid credentials
  
    Given User Launch Chrome Browser
    When  User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And   User enters Email as "admin@yourstore.com" and Password as "admin"
    And   click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on Logout link
    Then page title should be "Your store. Login"
    And Close Browser
    
    
     Scenario Outline: Login Datadriven
  
    Given User Launch Chrome Browser
    When  User Opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And   User enters Email as "<email>" and Password as "<password>"
    And   click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on Logout link
    Then page title should be "Your store. Login"
    And Close Browser
    
    Examples:
           |email|password|
           |admin@yourstore.com|admin|
           |admin@yourstore.com|admin123|
     