package bankProject.model;

import java.time.LocalDate;

public class SmartAccount extends Account{
    private int counter; //contatore che di default è zero
    public SmartAccount(double balance, LocalDate openDate,Client client){
        super(balance, openDate, client);
    }
    @Override
    public double deposit(double amount) {
        balance+= amount;
        counter++;
        if( counter == 10){
            balance ++;
            counter = 0;
        }
        return balance;
    }

}
