//Head to the README.txt file to see the path of data.txt
//Write a program that prints the contents of a file called "data.txt", such that
//each line of the file is printed on its own line.
//
//If the file content looks like so:
//
//Sample data
//In a
//world
//
//Then the program should print the following:
//
//Sample output
//In a
//world

package file_ReadAndPrintAFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        printFile();
    }

    private static void printFile() {
        //create a scanner for reading the file
        try(Scanner scanner = new Scanner(Paths.get("data.txt"))){
            //read the file until all the lines have been read
            while(scanner.hasNextLine()){
                //read one line and print it
                String row = scanner.nextLine();
                System.out.println(row);
            }
            //if there's a problem, print error
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
