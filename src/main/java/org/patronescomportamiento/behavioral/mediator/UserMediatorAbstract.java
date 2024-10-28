package org.patronescomportamiento.behavioral.mediator;

public abstract class UserMediatorAbstract {
    protected Mediator mediator;

    protected UserMediatorAbstract(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void gerMessage(String message);
}
