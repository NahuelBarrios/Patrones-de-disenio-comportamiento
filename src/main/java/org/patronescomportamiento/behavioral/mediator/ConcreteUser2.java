package org.patronescomportamiento.behavioral.mediator;

public class ConcreteUser2 extends UserMediatorAbstract{

    public ConcreteUser2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void gerMessage(String message) {
        System.out.println("mensaje recibido a User2: " + message);
    }
}
