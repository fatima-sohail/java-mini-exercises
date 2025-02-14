package oop_obj_field_vs_obj_reference_equality_sameDate;

public class Main {
    public static void main(String[] args){

        SimpleDate d = new SimpleDate(1, 2, 2000);

        System.out.println(d.equals("heh")); //prints: false

        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        //prints: false

        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
        //prints: true //cz although both have different memory locations but have identical
                       //fields, which makes both objs equal
                        //such behaviour depends on the type of equal() you want to have
                        //opposite from notepad class in folder
                        //`oop_obj_field_vs_obj_reference_equality_notepad`
    }
}
