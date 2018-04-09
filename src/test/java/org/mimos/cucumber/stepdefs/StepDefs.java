package org.mimos.cucumber.stepdefs;

import org.mimos.InmemorymicroservicesApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = InmemorymicroservicesApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
