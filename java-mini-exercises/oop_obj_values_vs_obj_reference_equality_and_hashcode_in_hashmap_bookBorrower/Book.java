package oop_obj_values_vs_obj_reference_equality_and_hashcode_in_hashmap_bookBorrower;

public class Book {
    private String name;
    private int publishedYear;

    public Book(String name, int publishedYear){
        this.name = name;
        this.publishedYear = publishedYear;
    }

    public String toString() {
        return name + " (" + publishedYear + ")";
    }

    @Override //add this before equals and hashcode().
    // This makes it clear that the method is not unique but extends or
    // replaces behavior from a parent class or interface.

    //this hashmap equals() method is different from obj's equals() in `Notepad class` in
    //`oop_obj_field_vs_obj_reference_equality_notepad` cz:
    //equals() below says that as long as fields of two objs are identical, they are
    //equal, even though both objs have different memory location

    //in obj's equals(), if the memory location is same, both objs are equal, only having identical
    //fields may not make them equal.
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
        Book givenObj = (Book)comparedObj ;

        //published is type `int` so `==` used, name is `string` so `equals()` is used.
        if(this.publishedYear == givenObj.publishedYear && this.name.equals(givenObj.name)){
            return true;
        }

        //otherwise objs are not equal
        return false;
    }

    //hashcode() returns an integer(only used for obj), since the entries aren't stored in a
    //fixed order in hashmap,
    //each key value pair has a unique integer associated with it, this integer helps us to
    //identify and retrieve the entry we are looking for.
    public int hashCode(){
        //check if a field is null, return the remaining field
        //otherwise, return all the fields
        if(this.name == null){
            return this.publishedYear;
        }

        return this.publishedYear + this.name.hashCode();
    }
}
