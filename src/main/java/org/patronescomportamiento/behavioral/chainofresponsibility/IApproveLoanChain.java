package org.patronescomportamiento.behavioral.chainofresponsibility;

public interface IApproveLoanChain {
    void setNext(IApproveLoanChain loan);
    IApproveLoanChain getNext();
    void creditCardRequest(int totalLoan);
}
