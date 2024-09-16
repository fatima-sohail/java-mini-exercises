import java.util.Scanner;

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
