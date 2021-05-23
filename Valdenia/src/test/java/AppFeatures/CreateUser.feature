Feature: Validate that it is possible to add a new user with a job

  Scenario Outline: I want to insert a new user
    Given I access the "<API>"
    When Post a request with "<user>" and "<job>"
   Then I validate my response is correct

    Examples:
      | user    | job     | API                        |
      | toy     | singer  | https://reqres.in/api/users|