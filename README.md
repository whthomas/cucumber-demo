
### 需求分解

##### 目标

为方便收集大家的反馈和活动构建一个`投票系统`

##### 投票功能设计

【使用场景】

1. 每一人`每轮`只能投出指定的有限的`票数`
2. 可以根据配置展示`每轮`的`投票结果`
    - 总是展示`投票结果`
    - `每轮`投票完成之后才展示`投票结果`

【管理场景】

1. 支持`每轮`投票复位功能，复位之后，所有选项`票数`全部置为0
2. 支持`每轮`投票锁定功能，`每轮`投票锁定之后，任何人不可以再在`本轮`进行投票，也不可以更改投票
3. `每轮`投票应该有指定截止时间，到达截止时间之后，投票被锁定
4. `每轮`投票可以设置被修改，也可以被设置无法修改。
5. 支持`投票结果`数据的导出功能，导出csv或者json格式的文件，要求导出的内容：
    - `票选项`
    - `票数`
    - 选项占总`票数`的占比
6. 支持匿名投票

【编辑场景】

1. 支持简单地文本编辑格式