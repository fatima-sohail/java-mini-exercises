//Complete the method public static void printNeatly(int[] array) in the class named 'ArrayPrinter'
//to make it print the numbers of the array it receives more neatly. There should be a whitespace
//and a comma between each number. don't put a comma after the last number.
//
//Print the numbers on one line using System.out.print.
//
//You can try out your printing with this example:
//
//int[] array = {5, 1, 3, 4, 2};
//printNeatly(array);
//Sample output
//5, 1, 3, 4, 2

public class ArrayPrintNeatly {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
    public static void printNeatly(int[] differentArray){
        int i = 0;
        while(i< differentArray.length){
            System.out.print(differentArray[i]);
            //after printing an element, check if its not the last element. If it isn't, print a comma and a space
            if(i< differentArray.length-1){
                System.out.print(", ");
            }
            i++;
        }
    }
}
