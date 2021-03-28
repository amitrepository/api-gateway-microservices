package com.api.cloud.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/orderFallback")
    public Mono<String> OrderServiceFallback(){
        return Mono.just("Order service is taking too long to respond or is down. Please try after some time");
    }

    @RequestMapping("/paymentFallback")
    public Mono<String> paymentServiceFallback(){
        return Mono.just("payment service is taking too long to respond or is down. Please try after some time");
    }
}
