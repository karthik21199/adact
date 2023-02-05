package com.Adactin;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\com\\Feature\\Adactin.feature",glue="com.StepDefenition",plugin={"html:Reports" , "json:Reports/cucumber.json"})

public class FeatureFile_RunnerClass {
	
}
