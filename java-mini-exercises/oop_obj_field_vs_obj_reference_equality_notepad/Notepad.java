package oop_obj_field_vs_obj_reference_equality_notepad;

public class Notepad {
    private String name;
    private int year;

    public Notepad(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override //add this before equals
    //@Override is used only when you are customizing, rewriting (overriding) a method that
    //already exists in a parent class or in java lib. equals() is an inbuilt method in
    //java lib

    //this equals behaves same as java's inbuilt lib method, which is it
    //checks if two objects point to the same memory location

    //sometimes you need make customized equals(), that checks if the obj fields are identical,
    //they are equal, even though objs memory locations are different
    public boolean equals(Object comparedObj){
        //return false, if the provided obj is null, or the provided obj is not
        //an instance of the current class
        if(comparedObj == null || this.getClass() != comparedObj.getClass()){
            return false;
        }

        //return true, if provided obj is same as the current obj
        if(comparedObj == this){
            return true;
        }

        //objs are not same
        return false;
    }

}
