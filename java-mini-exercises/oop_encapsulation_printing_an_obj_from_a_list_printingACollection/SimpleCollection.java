package oop_encapsulation_printing_an_obj_from_a_list_printingACollection;
//create 2 instance variables, name of type String and elementList of type String arrayList
//constructor that takes in String parameter, create and assign a new arrayList
//add method that adds element to the list
//getElemens method of type String Arraylist
//create a method that clears the list
//create a toString
import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elementlist;

    public SimpleCollection(String name){
        this.name = name;
        elementlist = new ArrayList<>();
    }

    public void addElement(String element){
        this.elementlist.add(element);
    }

    public ArrayList<String> getElementlist() {
        return this.elementlist;
    }

    public void clearList(){
        elementlist.clear();  //clears the arrayList
    }

    @Override
    public String toString() {
        if(this.elementlist.isEmpty()){
            return "list name: " + this.name + ", list size: empty";
        }


        String outputAllElements = " ";
        for(String element: this.elementlist ){
            outputAllElements = outputAllElements + "\n" + element;
        }

        if (this.elementlist.size() == 1) {
            return "list name: " + this.name + ", list size: " + elementlist.size() +
                    ", element in the list: " + outputAllElements;
        }else{
            return "list name: " + this.name + ", list size: " + elementlist.size() +
                    ", elements in the list: " + outputAllElements;
        }
    }
}