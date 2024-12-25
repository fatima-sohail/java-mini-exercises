package oop_Encapsulation_comparing_the_equality_of_objects_in_List_books;

public class Books {
    String name;
    int publicationYear;

    public Books(String namee, int publicationYearr){
        name = namee;
        publicationYear = publicationYearr;
    }

    @Override
    public boolean equals(Object obj2) {
        //if both current and obj2 are loacted in the same memory place, they are equal,
        //return true
        //if both are not of same type, they are not equal, return false
        //make obj2 same type as the current object
        //if the values of all the variables ob both these objects are same, they are equal,
        //return true, else return false
        if(this == obj2){
            return true;
        }

        if(!(obj2 instanceof Books)){
            return false;
        }

        Books obj2books = (Books) obj2;

        if(name.equals(obj2books.name)  && publicationYear == obj2books.publicationYear){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "name= " + name + ", publicationYear= " + publicationYear;
    }
}
