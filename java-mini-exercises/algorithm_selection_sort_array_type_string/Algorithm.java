package algorithm_selection_sort_array_type_string;

public class Algorithm {
    //instance variable array of type `String`
    String[] stringArray;

    //constructor with param `array size` to initialize numArray with a specified size
    public Algorithm(int size){
        stringArray = new String[size];
    }

    //smallest, index of the smallest value, indexOfSmallest, indexOfSmallestFrom, swap,
    //sort, print
    public static String smallest(String[] array){
        //if the array is empty, exit the program
        if(array.length == 0){
            System.out.println("Array is empty");
            return null;
        }

        //else
        //assume the first string is smallest
        String smallest = array[0];
        //For strings, start from i = 1 because the comparison requires
        // lexicographical ordering (and we want to avoid comparing the first
        // element to itself cz it always leads to false).
        for(int i=1; i< array.length; i++){
            //use compareAt() to compare the current element(i) with smallest element
            //if the result of this comparison is less than 0, it means current element
            //is lexicographically smaller than the string we are comparing it to(smallest)
            //update the smallest if current string is smaller.
            String current = array[i];
            if(current.compareTo(smallest) < 0){
                smallest = array[i];
            }
        }

        return smallest;
    }

    /**since this method is about finding index and returning index, method type is `int`,
     and not string**/
    public static int indexOfSmallest(String[] array){
        //if the array is empty, exit the program
        if(array.length == 0){
            System.out.println("Array is empty");
            return -1;
        }

        //else
        //assume index of smallest is 0
        int indexOfSmallest = 0;
        //inside the for loop, if the result of comparison is less than 0, b/w current
        //string and smallest string found so far, that means smaller strings exist
        //in the array. update the index of smallest if smaller string is found
        //outside the loop, return the smallest string (and not the index itself cz return type is String)
        //found at the Index
        for(int i = 1; i< array.length; i++){
            String current = array[i];
            if(current.compareTo(array[indexOfSmallest]) < 0){
                indexOfSmallest = i; //update the index if smaller is found
            }
        }
        return indexOfSmallest;
    }

    /**since this method is about finding index and returning index, method type is `int`,
    and not string**/
    //method returns the index of smallest from a specified index
    public static int indexOfSmallestFrom(String[] array, int startIndex){
        //if the array is empty, exit the program
        if(array.length == 0){
            System.out.println("Array is empty");
            return -1;
        }

        //create variable indexOfSmallestElement and assume it is the startIndex
        int indexOfSmallestString = startIndex;
        for(int i= startIndex; i< array.length; i++){
            //from the start index, compare the current string with the one we are comparing
            //it to(indexOfSmallestString)
            //if their reult is less than 0, update the indexOfSmallest to smaller one
            if(array[i].compareTo(array[indexOfSmallestString]) < 0){
                indexOfSmallestString = i;
            }
        }
        //return the smallest string found at the index
        return indexOfSmallestString;
    }

    public static void swap(String[] array, int index1, int index2){
        //create a temp variable to store values temporarily
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void selectionSort(String[] array){
        //print the original array. for that we need a printArray()
        //after sorting, print the updated array
        printArray(array);

        //for sorting, go through the array
        //Find the index of the smallest element from index i onwards(sel.sort works by selecting the smallest element in the remaining unsorted portion of the array)
        //If the smallest element is not already at position i, swap
        //it with the element at position i
        for(int i = 0; i< array.length; i++){
            int indexOfSmallestFrom = indexOfSmallestFrom(array, i);

            if(indexOfSmallestFrom != i){
                swap(array, i, indexOfSmallestFrom);
                printArray(array);
            }
        }

        //print the final updated array
        //printArray(array);
    }

    //print the array in this format: [2,3,4,5]
    public static void printArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i < array.length-1){ //if its not the last element in the array, add `,`
                System.out.print(", ");
            }
        }
        System.out.println(); // Print a new line after the array
    }



}
