//Head to the README.txt file to see the path of CSV-format.txt

//In this exercise, we'll be working with files stored in CSV format, which
//contain names and ages separated by commas. The file format may look like
//this:
//
//Sample data
//lily,3
//anton,5
//levi,4
//amy,1
//
//The exercise template already has a Person class, and the class StoringRecords
//has a body for the method public static ArrayList<Person> readRecordsFromFile(String file).
//Implement the readRecordsFromFile method such that it reads the persons from the file
//passed as a parameter, and finally returns them in the list returned by the method.
//
//calculate the sum and average of their ages.
//The exercise template has a main method that you can use to test how your program works.
//In this exercise, only modify the method readRecordsFromFile.

package file_StoringRecords;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("File name: ");
        String fileName = scanner.nextLine();

        ArrayList <Person> recordsList = readRecordsFromTheFile(fileName);

        System.out.println("Persons size: " + recordsList.size());

        for(Person persons: recordsList){
            System.out.println(persons);
        }

    }//end of psvm

    private static ArrayList<Person> readRecordsFromTheFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        int sum = 0;
        double average = 0.0;
        try(Scanner scanFile = new Scanner(Paths.get(file))) {
            int age = 0;
            int count = 0;
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                String[] parts = row.split(",");
                String name = parts[0];
                age = Integer.valueOf(parts[1]);

                persons.add(new Person(name, age));
                count++;
                sum = sum + age;
            }//end of loop
            average = 1.0 * sum/count ;
            System.out.println("Sum: " + sum + " ,Average: " + average);
        }catch(Exception e){
            System.out.println("error: " + e);
        }

        return persons;
    }//end of readRecordsFromTheFile method
}//end of main
