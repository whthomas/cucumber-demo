package io.github.whthomas.demo.cucumber.vote;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Objects;

public class DisplayVoteResultScenario {

    @Given("设置`投票结果`，`参与人` {settingVoteResultDisplayConfig} `投票结果`")
    public void setting_vote_result_display_config(Boolean settingVoteResultDisplayConfig) {

    }

    @When("`参与人`投票前查询`投票结果`")
    public void 参与人_投票前查询_投票结果() {

    }

    @When("`参与人`投票后查看`投票结果`")
    public void 参与人_投票后查看_投票结果() {

    }

    @Then("`参与人` {viewResult} 查看到`投票结果`")
    public void 参与人_可以_查看到_投票结果(Boolean viewResult) {

    }

    @ParameterType("可以|无法")
    public Boolean viewResult(String viewResult) {

        return Objects.equals("可以", viewResult);
    }

    @ParameterType("总是可以查询|投票后才展示")
    public Boolean settingVoteResultDisplayConfig(String settingVoteResultDisplayConfig) {

        return Objects.equals("总是可以查询", settingVoteResultDisplayConfig);
    }

}
