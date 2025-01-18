package algorithm_selection_sort_array_type_int;

public class Algorithm {
    //create instance varriable `numArray` of type int to store numbers
    int[] numArray;

    //create a constructor class
    public Algorithm(int size){
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

    public static void selectionSort(int[] array) {
        //print the array before sorting
        printArray(array);

        //do sorting and print the array afterwards
        for(int i = 0; i<array.length; i++){
            //find the index of smallest element from index i onwards
            int smallestIndexFrom = indexOfSmallestFrom(array, i);

            //for sorting, go through the array
            //Find the index of the smallest element from index i onwards(sel.sort works by selecting the smallest element in the remaining unsorted portion of the array)
            //If the smallest element is not already at position i, swap
            //it with the element at position i
            if(smallestIndexFrom != i){
                swap(array, i, smallestIndexFrom);
                printArray(array);
            }
            //if you just want to print the final array
            //printArray(array)
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
