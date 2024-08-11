package com.sandrewtx08.bpm.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeliveryOrder {
    private String id;

    private String senderUserId;

    private String receiverUserId;
}
