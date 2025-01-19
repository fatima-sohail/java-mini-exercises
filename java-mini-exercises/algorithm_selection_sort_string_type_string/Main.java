package algorithm_selection_sort_string_type_string;

import java.util.ArrayList;

import static algorithm_selection_sort_string_type_string.AlgorithmInList.indexOfSmallestFrom;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Banana");

        // Printing the ArrayList
        System.out.println(fruits);
        //smallest
        System.out.println(AlgorithmInList.smallest(fruits));
        //index of smallest element
        System.out.println(AlgorithmInList.indexOfSmallest(fruits));

        //if you dont want to use `Algorithm.`, import the method from `Algorithm..` class
        //and use it
        int result = indexOfSmallestFrom(fruits, 2);
        System.out.println(result);
        //
        AlgorithmInList.swap(fruits, 0,1);
        System.out.println("list after the swap:");
        AlgorithmInList.printList(fruits);

        //sort
        System.out.println();
        AlgorithmInList.sort(fruits);
        System.out.println("List after sorting: ");
        AlgorithmInList.printList(fruits);

    }
}
