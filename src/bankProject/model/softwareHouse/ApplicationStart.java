package bankProject.model.softwareHouse;

import java.time.LocalDate;

public class ApplicationStart {
    public static void main(String[] args) {
        Developer d1 = new Developer("Mario", "Rossi", LocalDate.of(1980,6,20),
                'm', "Java");
        Developer d2 = new Developer ("Laura","Bianchi", LocalDate.of(1983,4,15), 'f', "JavaScript");
        Developer d3 = new Developer("Mariano", "Rossi", LocalDate.of(1980,6,20),
                'm', "Java");
        ScrumMaster sm1 = new ScrumMaster("Luca", "verdi", LocalDate.of(1965,7,1),
                'm', 50,2,2);
        boolean added = sm1.addTeamMember(d1);
        if (added){
            System.out.println("Ho aggiunto il developer");
        } else {
            System.out.println("il team era già al completo");
        }
        added = sm1.addTeamMember(d2);
        if (added){
            System.out.println("Ho aggiunto il developer");
        } else {
            System.out.println("il team era già al completo");
        }
        added = sm1.addTeamMember(d3);
        if (added){
            System.out.println("Ho aggiunto il developer");
        } else {
            System.out.println("il team era già al completo");
        }
    }
}
