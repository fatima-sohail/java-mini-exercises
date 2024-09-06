/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class EvenOrOdd {

    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        if (input % 2 == 0) {
            System.out.println(input + " is even");
        }
        else if (input % 2 == 1) {
            System.out.println(input + " is odd");
        }
    }
}
