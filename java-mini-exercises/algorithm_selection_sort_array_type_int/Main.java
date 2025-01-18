package algorithm_selection_sort_array_type_int;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numArray = {6,5,4,7,11};
        System.out.println("smallest: " + Algorithm.smallest(numArray));
        System.out.println("Index of the smallest number: " + Algorithm.indexOfSmallest(numArray));

        int[] numbers = {-1, 6, 9, 8, 12};
        //below: Starting from index 0, the smallest number is -1 and its index is 0.
        System.out.println(Algorithm.indexOfSmallestFrom(numbers, 0));

        //below method call searches for the index of the smallest value starting
        //from index 1. In this case the smallest number is 6 and its index is 1.
        System.out.println(Algorithm.indexOfSmallestFrom(numbers, 1));

        //below method call searches for the index of the smallest value starting at index 2.
        //Then the smallest number is 8 and its index is 3.
        System.out.println(Algorithm.indexOfSmallestFrom(numbers, 2));

        System.out.println();
        int[] numbers2 = {3, 2, 5, 4, 8};
        //Array. is a pre added class in java library, import it
        System.out.println(Arrays.toString(numbers2));

        Algorithm.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        Algorithm.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2));

        System.out.println();
        int[] numbers3 = {8, 3, 7, 9, 1, 2, 4};
        Algorithm.selectionSort(numbers3);
        System.out.println(Arrays.toString(numbers3));

        //you can also use java inbuilt sort()
//        Arrays.sort(numbers3);
//        System.out.println(Arrays.toString(numbers3));

    }

}
