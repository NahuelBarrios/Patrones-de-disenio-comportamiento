package org.patronescomportamiento.behavioral.chainofresponsibility;

public class CardChainOfResponsibility implements IApproveLoanChain {
    private IApproveLoanChain next;
    @Override
    public void setNext(IApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public IApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        CardGold cardGold = new CardGold();
        this.setNext(cardGold); // Le asigno al metodo de la clase con que metodo arranca, osea el gold.

        CardPlatinum cardPlatinum = new CardPlatinum();
        cardGold.setNext(cardPlatinum); // A cardGold le agrego el platino, es el proximo.

        CardBlack cardBlack = new CardBlack();
        cardPlatinum.setNext(cardBlack); // a card Platinum le agrego black.
                                         // Tenemos que agregar de acuerdo a la prioridad.
        next.creditCardRequest(totalLoan); // this tiene el valor de CardGold, entonces arrancaria ahi.
    }
}
