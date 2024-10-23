package org.patronescomportamiento.behavioral.command;

public class CreditCardInvokerCommand {

    private ICommand command;

    public CreditCardInvokerCommand(){}

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void run(){ //Le agregamos el metodo run
        command.execute();
    }

}
