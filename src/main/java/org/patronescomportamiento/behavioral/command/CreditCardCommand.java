package org.patronescomportamiento.behavioral.command;

public class CreditCardCommand {

    public void sendPinNumberToCustomer(){
        System.out.println("El numero de pin ha sido enviado al cliente.");
    }

    public void sendSMSToCustomerActivate(){
        System.out.println("El SMS de activacion ha sido enviado al cliente.");
    }

    public void activate(){
        System.out.println("Se ha activado la tarjeta del cliente.");
    }

    public void disabled(){
        System.out.println("Se ha desactivado la Tarjeta del cliente.");
    }

    public void sendSMSToCustomerDisabled(){
        System.out.println("El SMS de desactivacion ha sido enviado al cliente.");
    }
}
