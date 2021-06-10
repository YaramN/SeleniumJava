package com.runnerclass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"com.stepdefinitions"}
		,tags= {"@test"}
		
		)

public class SearchRunner
{
	
	

}
