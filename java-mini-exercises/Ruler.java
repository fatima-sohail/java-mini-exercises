/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Ruler {
    public static void main(String[] args) {
        String rulerSection1 = "1";
        String rulerSection2 = rulerSection1 + "2" + rulerSection1;
        String rulerSection3 = rulerSection2 + "3" + rulerSection2;
        String rulerSection4 = rulerSection3 + "4" + rulerSection3;

        System.out.println(rulerSection1);
        System.out.println(rulerSection2);
        System.out.println(rulerSection3);
        System.out.println(rulerSection4);
    }
}
