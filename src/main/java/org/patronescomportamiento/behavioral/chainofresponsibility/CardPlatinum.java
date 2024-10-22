package org.patronescomportamiento.behavioral.chainofresponsibility;

public class CardPlatinum implements ApproveLoanChain{
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
        if(totalLoan > 10000 && totalLoan <= 50000){
            System.out.println("El monto pertenece a la tarjeta Platinum.");
        } else {
            next.creditCardRequest(totalLoan); // next tiene el valor de Black
        }
    }
}
