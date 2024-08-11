package com.sandrewtx08.bpm.delegate;

import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static org.camunda.spin.Spin.JSON;

@Component("initialTask")
public class InitialTaskDelegate implements JavaDelegate {
    @Autowired
    private IdentityService identityService;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String userId = (String) execution.getVariable("senderUser");

        execution.setVariable("senderUserProfile", JSON(identityService
                .createUserQuery()
                .userId(userId)
                .singleResult()));
    }
}
