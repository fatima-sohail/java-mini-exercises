public class Averaging {
    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);

    }

    public static int sum(int number1, int number2, int number3, int number4) {
        // you can copy your implementation of the method sum here
        int sumReseult = number1 + number2 + number3 + number4;
        return sumReseult;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        // write your code here
        // calculate the sum of the elements by calling the method sum
        double sumOfNums = sum(number1, number2, number3, number4)/4.0;
        return sumOfNums;
    }


}
