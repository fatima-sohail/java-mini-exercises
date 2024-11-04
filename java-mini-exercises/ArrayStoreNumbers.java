import java.util.Scanner;

// Write is a program that initially asks the user to enter how many numbers,
// and then enter the numbers. Finally it prints back the numbers in the same order.
//The numbers are stored in an Array.
//An execution of the program might look like this:
//
//Sample output
//How many numbers? 4
//Enter the numbers:
//4
//8
//2
//1
//Here are the numbers again:
//4
//8
//2
//1
public class ArrayStoreNumbers {
    public static void main(String[] args) {
        //prepare console to receive the userinput
        Scanner scanner = new Scanner(System.in);
        //ask the user to enter how many numbers
        System.out.println("How many number do you want in an array?");
        int howMany = Integer.valueOf(scanner.nextLine());

        //create an array
        int[] numbers = new int[howMany];

        //ask the user to enter those numbers
        System.out.println("Enter those numbers");

        //go through each number and add each number in the array
        int i = 0;
        while(i< numbers.length){
            numbers[i] = Integer.valueOf(scanner.nextLine());
            i++;
        }

        //give a gap for clarity
        System.out.println("");
        //print the numbers stored in the array
        i=0;
        while(i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }

    }


}
