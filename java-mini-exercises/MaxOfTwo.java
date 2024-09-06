/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class MaxOfTwo {
    public static void main(String[] args) {
        int input1 = Integer.parseInt(args[0]);
        int input2 = Integer.parseInt(args[1]);

        if (input1 > input2) {
            System.out.println(input1 + " input1 is greater");
        }
        else if (input2 > input1) {
            System.out.println(input2 + " input2 is greater");
        }
    }
}
