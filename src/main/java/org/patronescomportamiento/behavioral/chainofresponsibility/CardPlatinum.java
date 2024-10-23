package org.patronescomportamiento.behavioral.chainofresponsibility;

public class CardPlatinum implements IApproveLoanChain {
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
        if(totalLoan > 10000 && totalLoan <= 50000){
            System.out.println("El monto pertenece a la tarjeta Platinum.");
        } else {
            next.creditCardRequest(totalLoan); // next tiene el valor de Black
        }
    }
}
