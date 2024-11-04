//The class SumOfArray has a method public static int sumOfNumbersInArray(int[] array).
//Complete the method so that it computes and returns the sum of the numbers in the array it
//receives as parameter.
//
//You can try out the computation of the sum with this example:
//
//int[] numbers = {5, 1, 3, 4, 2};
//sumOfNumbersInArray(numbers);
//Sample output
//15
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
        System.out.println(sumOfNumbersInArray(numbers));
    }

    public static int sumOfNumbersInArray(int[] nameDoesNotHaveToMatch){
        int sum = 0;
        int i = 0;
        while(i<nameDoesNotHaveToMatch.length){
            sum = sum + nameDoesNotHaveToMatch[i];
            i++;
        }
        return sum;
    }
}
