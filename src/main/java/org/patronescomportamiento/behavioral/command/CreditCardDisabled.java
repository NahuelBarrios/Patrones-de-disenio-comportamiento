package org.patronescomportamiento.behavioral.command;

public class CreditCardDisabled implements ICommand{
    CreditCardCommand creditCardCommand;

    public CreditCardDisabled(CreditCardCommand creditCardCommand){
        this.creditCardCommand = creditCardCommand;
    }

    @Override
    public void execute() {
        creditCardCommand.sendSMSToCustomerDisabled();
        creditCardCommand.disabled();
    }
}
