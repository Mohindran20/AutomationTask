package com.cg.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/Sliders.feature", glue = "com.cg.slidersstepdef", monochrome=true,dryRun = false, 
plugin = {"pretty", "json:target/cucmber.json", "html:target/index.html" })

public class SlidersRunner {

}
