package com.example.demo.orc;

import java.util.Queue;
import java.util.Stack;

public class TransactionalOrhectirator {

    private Queue<TransactionalServiceGateway> queue;
    private Stack<TransactionalServiceGateway> stack;

    public TransactionalOrhectirator(Queue<TransactionalServiceGateway> queue) {
        this.queue = queue;
        this.stack = new Stack<>();
    }

    public void runTransaction() {
        for(TransactionalServiceGateway gateway : queue) {
            TransactionalServiceGateway decorator = new PaymentTransactionalGatewayDecorator(null, gateway);
            boolean request = decorator.request();
            if (!request) {
                for(TransactionalServiceGateway service : stack) {
                    decorator.compansate();
                }
                break;
            }
            stack.add(gateway);
        }
    }

}
