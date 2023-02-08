package org.generation.italy.bank.infrastructure;

import org.generation.italy.bank.model.Account;
import org.generation.italy.bank.model.CaymanAccount;
import org.generation.italy.bank.model.special.SpecialAccount;
import java.time.LocalDate;
import java.util.Date;

public class ApplicationStart {
    public static void main(String[] args) {

        Account a1 = new Account();
        Account x = new Account();

        //sta invocando il costruttore della classe account che ritorna l'indirizzo assegnato ad x

       /* System.out.println(x.balance);
        a1.balance = 100_000;
        a1.balance = -1_000_000; */
        //stamperà zero
        //System.out.println(x.client);
        //System.out.println(x.openDate);
        //stamperà null perchè è un reference type che ha di default null
        double newBalance = x.deposit(1000.0);
        //sto chiamando il metodo deposita , x.deposita vuol dire esegui il metodso deposita sull'oggetto,
        //il metodo deposita aggiunge il deposito a balance quindi amnche se chiamo newbalance lui comunque o aggiunge al balnce
        //System.out.println(x.balance);
        //stampa 1000
        Account a2 = new Account (2500, LocalDate.of(2023,1,20),"Piero Rossi");
        SpecialAccount sa1 = new SpecialAccount (100_000.0, LocalDate.now(), "Richie Rich");
        //SpecialAccount sa2 = new String ("SpecialAccount");
        //sa2.setBalance(1000);
        // i metodi che il comp ti fa chiamare nella ...
        CaymanAccount ca = new CaymanAccount();
        //System.out.println(ca.balance);
        System.out.println(ca.getBalance());  //tramite metodo getter posso chamare la fuzione balance che eraa privata
        a1.setBalance(1000);  //tramite metodo setter posso modificare la variabile privata
        ca.deposit(10_000);
        ca.evadeTax();
        //SpecialAccount sa2 = new String("SpecialAccount");  //stiampo usando il telecomando di un televisore per far dunzionare un alavatrice
        //SpecialAccount sa2 =  new Account (2500, LocalDate.of(2023,1,20),"Piero Rossi"); //oggetti diersi e imparentati ma non sono dello stesso tipo
        Account a3 = new SpecialAccount (100_000.0, LocalDate.now(), "Richie Rich"); //special account è un account speciale ma è anche un Account
        // special account essendo figlia ha tutti i metodi della madre (una reference madre può puntare ad una qualsiasi delle figlie perchè hanno tutti i metodi);
        //la classe figlia è equivalente ad una classe madre ; ma la madre non è equivalente alla figlia quindi la figlia non può puntare la madre perchè la madre non ha tutti i metodi della figlia
        Account[] acs = new Account[10]; //questo array può puntare a tutte le figlie
    }

    public static void handleAccount(Account[] acs){ //questo metodo lavora con tutte le figlie considerandole account senza considerare i tipi e funzionerà con tutti gli account che creeremo favoredno l'estensibilità
        for(int i =0;i<acs.length;i++) {
            if(acs[i].getBalance() > 1000.0){
                acs[i].withDraw(10);
            }
        }
    }
    public static void handleAccount(Account x){  //utilizzando il METODO POLIMORFICO , non ha bisgono di sapere con quale account lavora
        String clientName = x.getClient();
        if(clientName!=null && clientName.length() > 10 && clientName.startsWith("sa")) {
            x.deposit(10);
        }
    }
}
