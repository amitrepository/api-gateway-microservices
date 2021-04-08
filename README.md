# api-gateway-microservices

Two Microservice
1. Order-service 
2. Payment-service


#Register this two service inside Eureka Service , then this Microservices can talk to each other(Using Eureka service registry).

![image](https://user-images.githubusercontent.com/51286655/114025002-48441280-9892-11eb-9cfb-4d0593394f48.png)

#Api-Gateway: It will help us to autodirect our request to order(/order) or payment(/payment). Both microservices has their own database.

# Hystrix Dashboard provides benefits to monitoring the set of metrics on a dashboard.
# It displays the health of each circuit-breaker in a very simple way.
# In this tutorial we will learn how to use it in a Spring Boot project.

# The @EnableHystrix is used to implement the circuit breaker pattern specifically with Hystrix on the classpath.

# Copy the hystrix stream in it (http://localhost:8989/actuator/hystrix.stream) then click on "Monitor Stream" to get a meaningful dynamic visual representation of the circuit being monitored by the Hystrix component.

Useful url: 

# Order service  Url : localhost:8989/order/bookOrder
# Payment service  url : localhost:8989/payment/5
# Service registry eureka : http://localhost:8761/
# H2 console url : http://localhost:9192/h2-console/login.jsp?jsessionid=6506969689f31f16525ea6e39a66c870
# url : localhost:9192/order/bookOrder

# reference site url : http://www.masterspringboot.com/cloud/netflix/configuring-hystrix-dashboard-in-your-spring-boot-application
