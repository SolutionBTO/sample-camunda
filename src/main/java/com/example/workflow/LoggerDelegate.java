package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDelegate implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(JavaDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Auditing: \nProcessDefinitionId={}\nCurrentActivityId={}" +
                        "\nProcessInstanceId={}\nProcessBusinessKey={}\nExecutionId={}",
                delegateExecution.getProcessDefinitionId(),
                delegateExecution.getCurrentActivityId(),
                delegateExecution.getProcessInstanceId(),
                delegateExecution.getProcessBusinessKey(),
                delegateExecution.getId());
    }
}
