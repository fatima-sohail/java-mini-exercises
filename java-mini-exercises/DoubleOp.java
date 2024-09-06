/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class DoubleOp {
    public static void main(String[] args) {
        Double x = Double.parseDouble(args[0]);
        Double y = Double.parseDouble(args[1]);

        Double sum = x + y;
        System.out.println("sum is " + sum);

        Double product = x * y;
        System.out.println("product is " + product);
    }
}
