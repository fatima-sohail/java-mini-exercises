//Head to the README.txt file to see the path of CSV-format.txt

//In this exercise, we'll be working with files stored in CSV-format that contain
//names and ages separated by commas. The file format may look like this:
//
//Sample data
//lily,3
//anton,5
//levi,4
//amy,1
//
//Your task is to write a program that first prompts the user for the name of the
//file they want to read. The program then prints the content of the file in the following
//way (we're assuming below that the output is from the above-mentioned file):
//
//Sample output
//Name of the file:
//data.txt
//lily, age: 3 years
//anton, age: 5 years
//levi, age: 4 years
//amy, age: 1 year

package file_RecordsFromAFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File name: ");
        String fileName = scanner.nextLine();

        try(Scanner scan = new Scanner(Paths.get(fileName))){
            while(scan.hasNext()){
                String line = scan.nextLine();
                //call split() on the string
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if(age == 1){
                    System.out.println(name + ", age: " + age + " year");
                }else{
                    System.out.println(name + ", age: " + age + " years");
                }

            }//end of while loop

        }//end of try

        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
