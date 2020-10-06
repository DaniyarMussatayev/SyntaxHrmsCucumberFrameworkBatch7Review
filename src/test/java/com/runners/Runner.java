package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", //need to give a path for our feature files 
                 glue = "com/stepDefinitions", //we need to glue our step definition - implementation
                 dryRun = true, //when set as true, will run over the feature steps and identify the missing implementation
                 monochrome = true //when set as true, will format the console outcome
//                tags = "@smoke"
                
) 

public class Runner {

}
