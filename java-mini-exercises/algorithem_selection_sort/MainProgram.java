package algorithem_selection_sort;

import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {
        int[] numArray = {6,5,4,7,11};
        System.out.println("smallest: " + MainProgram.smallest(numArray));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numArray));

        int[] numbers = {-1, 6, 9, 8, 12};
        //below: Starting from index 0, the smallest number is -1 and its index is 0.
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));

        //below method call searches for the index of the smallest value starting
        //from index 1. In this case the smallest number is 6 and its index is 1.
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));

        //below method call searches for the index of the smallest value starting at index 2.
        //Then the smallest number is 8 and its index is 3.
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        System.out.println();
        int[] numbers2 = {3, 2, 5, 4, 8};
        //Array. is a pre added class in java library, import it
        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2));

        System.out.println();
        int[] numbers3 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers3);
        System.out.println(Arrays.toString(numbers3));
        
        //you can also use java inbuilt sort()
//        Arrays.sort(numbers3);
//        System.out.println(Arrays.toString(numbers3));

    }

    //create instance varriable `numArray` of type int to store numbers
    int[] numArray;

    //create a constructor class
    public MainProgram(int size){
        numArray = new int[size];
    }

    public static int smallest(int[] array){
        // if the array is empty, exit the program
        if(array.length == 0){
            System.out.println("This array is empty");
            return -1; //return a special value to indicate the array is empty
        }

        //if it's not empty
        //assume the first element in the array is the smallest
        int smallest = array[0];
        //go through the array and find out the smallest
        for(int i = 0; i<array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        // if the array is empty, exit the program
        if(array.length == 0){
            System.out.println("This array is empty");
            return -1; //return a special value to indicate the array is empty
        }

        //assume the index of smallest num is 0
        int smallestIndex = 0;
        //loop through the array to find the index of the smallest num
        for(int i = 0; i< array.length; i++){
            if(array[i] < array[smallestIndex]){
                smallestIndex = i; //update the index if the smaller num is found
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        //initialize the index of smallest element to start index
        int smallestIndex = startIndex;
        //start from the start index
        for(int i = startIndex; i < table.length; i++){
            //compare the current element with the smallest found so far
            if(table[i] < table[smallestIndex]){
                //update smallestIndex if a smaller value is found
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        //create a temp variable
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        //print the array before sorting
       printArray(array);

        //do sorting

        for(int i = 0; i<array.length; i++){
            //find the index of smallest element from index i onwards
            int smallestIndexFrom = indexOfSmallestFrom(array, i);

            //if the smallest index is different from i, swap the elements,
            //If smallestIndex == i, no swap is needed because the element is already in the
            //correct position
            //print the array after the swap
            if(smallestIndexFrom != i){
                swap(array, i, smallestIndexFrom);
                printArray(array);
            }
        }
    }

    public static void printArray(int[] array){
        System.out.print("["); //stay in the same line after printing
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]);
            //have a comma inbtw elements except after the last element in the array
            if(i< array.length-1){
                System.out.print(", "); //stay in the same line after printing
            }
        }
        System.out.println("]");
    }

}
