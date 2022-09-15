Feature: login_button

  Scenario: Open login form
    Given I am in the page target
    And I click in the link login
    And I fill the email field
    When I click on the submit button
    Then a web page with the title <CREATE AN ACCOUNT> is opened