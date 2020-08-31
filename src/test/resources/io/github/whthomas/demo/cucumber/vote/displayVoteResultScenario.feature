Feature: 【投票-使用场景】配置展示`投票结果`

  - 总是展示`投票结果`
  - `参与人`投票后才展示`投票结果`

  Scenario Outline: `参与人`投票前查询`投票结果`
    Given 发起一轮投票，设置`选项`
      | A | B | C |
    Given 设置`投票结果`，`参与人` <settingVoteResultDisplayConfig> `投票结果`
    When `参与人`投票前查询`投票结果`
    Then `参与人` <viewResult> 查看到`投票结果`

    Examples:
      | settingVoteResultDisplayConfig | viewResult |
      | 总是可以查询                         | 可以         |
      | 投票后才展示                         | 无法         |

  Scenario Outline: `参与人`投票后查询`投票结果`
    Given 发起一轮投票，设置`选项`
      | A | B | C |
    Given 设置`投票结果`，`参与人` <settingVoteResultDisplayConfig> `投票结果`
    When  `参与人`投票后查看`投票结果`
    Then `参与人` <viewResult> 查看到`投票结果`

    Examples:
      | settingVoteResultDisplayConfig | viewResult |
      | 总是可以查询                         | 可以         |
      | 投票后才展示                         | 可以         |