package com.speetail.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	Logger logger = LogManager.getLogger(StepDefinitions.class);
	
	
	@Before
	public void beforeScenario(Scenario scenario) throws Exception {
		
		logger.info("Started the Scenario");
	}
	
	@After
	public void embedScreenshot() {
		try {
			logger.info("After method executed");
		} catch(Exception e) {
			logger.error(e);
		}
	}
	
	@Given("^user configured the alexa device$")
	public void user_configured_the_alexa_device() throws Throwable {
	    logger.info("User sucessfuly connected to Alexa device");
	}

	@When("^connected to Jenkins and GitHub$")
	public void connected_to_Jenkins_and_GitHub() throws Throwable {
		logger.info("User Connected to Jenkins and GitHub");
	}

	@Then("^ask Alexa to execute any command$")
	public void ask_Alexa_to_execute_any_command() throws Throwable {
		logger.info("Alexa executed the command");
	}
	
}
