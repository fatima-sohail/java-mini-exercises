/* ********************************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 ***************************************************************************************** */

public class HelloWorld {
    public static void main(String[] args) {

        // System.out.println("Hello, World");
        int x = 99;
        String word = "bottles";

        while (x > 0) {
            if (x == 1) {
                word = "bottle";
            }
            System.out.println(
                    x + " " + word + " of beer on the wall, " + x + " " + word + " of beer.\n"
                            + "Take one down and pass it around, " + (x - 1)
                            + " " + word + " of beer on the wall.");

            x--;
            System.out.println();
        }
        if (x == 0) {
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n"
                                       + "Go to the store and buy some more, 99 bottles of beer on the wall.");
        }


    }
}
