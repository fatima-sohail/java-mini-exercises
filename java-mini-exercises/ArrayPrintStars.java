//Complete the method public static void printArrayInStars(int[] array) in the class named 'Printer'
// to make it print a row of stars for each number in the array. The amount of stars on each row is
// defined by the corresponding number in the array.
//
//You can try out the printing with this example:
//
//int[] array = {5, 1, 3, 4, 2};
//printArrayInStars(array);
//Sample output
//
//*****
//*
//***
//****
//**

public class ArrayPrintStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printArrayInStars(int[] array){
        //amount of stars in each row corresponds to the number in the array
        //go through each element to add each number in the array in vertical form
        //outer loop goes through each element in the array
        //inner loop prints stars for the current element/row. array[i] determines
        //how many stars to print
        for(int i=0; i< array.length; i++){
            for(int j=0; j<array[i]; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
