package inheritance_task2_person_and_subclasses_5_parts;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + " Salary: " + this.salary + " euros/month";
    }
}
