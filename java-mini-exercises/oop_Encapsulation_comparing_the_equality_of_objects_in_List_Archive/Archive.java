package oop_Encapsulation_comparing_the_equality_of_objects_in_List_Archive;

public class Archive {
    String identifier;
    String name;

    public Archive(String identifierr, String namee){
        identifier = identifierr;
        name = namee;

    }

    @Override
    public boolean equals(Object obj2) {
        if(this == obj2){
            return true;
        }

        if(!(obj2 instanceof Archive)){
            return false;
        }

        Archive obj2Archive = (Archive) obj2;

        if(identifier.equals(obj2Archive.identifier)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Identifier: " +  identifier + ", Name: " + name;
    }
}
