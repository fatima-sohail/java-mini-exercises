package algorithm_selection_sort_string_type_string;

import java.util.ArrayList;

public class Algorithm {
    //create an arrayList
    ArrayList<String> stringList;
    //constructor
    public Algorithm(){
        stringList = new ArrayList<>();
    }

    //create the following methods:
    //smallestString, indexOfSmallestString, indexOfSmallestFrom, swap, sort

    public static String smallest(ArrayList<String> stringListt){
        //assume the first string is the smallest
        String smallesString = stringListt.get(0);

        //iterate through the list
        for(int i =1; i< stringListt.size(); i++){
            String current = stringListt.get(i);
            if(current.compareTo(smallesString) < 0){ //if the current is lexicographically smaller
                smallesString = current; //update the smallestString
            }
        }

        return smallesString;
    }

    //finding the position(index) of smallestString in the list
    public static int indexOfSmallest(ArrayList<String> stringListt){
        //assume index of smallest is 0
        int indexOfSmallest = 0;
        //assume smallestString is at index 0
        String smallestString = stringListt.get(0);

        // Loop through the array to find the smallest string's index
        for(int i = 1; i< stringListt.size(); i++){
            // Compare each element with the smallest one found so far
            String currentString = stringListt.get(i);
            if(currentString.compareTo(smallestString) < 0){
                indexOfSmallest = i;  // If a smaller string is found, update the index
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(ArrayList<String> stringList, int startIndex){
        //assume index of smallest starts from 'indexFrom' rather than 0
        int smallestIndex = startIndex;


        for(int i = startIndex; i<stringList.size(); i++){

            if(stringList.get(i).compareTo(stringList.get(smallestIndex)) < 0){
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(ArrayList<String> stringList, int index1, int index2){
        // Create a temp variable to store the value temporarily
        String temp = stringList.get(index1);

        // Swap the elements at index1 and index2
        stringList.set(index1, stringList.get(index2));
        stringList.set(index2, temp);

    }

    public static void sort(ArrayList<String> stringList){
        for(int i = 0; i< stringList.size(); i++){
            int indexOfSmallestFrom = indexOfSmallestFrom(stringList, i);

            if(indexOfSmallestFrom != i)
            swap(stringList, i, indexOfSmallestFrom);
            printList(stringList);
        }
    }

    public static void printList(ArrayList<String> stringList){
        for(int i = 0; i< stringList.size(); i++){
            //print out the list, if its not the last element in the list, add
            //commas btw them
            System.out.println(stringList.get(i));
            if(i<stringList.size()-1){
                System.out.println(", ");
            }
        }
        //print a new line after the array
        System.out.println();

    }


}
