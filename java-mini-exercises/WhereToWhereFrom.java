import java.util.Scanner;

//Write a program which prints the integers from 1 to a number given by the user.
//Ask the user for the starting point as well.
public class WhereToWhereFrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where from? ");
        int inputInInt1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Where to? ");
        int inputInInt2 = Integer.valueOf(scanner.nextLine());

        //if input1 is smaller than input2, count upwards

            if(inputInInt1 <= inputInInt2){
                for(int i = inputInInt1; i <= inputInInt2; i++){
                System.out.println(i);
            }

        }
         //if input1 is greater than input2, count downwards
        if(inputInInt1 >= inputInInt2){
            for(int i = inputInInt1; i >= inputInInt2; i--){
                System.out.println(i);
            }

        }

    }
}
