/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Palendrome {
    public static void main(String[] args) {
        //input
        String input = args[0];
        //if input is palendrome, output true
        //reverse of a string is same

        int i = 0;
        int j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                System.out.println("It is not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("It is a palindrome");


    }
}
