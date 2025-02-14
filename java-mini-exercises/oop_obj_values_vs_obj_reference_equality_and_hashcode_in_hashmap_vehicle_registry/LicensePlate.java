package oop_obj_values_vs_obj_reference_equality_and_hashcode_in_hashmap_vehicle_registry;

import java.util.Objects;

public class LicensePlate {
    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String licNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.licNumber = liNumber;
        this.country = country;
    }

    @Override //add this before equals and hashcode().
             // This makes it clear that the method is not unique but extends or
            // replaces behavior from a parent class or interface.
    public String toString() {
        return country + " " + licNumber;
    }

    @Override
    public boolean equals(Object comparedObj){
        if(comparedObj == null || this.getClass() != comparedObj.getClass()){
            return false;
        }

        if(this == comparedObj){
            return true;
        }

        LicensePlate compared = (LicensePlate) comparedObj;
        if(this.licNumber.equals(compared.licNumber) && this.country.equals(compared.country)){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(licNumber, country);
    }

}
