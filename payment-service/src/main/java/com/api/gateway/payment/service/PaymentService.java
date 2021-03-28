package com.api.gateway.payment.service;

import com.api.gateway.payment.entity.Payment;
import com.api.gateway.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return repository.save(payment);
    }

    public  String paymentProcessing(){
        //Api should be third party payment gateway
        return new Random().nextBoolean()?"success":"false";
    }

    public Payment findPaymentById(int orderId) {
        return repository.findByOrderId(orderId);
    }
}
