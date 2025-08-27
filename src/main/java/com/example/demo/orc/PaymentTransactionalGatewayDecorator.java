package com.example.demo.orc;

public class PaymentTransactionalGatewayDecorator extends AbstractGatewayDecorator {

    public PaymentTransactionalGatewayDecorator(InMemoryRequestRepository repository,
            TransactionalServiceGateway transactionalServiceGateway) {
        super(repository, transactionalServiceGateway);
    }

    @Override
    public boolean request() {
        super.getRepository().save(new Object());
        boolean result = super.getTransactionalServiceGateway().request();
        super.getRepository().save(new Object());
        return result;
    }

}
