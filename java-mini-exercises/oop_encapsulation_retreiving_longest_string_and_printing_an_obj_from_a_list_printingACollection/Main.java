package oop_encapsulation_retreiving_longest_string_and_printing_an_obj_from_a_list_printingACollection;

public class Main {
    public static void main(String[] args) {
        SimpleCollection alphabets = new SimpleCollection("alphabet collection");
        System.out.println(alphabets);

        alphabets.addElement("a");
        System.out.println(alphabets);

        alphabets.addElement("b");
        System.out.println(alphabets);

        System.out.println("");
        SimpleCollection characters = new SimpleCollection("characters");
        System.out.println(characters);

        characters.addElement("pikacho");
        System.out.println(characters);

        characters.addElement("pokemon");
        System.out.println(characters);

        characters.clearList();
        System.out.println(characters);

        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.addElement("magneto");
        j.addElement("mystique");
        j.addElement("phoenix");

        System.out.println("Longest: " + j.longest());
    }
}
