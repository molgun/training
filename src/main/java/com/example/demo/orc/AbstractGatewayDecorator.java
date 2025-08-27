package com.example.demo.orc;

public abstract class AbstractGatewayDecorator implements TransactionalServiceGateway {

    private final TransactionalServiceGateway transactionalServiceGateway;
    private final InMemoryRequestRepository repository;
    public Object getTransactionalServiceGateway;
    
    public AbstractGatewayDecorator(InMemoryRequestRepository repository, TransactionalServiceGateway transactionalServiceGateway) {
        this.transactionalServiceGateway = transactionalServiceGateway;
        this.repository = repository;
    }

    @Override
    public boolean compansate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compansate'");
    }

    public TransactionalServiceGateway getTransactionalServiceGateway() {
        return transactionalServiceGateway;
    }

    public InMemoryRequestRepository getRepository() {
        return repository;
    }
}
