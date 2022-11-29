package com.github.simileyskiy;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com.github.simileyskiy")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.github.simileyskiy.hooks,com.github.simileyskiy.stepdefs")

public class CucumberTestRunner {

}

