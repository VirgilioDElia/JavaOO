package bankProject.model;
import java.time.LocalDate;
public class CaymanAccount extends Account { //figlia di account
    private String secretCode;
    public CaymanAccount(){
        super();  //invoca il costruttore di default della mamma
    }
    public CaymanAccount(double balance, LocalDate openDate,Client client,String secretCode){
        super(balance, openDate, client); //va fatto come prima cosa per settare la parte madre
        this.secretCode = secretCode;  //va settata la parte figlia, uil this serve per non creare ambiguità tra le due variabili secret code con lo stesso nome
    }
    public double evadeTax() {
        balance += 1000; //non trova balance percè è privata se invece fosse protected riuscirebbe a vederla
        deposit(1000);
        return 0;
    }
}




