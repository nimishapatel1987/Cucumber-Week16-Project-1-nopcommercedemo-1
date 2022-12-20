Feature: HomePage Test
  As a user I want to go in to nop commerce website

  @sanity@regression
  Scenario: User should verify the Menu (Computer, Electronics, Apparel)
    Given User is selectMenu
    And User verify Computer
    And User verify Electronics
    Then User verify Apparel


