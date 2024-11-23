//Head to the README.txt file to see the path of numbers-1.txt & numbers-2.txt

//Write a program that prompts the user for a filename, as well as the upper and
//lower bounds for the accepted range of numbers. Then the program reads the numbers
//contained in the file (each number is on its own line) and only accounts for the
//numbers which are inside the given range. Finally, the program should print the number
//of numbers that were inside the given range.
//
//You can convert a string-type integer read from a file into a proper integer using the
//command Integer.valueOf (just as when handling input from a user).
//
//Sample output
//File? numbers-1.txt
//Lower bound? 15
//Upper bound? 20
//Numbers: 2
//
//Sample output
//File? numbers-1.txt
//Lower bound? 0
//Upper bound? 300
//Numbers: 4


package file_NumbersFromAFile;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file?");
        String fileName = scanner.nextLine();

        System.out.println("Lower bound?");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.println("Upper bound?");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try(Scanner scanner2 = new Scanner(Paths.get(fileName))){
            //read each line from the file
            int count = 0;
            while(scanner2.hasNextLine()){
                int row = Integer.parseInt(scanner2.nextLine());

                //add counter to get the total numbers in a given range
                if(row >= lowerBound && row <= upperBound){
                    System.out.println(row);
                    count++;
                }
            }
            //print the total nums in the a given bound
            System.out.println("Total num: " + count);
        }catch (Exception e){
            System.out.println("Error: " + e);
        }

    }
}
