package bankProject.model.softwareHouse;

public class Office {
    private Person [] workers;

    public Office(Person[] employees){
        this.workers = employees;

    }
    public void startDayOfWork(){
        for(int i = 0; i < workers.length;i++){
            if(workers[i] != null){
                workers[i].work();
            }
        }
        for (Person p : workers){ //per ogni persona p nella sequnza workers p rappresenta workers[i]
            p.speak();
        }
    }
}
