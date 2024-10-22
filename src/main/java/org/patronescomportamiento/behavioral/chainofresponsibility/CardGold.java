package org.patronescomportamiento.behavioral.chainofresponsibility;

public class CardGold implements ApproveLoanChain{

    private ApproveLoanChain next;
    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        if(totalLoan <= 10000){
            System.out.println("El monto pertenece a la tarjeta Gold.");
        } else {
            next.creditCardRequest(totalLoan); // next Tiene el valor de Platinum
        }
    }
}