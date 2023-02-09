package bankProject.model.special;
import bankProject.model.Account;
import bankProject.model.Client;
import java.time.LocalDate;
import java.util.Random;

public class SpecialAccount extends Account{
    private Random random = new Random();
    public SpecialAccount(double balance, LocalDate openDate, Client client) {
        super(balance, openDate, client);
    }
    public void doSomething(){
        balance = 1000; //non posso farlo perchè non vede la variabile se è privata ma se balance è protected la legge

    }
    @Override
    public double deposit (double amount){
        balance += amount;
        balance += random.nextInt(11);
        return balance;
    }

}
