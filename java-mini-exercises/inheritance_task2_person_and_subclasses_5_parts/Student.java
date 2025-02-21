package inheritance_task2_person_and_subclasses_5_parts;

public class Student extends Person {
    private int credits;

    public Student(String name, String address){
        super(name, address);
        this.credits = 0;

    }

    public int getCredits(){
        return this.credits;
    }

    public int study(){
        return credits = credits + 1;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "study credits: " + this.credits;
    }
}
