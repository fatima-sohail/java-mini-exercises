/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ReverseString {
    public static void main(String[] args) {
        String input = args[0];
        //let input = "Fog"
        //reverse = "gof"
        //for(let i = 0; i<input.length; i++)
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

    }
}
