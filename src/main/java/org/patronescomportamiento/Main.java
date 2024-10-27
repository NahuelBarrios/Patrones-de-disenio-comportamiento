package org.patronescomportamiento;

import org.patronescomportamiento.behavioral.chainofresponsibility.CardChainOfResponsibility;
import org.patronescomportamiento.behavioral.command.CreditCardActivate;
import org.patronescomportamiento.behavioral.command.CreditCardCommand;
import org.patronescomportamiento.behavioral.command.CreditCardDisabled;
import org.patronescomportamiento.behavioral.command.CreditCardInvokerCommand;
import org.patronescomportamiento.behavioral.iterator.CardIterator;
import org.patronescomportamiento.behavioral.iterator.CardList;
import org.patronescomportamiento.behavioral.iterator.CardListImpl;
import org.patronescomportamiento.behavioral.iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        probarChainOfResponsibility();
        probarCommand();
        probarIterator();
    }

    private static void probarChainOfResponsibility(){
        CardChainOfResponsibility cardChainOfResponsibility = new CardChainOfResponsibility();
        cardChainOfResponsibility.creditCardRequest(100000);
    }

    private static void probarCommand(){
        CreditCardCommand creditCard = new CreditCardCommand(); //Instancio la clase que contiene los metodos principales.

        CreditCardInvokerCommand creditCardInvoker = new CreditCardInvokerCommand(); // instancio un Invoker que tiene el metodo run()
        creditCardInvoker.setCommand(new CreditCardActivate(creditCard)); // Le asigno al constructor la clase de activacion para que ejecute la activacion de la tarjeta
        creditCardInvoker.run(); // Corro el execute de CredtCardActivate.
        System.out.println("----");
        creditCardInvoker.setCommand(new CreditCardDisabled(creditCard)); // Le asigno al constructor la clase de desactivacion para que ejecute la desactivacion de la misma
        creditCardInvoker.run(); // Corro el execute CreditCardDisabled.
    }

    private static void probarIterator(){ // Se utiliza seguido, ya lo tenemos en la clase List de java.
        CardIterator[] cardIterator = new CardIterator[5];
        cardIterator[0] = new CardIterator("VISA");
        cardIterator[1] = new CardIterator("MASTERCARD");
        cardIterator[2] = new CardIterator("MAESTRO");
        cardIterator[3] = new CardIterator("AMERICAN EXPRESS");
        cardIterator[4] = new CardIterator("APPLE CARD");

        CardList cardList = new CardListImpl(cardIterator);
        Iterator iterator = cardList.iterator();

        while (iterator.hasNext()){
            CardIterator card = (CardIterator) iterator.next();
            System.out.println(card.getType());
        }

    }
}