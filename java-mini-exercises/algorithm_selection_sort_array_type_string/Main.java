package algorithm_selection_sort_array_type_string;

import static algorithm_selection_sort_array_type_string.Algorithm.indexOfSmallestFrom;

public class Main {
    public static void main(String[] args) {
        //create a string array and pass some strings
        String[] stringArray = {"apple", "banana", "grape","grapefruit", "cherry"};

        //use `algorithm` class's methods on this array
        //print the smallest string in the array
        System.out.println(Algorithm.smallest(stringArray));

        //print the index of smallest string
        System.out.println(Algorithm.indexOfSmallest(stringArray));

        //print the index of smallest string from a specified index(2)
        //from index 2 to onwards, `cherry` is smallest cz `c` comes first alphabatically
        System.out.println(indexOfSmallestFrom(stringArray, 2));
        //OR
        //if you dont want to use `Algorithm.`, import this method from `Algorithm..` class
        //and use it
        int result = indexOfSmallestFrom(stringArray, 2);
        System.out.println(result);

        //try swap method
        System.out.println();
        System.out.println("array after the swap:");
        Algorithm.swap(stringArray, 0, 4);
        Algorithm.printArray(stringArray);

        //using sort(), sort the strings in alphabatical order
        System.out.println();
        System.out.println("array after sorting:");
        Algorithm.selectionSort(stringArray);
        Algorithm.printArray(stringArray);


    }

}
