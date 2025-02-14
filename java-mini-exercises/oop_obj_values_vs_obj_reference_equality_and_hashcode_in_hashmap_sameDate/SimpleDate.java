package oop_obj_values_vs_obj_reference_equality_and_hashcode_in_hashmap_sameDate;

import java.util.Objects;

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

    @Override //add this before equals and hashcode().
            // This makes it clear that the method is not unique but extends or
            // replaces behavior from a parent class or interface.
    public boolean equals(Object comparedObj){
        //check if obj in param is null or does not belong to the same class as obj outside
        //the param on which this method was called (i.e., obj.equals(comparedObj)).
        if(comparedObj == null || this.getClass() != comparedObj.getClass()){
            return false;
        }

        //if the obj in param has same reference as obj we are comparing it to i.e obj.equals(comparedObj)
        if(comparedObj == this){
            return true;
        }

        //if above conditions are not met, cast the `comparedObj` to the same type as
        // the object on which this method was called (i.e., obj.equals(comparedObj)).
        SimpleDate compared = (SimpleDate) comparedObj;

        //once they both have same type, check if the fields are identical, if they are,
        //return true
        if(this.day == compared.day && this.month == compared.month && this.year == compared.year){
            return true;
        }

        //otherwise return false
        return false;
    }

    @Override
    public int hashCode(){

        //return this.day + this.month + this.year; //not effective, chances of collisions
        return Objects.hash(day, month, year);
    }

}
