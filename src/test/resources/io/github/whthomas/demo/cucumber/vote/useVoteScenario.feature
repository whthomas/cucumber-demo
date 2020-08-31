Feature: 【投票-使用场景】投票功能

  每一人`每轮`只能投出指定的有限的`票数`

  Scenario Outline: 每位`参与人``每轮`只能投出指定的有限的`票数`
    Given 发起一轮投票，设置`选项`
      | A | B | C |
    Given <recipientNumber>个`参与人`，每人投票<voteTimes>次
    When 所有`参与人`完成投票
    Then `投票结果`中总票数应该为<totalVotes>票

    Examples: 正常情况的用例
      | recipientNumber | voteTimes | totalVotes |
      | 2               | 1         | 2          |
      | 3               | 2         | 6          |

    Examples: 异常情况下的用例
      | recipientNumber | voteTimes | totalVotes |
      | 4               | 2         | 4          |