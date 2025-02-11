package oop_obj_field_vs_obj_reference_equality_notepad;

public class Notepad {
    private String name;
    private int year;

    public Notepad(String name, int year){
        this.name = name;
        this.year = year;
    }

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

        //if the provided obj has passed prev. checks, treat the provided obj as an instance
        //of notePad class through casting (we have already checked above that the provided obj
        //is an instance of notePad class)
        Notepad providedObj = (Notepad) comparedObj;

        //now you can access the provided obj's fields
        return this.name.equals(providedObj);
    }

}
