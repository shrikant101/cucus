package com.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"com.stepdefinitions"},monochrome=true,
plugin= {"html:Report/htmlreport","json:Report/cucumber.json","junit:Report/cucumber.xml"}
//dryRun= true
)
public class Runner {

}
