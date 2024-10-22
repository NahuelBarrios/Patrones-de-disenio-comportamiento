package org.patronescomportamiento;

import org.patronescomportamiento.behavioral.chainofresponsibility.CardChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        probarChainOfResponsibility();
    }

    private static void probarChainOfResponsibility(){
        CardChainOfResponsibility cardChainOfResponsibility = new CardChainOfResponsibility();
        cardChainOfResponsibility.creditCardRequest(100000);
    }
}