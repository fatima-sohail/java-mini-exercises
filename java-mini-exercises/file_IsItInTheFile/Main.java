//Head to the README.txt file to see the path of names.txt & other-names.txt

//The exercise template comes with two files, names.txt and other-names.txt. Write a
//program that first asks the user for the name of the file to be read, after which the
//user is prompted for the string that they're looking for. The program then reads the
//file and searches for the desired string.
//
//If the string is found, the program should print "Found!". If not, the program should
//print "Not found.". If reading the file fails (the reading ends in an error) the program
//should print the message "Reading the file " + file + " failed.".
//
//Sample output
//Name of the file:
//names.txt
//Search for:
//Antti
//Not found.
//
//Sample output
//Name of the file:
//names.txt
//Search for:
//ada
//Found!
//
//Sample output
//Name of the file:
//nonexistent.txt
//Search for:
//test
//Reading the file nonexistent.txt failed.

package file_IsItInTheFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file?");
        String fileName = scanner.nextLine();

        System.out.println("Search for?");
        String searchedFor = scanner.nextLine();

        try(Scanner scanFile = new Scanner(Paths.get(fileName))){
            while(scanFile.hasNextLine()){
                String row = scanFile.nextLine();
                if(searchedFor.equals(row)){
                    System.out.println("Found!");
                    return;
                }
            }//end of loop

            System.out.println("Not found");

        }catch(Exception e){
            System.out.println("Reading the file " + fileName + " failed.");
        }

    }
}
