package oopListTVprogramMaxDuration;

public class TvProgram {
    private String name;
    private int duration;

    public TvProgram(String constrtrName, int constrtrDuration){
        name = constrtrName;
        duration = constrtrDuration;
    }

    public boolean isAwesome(){
        return name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return name + ", " + duration + " minutes";
    }
}
