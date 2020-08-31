package io.github.whthomas.demo.cucumber.vote;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UseVoteScenario {

    @Given("^发起一轮投票，设置`选项`")
    public void 发起一轮投票_设置选项(DataTable dataTable) throws Throwable {

    }

    @Given("{}个`参与人`，每人投票{}次")
    public void 人参与_每人投票1次给选项a(Integer recipientNumber, Integer voteTimes) {

    }

    @When("所有`参与人`完成投票")
    public void 大家完成投票() {

    }

    @Then("`投票结果`中总票数应该为{}票")
    public void 投票结果_与投票情况一致(Integer totalVotes) {

    }

}
