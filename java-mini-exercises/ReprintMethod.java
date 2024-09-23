import java.util.Scanner;

public class ReprintMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times? ");
        int inputInInt1 = Integer.valueOf(scanner.nextLine());

        while (true){

            if(inputInInt1 > 0){
                printText();
                inputInInt1--;
            }else {
                break;
            }
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method.");
    }
}
