package com.sandrewtx08.bpm.delegate;

import static org.camunda.spin.Spin.JSON;

import java.util.UUID;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.spin.json.SpinJsonNode;
import org.springframework.stereotype.Component;

import com.sandrewtx08.bpm.model.DeliveryOrder;

@Component("registerDeliveryOrder")
public class RegisterDeliveryOrder implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String senderUserId = ((SpinJsonNode) execution.getVariable("senderUserProfile")).prop("id").stringValue();
        String receiverUserId = ((SpinJsonNode) execution.getVariable("receiverUserProfile")).prop("id").stringValue();

        execution.setVariable("deliveryOrder",
                JSON(new DeliveryOrder(UUID.randomUUID().toString(), senderUserId, receiverUserId)));
    }
}
