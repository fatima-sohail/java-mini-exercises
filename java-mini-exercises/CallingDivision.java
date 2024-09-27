import java.util.Scanner;
//task 1:
//Write a method public static void division(int numerator, int denominator)
// that prints the result of the division of the numerator by the denominator.
// Keep in mind that the result of the division of the integers is an integer —
// in this case we want the result to be a floating point number.
//public static void main(String[] args) {
//    division(3, 5);
//}
//Sample output
//0.6

//Task2:
//Write a method public static void divisibleByThreeInRange(int beginning,
// int end) that prints all the numbers divisible by three in the given
// range. The numbers are to be printed in order from the smallest to the
// greatest.
// public static void main(String[] args) {
//    divisibleByThreeInRange(2, 10);
//}
//Sample output
//3
//6
//9
public class CallingDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first input: ");
        int inputInInt1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give second input: ");
        int inputInInt2 = Integer.valueOf(scanner.nextLine());
        //call the method
//        division(inputInInt1, inputInInt2);
        divisibleByThreeInRange(inputInInt1, inputInInt2);
    }

    //Task1:
//    create a division method
//    pass two inputs as parameters, divide them and store them in a variable
//    public static void division(int x, int y) {
//        int result;
//        result = 1.0 * x/y;
//        System.out.println(result);
//    }

    //Task2:using for loop and while loop
    //if beginning is <= end,
    //loop through the given range
    // inbetween the range, condition: i%3==0, print i
//    public static void divisibleByThreeInRange(int beginning, int end) {
//        if(beginning <= end){
//            for(int i = beginning; i<= end; i++){
//                if(i % 3 == 0){
//                    System.out.println(i);
//                }
//            }
//        }

//    }

    //while loop:
    //if beginning <= end, and currentNum = beginning,
    //while currentNum <= end is true, currentNum is divisible by 3, print all
    //the numbers, then increment the currentNum

    public static void divisibleByThreeInRange(int beginning, int end) {
        if(beginning <= end){
            int i = beginning;
            while(i <= end){
                if(i % 3 == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
