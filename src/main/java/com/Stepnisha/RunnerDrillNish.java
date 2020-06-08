package com.Stepnisha;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\hp\\maven\\NishaDrill1\\NishaPrimary\\NishDrill.feature",
glue={"com.Stepnisha"},
tags = {"@tag2"}, 
dryRun=false, 
monochrome=true
)
public class RunnerDrillNish {

}
