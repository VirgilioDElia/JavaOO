package bankProject.model.softwareHouse;

import java.time.LocalDate;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDate dob; //dateofbirthday
    protected char sex;

    public Person(String firstName, String lastName, LocalDate dob, char sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.sex = sex;

    }
    public void speak(){
        System.out.println("Ciao sono " + firstName);
        //if(sex == 'm'){
        if(isMale()){
            System.out.println("Parliamo di calcio!");
        } else {
            System.out.println("Parliamo di make-up!");
        }

    }
    public boolean isMale(){
        /*if(sex == 'm'|| sex == 'M'){
            return true;
        } else {
            return false;
        }*/
        return sex == 'm'|| sex == 'M';
    }
    public abstract void work();
    public void sleep(){
        System.out.println("Zzz!");
    }




}
