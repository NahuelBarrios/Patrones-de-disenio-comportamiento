package org.patronescomportamiento.behavioral.mediator;

public class ConcreteMediator implements Mediator{
    private ConcreteUser1 concreteUser1;
    private ConcreteUser2 concreteUser2;

    public void setConcreteUser1(ConcreteUser1 concreteUser1){
        this.concreteUser1 = concreteUser1;
    }

    public void setConcreteUser2(ConcreteUser2 concreteUser2){
        this.concreteUser2 = concreteUser2;
    }

    @Override
    public void send(String message, UserMediatorAbstract user) {
        if(user == concreteUser1){
            concreteUser2.gerMessage(message);
        } else if (user == concreteUser2) {
            concreteUser1.gerMessage(message);
        }
    }
}
