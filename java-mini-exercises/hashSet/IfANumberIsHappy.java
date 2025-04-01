package hashSet;

import java.util.HashSet;

public class IfANumberIsHappy {
    public boolean isHappy(int n) {
        //create an empty hashset that stores all the nums that we have encountered during the process
        //if the sum of squares of their digits is 1, it is a happy num, return true

        HashSet<Integer> seenSet = new HashSet<>();

        while(n != 1 && !seenSet.contains(n)){
            seenSet.add(n);

            //calculate sum od squares of digits
            n = sumOfSquaresOfDigits(n);

        }

        if(n == 1){
            return true;
        }
        return false;


    }

    //helper function
    public int sumOfSquaresOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit*lastDigit;

            n = n/10;
        }

        return sum;
    }
}
