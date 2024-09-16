import java.util.Scanner;
//A gift is a transfer of property to another person against no compensation
// or payment. If the total value of the gifts you receive from the same donor
// in the course of 3 years is €5,000 or more, you must pay gift tax.
//
//When a gift is given by a close relative or a family member, the amount of
// gift tax is determined by the following table (source vero.fi):
//
//Value of gift	    Tax at the lower limit	  Tax rate(%) for exceeding part
//5 000 — 25,000	        100	                        8
//25 000 — 55,000	        1700	                    10
//55 000 — 200,000	        4700	                    12
//200 000 — 1,000,000	    22100	                    15
//1 000 000 — above         1,42,100	                17
//For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08),
// and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).
//
//Write a program that calculates the gift tax for a gift from a close relative
// or a family member. This is how the program should work:
public class GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of gift?");
//
        int inputInInt = Integer.valueOf(scanner.nextLine());

        int giftValue = inputInInt;
        double giftTax = 0;
        if(giftValue >=5000 && giftValue < 25000){
            giftTax = 100 + (giftValue - 5000) * 0.08;
            System.out.println(giftTax);
        }else if(giftValue >=25000 && giftValue < 55000){
            giftTax = 1700 + (giftValue - 25000) * 0.10;
            System.out.println(giftTax);
        }else if(giftValue >=55000 && giftValue < 200000){
            giftTax = 4700 + (giftValue - 55000) * 0.12;
            System.out.println(giftTax);
        }else if(giftValue >=200000 && giftValue < 1000000){
            giftTax = 22100 + (giftValue - 200000) * 0.15;
            System.out.println(giftTax);
        }else if(giftValue >=1000000){
            giftTax = 142100 + (giftValue - 1000000) * 0.17;
            System.out.println(giftTax);
        }else{
            System.out.println("No tax!");
        }
    }
}
