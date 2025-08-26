package com.example.demo;

public class AServiceController {

    public void control() {
        BServiceGateway gateway = new BServiceGateway();
        Answer answer = gateway.getFromServiceB();
        AService aService = new AService();
        aService.processAnswer(answer);
    }
}
