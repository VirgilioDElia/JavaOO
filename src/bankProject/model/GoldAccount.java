package bankProject.model;


import java.time.DayOfWeek;
import java.time.LocalDate;

public class GoldAccount extends Account {
    private double bonus;

    public GoldAccount(double balance, LocalDate openDate, Client client, double bonus){
        super (balance, openDate, client);
        this.bonus = bonus;
    }
    // vohlio assegnare bonus se è domenica
    //@Override
    public double deposit(double amount){
        //balance += amount; //fa la stessa cosa della madre ma per non ripeter ecodice
        //super.deposit(amount);  //super è un puntatore alla madre cche richiama il metodo che ci interessa
        balance += amount;
        if(LocalDate.now().getDayOfWeek() == DayOfWeek.SUNDAY) {
            balance += bonus;
        }
        return balance;
    }
}
