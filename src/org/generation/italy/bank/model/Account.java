package bank.model;
import java.time.LocalDate;
public class Account {
    public double balance; //saldo
    public LocalDate openDate;
    public String client;   //stringa del clinrte
    public double deposit(double amount){  //amount è il deposito
        balance += amount;  //sommiamo a balance l'amount
        return balance;

    }

    //metodo overloading per avere classi con lo stesso nome ma parametri diversi
    public double deposit(double amount, double extra){  //amount è il deposito
        balance += amount; //sommiamo a balance l'amount
        balance += extra/2;
        return balance;

    }

    public double withDraw(double amount){
        balance -= amount; //sottraggo
        return balance;
    }

}
