/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
//Prints a pseudo-random integer between 0 and N-1.
//  *  Illustrate an explicit type conversion (cast) from double to int.

public class RandomInt {
    public static void main(String[] args) {
        double N = Double.parseDouble(args[0]);
        //generate a random num b/w 0 and N-1
        double randomD = Math.random();
        //scale the double to the range 0(inclusive) and N-1(exclusive)
        double scaleD = randomD * N;
        //cast the scale double to an int
        int randomInt = (int) scaleD;
        //print the result
        System.out.println(randomInt);
    }
}
