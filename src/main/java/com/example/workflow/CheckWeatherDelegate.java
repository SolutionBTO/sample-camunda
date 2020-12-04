package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;
import java.util.UUID;

public class CheckWeatherDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable("name","Roberto César");
        delegateExecution.setVariable("isFineWeather",new Random().nextBoolean());
        delegateExecution.setVariable("correlationId", UUID.randomUUID().toString());
    }
}
