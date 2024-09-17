import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int inputInInt = Integer.valueOf(scanner.nextLine());
            if(inputInInt == 4){
                break;
            }
        }
        System.out.println("we are outside the loop!");
        
    }
}
