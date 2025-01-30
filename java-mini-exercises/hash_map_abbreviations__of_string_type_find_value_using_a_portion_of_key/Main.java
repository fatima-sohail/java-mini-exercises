package hash_map_abbreviations__of_string_type_find_value_using_a_portion_of_key;

public class Main {
    public static void main(String[] args) {
        Abbreviations abbObj = new Abbreviations();

        abbObj.addKeyAndValue("e.g.", "for example");
        abbObj.addKeyAndValue("etc.", "and so on");
        abbObj.addKeyAndValue("i.e.", "more precisely");

        //provide the text
        String text = "e.g. i.e. etc. lol";

        //using for each loop, split the text into words(part text) and
        //see if the text has abbreviation(key), if it does,
        //find its explaination(value) and print it out
        for(String partText: text.split(" ")){
            if(abbObj.hasAbbreviation(partText)){
                partText = abbObj.findExplanationFor(partText);
            }
            System.out.print(partText);
            System.out.print(" ");

        }

    }
}
