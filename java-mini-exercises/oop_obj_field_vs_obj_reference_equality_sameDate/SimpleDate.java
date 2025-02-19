package oop_obj_field_vs_obj_reference_equality_sameDate;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }


    @Override //add this before equals.
    // This makes it clear that the method is not unique but extends or
    // replaces behavior from a parent class or interface.

    //this one basically says: if the fields of both the objs are same, they are equal
    //even though both objs have different memory location
    //opposite from notepad class in folder`oop_obj_field_vs_obj_reference_equality_notepad`
    public boolean equals(Object comparedObj){

        //check if the comparedObj is
        //null or doesn't share the same class as the obj on which
        //the method was called i.e. obj.equals(comparedObj)
        if(comparedObj == null || this.getClass() != comparedObj.getClass()){
            return false;
        }

        //if the first condition is not met, check if the reference of the
        // compardobj is same as reference of the obj on which
        // the method was called (i.e. obj.equals(comparedObj))
        if(this == comparedObj){
            return true;
        }

        // If the above conditions are not met, cast the `comparedObj` to the same type as
        // the object on which this method was called (i.e., obj.equals(comparedObj)).
        // Then, compare their relevant fields and return true if they are identical.
        SimpleDate givenObj =  (SimpleDate) comparedObj ;

        if(this.day == givenObj.day && this.month == givenObj.month && this.year == givenObj.year){
            return true;
        }

        //otherwise objs arent same
        return false;
    }
}
