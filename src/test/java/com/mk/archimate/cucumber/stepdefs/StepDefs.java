package com.mk.archimate.cucumber.stepdefs;

import com.mk.archimate.JhipsterSampleApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterSampleApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
