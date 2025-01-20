package algorithm_binary_and_linear_search_in_list;

import java.util.ArrayList;

public class Searching {
    ArrayList<Book> booklist;

    public Searching() {
        booklist = new ArrayList<>();
    }

    //This method returns the `index` of the book if it finds the match
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        //go through the book list, and see if the id we are searching for matches with
        //any in the list
        for (int i = 0; i < books.size(); i++) {
            int currentBookId = books.get(i).getId();
            if (currentBookId == searchedId) { // Compare the book's id with searchedId
                return i;            //Return the index of the book if it matches
            }
        }

        return -1;      // Return -1 if no book with the searchedId is found

    }

    //Always sort the arrayList before using this method!!
    public static int binarySearch(ArrayList<Book> bookList, int searchedId){

        int startIndex = 0;
        int endIndex = bookList.size() - 1;

        // Continue until the range is exhausted
        while(startIndex <= endIndex){
            // Calculate the middle index and value
            int middleIndex = (startIndex + endIndex) / 2;
            int valueAtMidIndex = bookList.get(middleIndex).getId();

            // If the middle value matches the searched value, return the index
            if(valueAtMidIndex == searchedId){
                return middleIndex;
            }

            // If the middle value is smaller than the searched value, search in the right half
            if(valueAtMidIndex < searchedId){
                startIndex = middleIndex + 1;
            }


            // If the middle value is larger than the searched value, search in the left half
            if(valueAtMidIndex > searchedId){
                endIndex = middleIndex - 1;
            }
        }

        //if searchedValue not found, return -1
        return -1;
    }

    public static int indexOfSmallestFrom(ArrayList<Book> bookList, int startIndex){
        //assume index of smallest starts from 'startIndex' rather than 0
        int smallestIndex = startIndex;
        for(int i = startIndex; i < bookList.size(); i++){
            if(bookList.get(i).getId() < bookList.get(smallestIndex).getId()){
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(ArrayList<Book> bookList, int index1, int index2){
        // Create a temp variable to store the value temporarily
        Book temp = bookList.get(index1);

        // Swap the elements at index1 and index2
        bookList.set(index1, bookList.get(index2));
        //swap index2 with temp
        bookList.set(index2, temp);

    }

    public static void sort(ArrayList<Book> bookList){
        //first find the smallestIndexFrom, if its less than i, swap
        for(int i = 0; i < bookList.size(); i++){
            int index = indexOfSmallestFrom(bookList, i);

            if(index != i){
                swap(bookList, i, index);
                printList(bookList);
            }
            //if you just want to print the final array
            //printArray(array)
        }
    }

    public static void printList(ArrayList<Book> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            //print out the list, if its not the last element in the list, add
            //commas btw them
            System.out.println(bookList.get(i));
            if(i < bookList.size()-1){
                System.out.print(", ");
            }

        }

        //print a new line after the array
        System.out.println();
    }

}
