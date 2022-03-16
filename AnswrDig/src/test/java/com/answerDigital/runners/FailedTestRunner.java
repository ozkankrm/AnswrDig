package com.answerDigital.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/default-html-reports"},
            features = "@target/rerun.txt",
            glue = "com/answerDigital/step_definitions"

    )
    public class FailedTestRunner {
    }


