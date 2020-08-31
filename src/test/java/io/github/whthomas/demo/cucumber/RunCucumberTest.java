package io.github.whthomas.demo.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "json:target/cucumber/hello.json",
        "pretty",
        "de.monochromata.cucumber.report.PrettyReports:target/cucumber"
})
public class RunCucumberTest {
}