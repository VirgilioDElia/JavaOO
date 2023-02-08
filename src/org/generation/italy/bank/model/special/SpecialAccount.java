package org.generation.italy.bank.model.special;
import org.generation.italy.bank.model.Account;
import org.generation.italy.bank.model.Client;
import java.time.LocalDate;

public class SpecialAccount extends Account{
    public SpecialAccount(double balance, LocalDate openDate, Client client) {
        super(balance, openDate, client);
    }
    public void doSomething(){
        balance = 1000; //non posso farlo perchè non vede la variabile se è privata ma se balance è protected la legge

    }
}
