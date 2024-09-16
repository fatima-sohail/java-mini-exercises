import java.util.Scanner;
//The table below describes how the grade for a particular course is determined. Write a program that gives a course grade according to the provided table.
//
//points	grade
//< 0	    impossible!
//0-49	    failed
//50-59	    1
//> 100	    incredible!

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int inputToInt = Integer.valueOf(scanner.nextLine());

        if(inputToInt < 0 ){
            System.out.println("Grade: impossible!");
        }else if(inputToInt >= 0 && inputToInt <= 49){
            System.out.println("Grade: failed");
        }else if(inputToInt >= 50 && inputToInt <= 59){
            System.out.println("Grade: 1");
        }else if(inputToInt > 100){
            System.out.println("incredible!");
        }
    }
}
