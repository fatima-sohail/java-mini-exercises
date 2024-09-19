/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
//Write a program that reads a year from the user, and checks whether or not
// it is a leap year.
//year should be divisible by 4 but not by 100, else divisible by 400


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        //int year = Integer.parseInt(args[0]);
        //        boolean isLeapYear;
        //
        //
        //        isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        //
        //        System.out.println(isLeapYear);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a Year");

        int inputInInt = Integer.valueOf(scanner.nextLine());
        if((inputInInt % 4 == 0 && inputInInt % 100 != 0) || inputInInt % 400 == 0){
            System.out.println("it is a leap year.");
        }else{
            System.out.println("it is not a leap year.");
        }
    }

}
