//Define a method called greatest that takes three numbers and returns the
// greatest of them. If there are multiple greatest values, returning one of
// them is enough. Printing will take place in the main program.

public class Greatest {
    public static void main(String[] args) {
        int answer =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }

    public static int greatest(int number1, int number2, int number3) {
        // create a variable to store the value of maximum
        int max = number1;
        if(number2>max){
            return max = number2;
        }
        if(number3>max){
            return max = number3;
        }
        return max;
    }
}
