import java.util.ArrayList;

//Create the method public static void removeLast(ArrayList<String> strings) in the exercise
// template. The method should remove the last value in the list it receives as a parameter.
// If the list is empty, the method does nothing.
//
//ArrayList<String> strings = new ArrayList<>();
//
//strings.add("First");
//strings.add("Second");
//strings.add("Third");
//
//System.out.println(strings);
//
//removeLast(strings);
//removeLast(strings);
//
//System.out.println(strings);
//Sample output
//
//[First, Second, Third]
//[First]
public class ListRemoveLast {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings){
        //if the list is not empty, remove the string at last index
        //get the last index first
        int lastIndex = strings.size()-1;
        //to get the value at the last index
//        String lastValue = strings.get(lastIndex);
        if(!strings.isEmpty()){
            strings.remove(lastIndex);
//            strings.remove(lastValue);
        }
    }

}
