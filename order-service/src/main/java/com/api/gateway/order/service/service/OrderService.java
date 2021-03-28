package com.api.gateway.order.service.service;

import com.api.gateway.order.service.common.Payment;
import com.api.gateway.order.service.common.TransactionRequest;
import com.api.gateway.order.service.common.TransactionResponse;
import com.api.gateway.order.service.entity.Order;
import com.api.gateway.order.service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private RestTemplate restTemplate;

    public TransactionResponse saveOrder(TransactionRequest request) {
        String response = "";

        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());

        //rest call
        //Payment paymentResponse = restTemplate.postForObject("http://localhost:9191/payment/doPayment", payment, Payment.class);

        Payment paymentResponse = restTemplate.postForObject("http://payment-service/payment/doPayment", payment, Payment.class);

        response = paymentResponse.getPaymentStatus().equals("success") ? "Payment processed" : "Payment not Processed";
        orderRepository.save(order);

        return new TransactionResponse(order, paymentResponse.getTransactionId(), paymentResponse.getAmount(), response);

    }
}
