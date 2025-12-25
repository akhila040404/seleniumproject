Feature: trying Examples

  Scenario Outline: to use test data from examples

    Given "username" is "<username>"
    When "password" is "<password>"
    Then "result" is "<result>"


    Examples:
      | username | password | result |
      | u1       | p1       | r1     |
      | u2       | p2       | r2     |
      | u3       | p1       | r1     |
      | u4       | p2       | r2     |



