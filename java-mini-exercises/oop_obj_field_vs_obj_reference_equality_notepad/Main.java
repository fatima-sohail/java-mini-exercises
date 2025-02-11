package oop_obj_field_vs_obj_reference_equality_notepad;

public class Main {
    public static void main(String[] args){
        Notepad basic = new Notepad("basics", 2000);
        Notepad advanced = new Notepad("advanced", 2001);

        //see if basic equals basic //prints:true
        System.out.println(basic.equals(basic));

        //see if basic obj equals advanced obj //prints:false
        System.out.println(basic.equals(advanced));

        //see if basic obj equals the new objs with similar fields  //prints:false
        System.out.println(basic.equals(new Notepad("basics", 2000)));

    }
}
