/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class IntOp {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum = x + y;
        System.out.println("Sum is " + sum);

        int multiply = x * y;
        System.out.println("product is " + multiply);

        int division = x / y;
        System.out.println("quotient is " + division);

        int remainder = x % y;
        System.out.println("remainder is " + remainder);
    }
}
