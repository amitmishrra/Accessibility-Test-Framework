@Test
Feature: Accesibility Test of Sarcastic CowBoy
  Scenario: Home page Test
    Given SetUp Browser
    Given Open Home page "https://www.sarcasticcowboy.com/"
    Then Accesibility Test
    Then Tear Down the test