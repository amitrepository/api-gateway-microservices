package com.api.gateway.order.service.common;

import com.api.gateway.order.service.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    private Order  order;
    private Payment payment;
}
