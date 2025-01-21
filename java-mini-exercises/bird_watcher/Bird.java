package bird_watcher;

public class Bird {
    //create instance variable name, latinName and observations
    String name;
    String latinName;
    int observations;

    public Bird(String namee, String latinNamee){
        name = namee;
        latinName = latinNamee;
        observations = 0;
    }



    public void addObservation(){
        observations = observations + 1;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if(observations == 1){
            return name + " (" + latinName + " ):" + observations + " observation";
        }
        return name + " (" + latinName + " ):" + observations + " observations";
    }

}
