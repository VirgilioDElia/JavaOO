package org.generation.italy.bank.model.special;
import org.generation.italy.bank.model.Account;

import java.time.LocalDate;

public class SpecialAccount extends Account{
    public SpecialAccount(double b, LocalDate ld, String cname) {
        balance = b; //mi viebne passato un valore di b ed io lo assegno a balance
        LocalDate openDate = ld;
        String client = cname;
    }
    public void doSomething(){
        balance = 1000; //non posso farlo perchè non vede la variabile se è privata ma se balance è protected la legge

    }
}
