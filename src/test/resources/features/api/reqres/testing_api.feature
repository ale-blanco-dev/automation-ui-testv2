# encoding: utf-8

Feature: Reqres API Testing
  Testing different REST endpoints of Reqres API to validate expected behavior

  @all @get
  Scenario Outline: GET request to <path> should return status <status>
    When I send a "GET" request to "<path>"
    Then the response status code should be <status>

    Examples:
      | path                  | status |
      | api/users?page=2      | 200    |
      | api/users/2           | 200    |
      | api/users/23          | 404    |
      | api/unknown           | 200    |
      | api/unknown/2         | 200    |
      | api/unknown/23        | 404    |
      | api/users?delay=3     | 200    |

  @all @post
  Scenario Outline: Create user <name> as <job>
    When I send a "POST" request to "api/users" with name "<name>" and job "<job>"
    Then the response status code should be 201

    Examples:
      | name     | job       |
      | morpheus | leader    |
      | neo      | developer |

  @all @post
  Scenario Outline: Register user with email <email>
    When I send a "POST" request to "api/register" with email "<email>" and password "<password>"
    Then the response status code should be <status>

    Examples:
      | email                | password | status |
      | eve.holt@reqres.in   | pistol   | 200    |
      | ifuarereading@please | hiredme  | 400    |

  @all @post
  Scenario Outline: Login user with email "<email>"
    When I send a "POST" request to "api/login" with email "<email>" and password "<password>"
    Then the response status code should be <status>

    Examples:
      | email              | password   | status |
      | eve.holt@reqres.in | cityslicka | 200    |
      | peter@klaven       | hired-ye   | 400    |

  @all @put
  Scenario Outline: Update user <name> to <job>
    When I send a "PUT" request to "api/users/2" with name "<name>" and job "<job>"
    Then the response status code should be 200

    Examples:
      | name     | job           |
      | morpheus | zion resident |

  @all @delete
  Scenario: Delete user
    When I send a "DELETE" request to "api/users/2"
    Then the response status code should be 204