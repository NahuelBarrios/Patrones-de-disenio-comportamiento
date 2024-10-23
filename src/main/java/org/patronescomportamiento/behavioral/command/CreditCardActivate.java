package org.patronescomportamiento.behavioral.command;

public class CreditCardActivate implements ICommand {
    CreditCardCommand creditCardCommand;

    public CreditCardActivate(CreditCardCommand creditCardCommand) {
        this.creditCardCommand = creditCardCommand;
    }

    @Override
    public void execute() {
        creditCardCommand.sendPinNumberToCustomer();
        creditCardCommand.activate();
        creditCardCommand.sendSMSToCustomerActivate();
    }
}
