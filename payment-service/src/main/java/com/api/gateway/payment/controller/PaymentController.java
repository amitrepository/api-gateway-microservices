package com.api.gateway.payment.controller;

import com.api.gateway.payment.entity.Payment;
import com.api.gateway.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentById(@PathVariable int orderId){
       return service.findPaymentById(orderId);
    }
}
