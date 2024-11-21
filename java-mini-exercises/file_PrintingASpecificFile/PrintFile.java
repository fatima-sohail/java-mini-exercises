//Head to the README.txt file to see the path of data.txt & song.txt

//Write a program that asks the user for a string, and then prints the contents
//of a file with a name matching the string provided. You may assume that the user
//provides a file name that the program can find.
//
//The exercise template contains the files "data.txt" and "song.txt", which you may
//use when testing the functionality of your program. The output of the program can be
//seen below for when a user has entered the string "song.txt". The content that is printed
//comes from the file "song.txt". Naturally, the program should also work with other filenames,
//assuming the file can be found.
//
//Sample output
//Which file should have its contents printed?
//song.txt
//No option for duality
//The old is where we come
//Clockspeed is fast, but we'll survive
//The new will overcome
//We are challengers, not followers
//We take the ball to build
//Easy safe services
//Are here to stay
//
//Value for society
//Value for life
//For you and me
//Tieto is here allright!

package file_PrintingASpecificFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintFile {
    public static void main(String[] args) {
        //create a scanner object
        Scanner scanner = new Scanner(System.in);
        //ask the user for file name
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

        //print the file name provided by the user
        printAndReadFile(fileName);
    }

    private static void printAndReadFile(String file) {
        //use try and catch method
        //create a scanner for reading the file, keep on reading the file until
        //all the lines have been read, then print each line
        try(Scanner scanner = new Scanner(Paths.get(file))){
            //read the file until all the lines have been read
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row); //print each line
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
