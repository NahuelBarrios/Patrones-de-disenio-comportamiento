package org.patronescomportamiento.behavioral.mediator;

public interface Mediator {

    void send(String message, UserMediatorAbstract user);
}
