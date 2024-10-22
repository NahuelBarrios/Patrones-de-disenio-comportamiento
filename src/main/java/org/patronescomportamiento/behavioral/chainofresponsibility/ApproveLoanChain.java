package org.patronescomportamiento.behavioral.chainofresponsibility;

public interface ApproveLoanChain {
    void setNext(ApproveLoanChain loan);
    ApproveLoanChain getNext();
    void creditCardRequest(int totalLoan);
}
