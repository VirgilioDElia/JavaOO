package bankProject.model;

import java.time.LocalDate;
public class Account {
    protected double balance; //saldo
    private LocalDate openDate; //se io lo metto = null il compilatore mi dice che è rindondante perchè è gia null
    //private String client;   //stringa del clinrte
    private Client client;
    public Account() {   //costruttore di default , che non ha parametri
     //this(1000,LocalDate.now());
        /*
        balance = 1000;   //creo cosrtuttore di default di
        openDate = LocalDate.now();
        client = "Anonymous";
        */
    }

    //costruttori in OVERLOAD
    public Account(double b,LocalDate ld,Client client) {
        balance = b; //mi viebne passato un valore di b ed io lo assegno a balance
        openDate = ld;
        this.client = client;
    }

   /*public Account(double c,LocalDate locD){
        this(c,locD,"Anonymous"); //richiama il costruttore in line 15 che setta tutte le variabili
        //balance = c;
        //openDate = locD;
        //client = "Anonymous";
    }
    */
    //INCAPSULATION, INCAPSULAMENTO che comprende metodo getter e setter
    public double getBalance(){  //metodo getter che richiama la funzione privata
        //return balance;
        return balance/100;       //con questo metodo posso modificalo con semplicità
    }
    public void setBalance(double amount){  //metodo setter che modifica la funzione privata
        //this.balance = amount;
        if(amount >= 0) {                    //evito i valori negativi
            this.balance = amount * 100;
        }
    }
    public LocalDate getOpenDate(){
        return openDate;
    }
    public Client getClient(){
        return client;
    }
    public void setClient(Client client){
        this.client = client;
    }

    public double deposit(double amount){  //amount è il deposito
        //amount *=100;
        balance += amount;  //sommiamo a balance l'amount
        return balance/100;   //sto cambiando l'unità di misura da euro a centesimi di euro

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
