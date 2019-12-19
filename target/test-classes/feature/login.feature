@tag
Feature: log in to adactin
  I want to book rooms

  @tag1
  Scenario: book rooms by logging in
    Given to validate log in page
    When validate the user name and password
    And click login button
    Then to book the rooms

  @tag2
  Scenario: Select valid terms for booking room
    Given to validate booking rooms page
    When entering the location details
    And entering the Hotels enter the room type enter the num of rooms checkin date checkout date
    And Adult per room and Childs per room
    Then click on the search button and book room
