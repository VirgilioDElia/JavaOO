package bankProject.model.softwareHouse;

import java.time.LocalDate;

public class Developer extends Person{
    private String favouriteLanguage;

    public Developer(String firstName, String lastName, LocalDate dob, char sex,String favoriteLanguage){
        super(firstName, lastName, dob, sex);
        this.favouriteLanguage = favoriteLanguage;
    }

    @Override
    public void work() {
        System.out.println("Penso penso penso...");
        System.out.println("Non ho capito niente...");
        System.out.println("Meglio che prenda un caffè!");
        System.out.println("AH! Adesso ho capito.");
    }
    public String getFavouriteLanguage(){
        return favouriteLanguage;
    }

}
