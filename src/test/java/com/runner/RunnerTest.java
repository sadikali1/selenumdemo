package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature", 
		glue = { "com.step", "classpath:io.jdev.cucumber.variables.java.en" },
		plugin = { "pretty",
				"html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json" }, 
		monochrome = true,
		dryRun = true,
		tags = "@Smoke")

public class RunnerTest { 
			
}

