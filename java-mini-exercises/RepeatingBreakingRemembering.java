import java.util.Scanner;
//part1 of 5:
//Implement a program that asks the user for numbers (the program first prints
// "Write numbers: ") until the user gives the number -1. When the user writes
// -1, the program prints "Thx! Bye!" and ends.
//
//Sample output
//Give numbers:
//5
//2
//4
//-1
//Thx! Bye!

//Part2:
//Extend the program so that it prints the sum of the numbers (not including
// the -1) the user has written.
//
//Sample output
//Give numbers:
//5
//2
//4
//-1
//Thx! Bye!
//Sum: 11

//part3:
//Extend the program so that it also prints the number of numbers (not
// including the -1) the user has written.
//
//Sample output
//Give numbers:
//5
//2
//4
//-1
//Thx! Bye!
//Sum: 11
//Numbers: 3

//part4:
//Extend the program so that it prints the mean of the numbers (not including
// the -1) the user has written.
//
//Sample output
//Give numbers:
//5
//2
//4
//-1
//Thx! Bye!
//Sum: 11
//Numbers: 3
//Average: 3.666666666666

//Part5:
//Extend the program so that it prints the number of even and odd numbers
// (excluding the -1).
//
//Sample output
//Give numbers:
//5
//2
//4
//-1
//Thx! Bye!
//Sum: 11
//Numbers: 3
//Average: 3.666666666666
//Even: 2
//Odd: 1
public class RepeatingBreakingRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers? ");

        int inputInInt1;
        int sum = 0;
        int currentNumber = 0;
        int count = 0;
        double average = 0.0;
        int totalEvenInputs = 0;
        int totalOddInputs = 0;

        while(true){
            inputInInt1 = Integer.valueOf(scanner.nextLine());

            if(inputInInt1 == -1){
                System.out.println("Thx!bye!");
                break;
            }
            if(inputInInt1 % 2 == 0){
                totalEvenInputs = totalEvenInputs + 1;
            }
            if(inputInInt1 % 2 == 1){
                totalOddInputs = totalOddInputs + 1;
            }

            sum = sum + inputInInt1;
            count++;
            average = 1.0 * sum/count;

        }
        System.out.println("sum:" + sum);
        System.out.println("average: " + average);
        System.out.println("total number of even inputs: " + totalEvenInputs);
        System.out.println("total number of even inputs: " + totalOddInputs);
    }
}
