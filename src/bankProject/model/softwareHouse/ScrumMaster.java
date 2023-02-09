package bankProject.model.softwareHouse;

import java.time.LocalDate;

public class ScrumMaster extends Person{
    private int yearsofExperience;
    private double levelOfPatience;
    //array di oggetti
    private Developer[] team;

    public ScrumMaster(String firstName, String lastName, LocalDate dob, char sex, int yearsofExperience, double levelofPatience, int teamSize) {
        super(firstName, lastName,dob,sex);
        this.yearsofExperience = yearsofExperience;
        this.levelOfPatience = levelofPatience;
        this.team = new Developer[teamSize];
    }

    @Override
    public void work(){
        System.out.println("Faccio lavorare gli altri.");
        if(levelOfPatience <= 0){
            System.out.println("Vi prendo tutti a bastonate");
        }
    }
    public void answerQustion(String question){
       // if(question.length()%2 == 0)
        if ((question.length() & 1) == 0){  //compara i bit nella posizione 1 che nel numero dispari è 1 
            System.out.println("Bravo bella domanda!");
            levelOfPatience++;
        } else {
            System.out.println("Ma come ti viene in mente una cosa del genere!?");
            levelOfPatience -= 2;
        }
    }
    public boolean addTeamMember(Developer d){
        for(int i = 0; i < team.length; i++){
            if(team[i] == null){
                team[i] = d;
                return true; //
            }
        }
        return false; //in questo metodo se ritorna false non cera spazio, se c'era invce ritorna true
    }
}
