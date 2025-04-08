package hashmap_phone_book;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args){
        //create a map to store name and phone nums
        HashMap<String, String> phoneBook = new HashMap<>();

        //prepare terminal to receive input
        Scanner scanner = new Scanner(System.in);

        //n is the number of entries this map takes
        int n = scanner.nextInt();

        //terminal receives n number of names and corresponding phone nums, input n=3 names
        //and phone nums
        for(int i = 0; i<n; i++){
            String name = scanner.next();
            String phoneNumber = scanner.next();
            phoneBook.put(name, phoneNumber);
        }

        //read and process the query
        while(scanner.hasNext()){
            String query = scanner.next();
            String phoneNum = phoneBook.get(query);

            if(phoneNum != null ){
                System.out.println(query + "=" + phoneNum);
            }else{
                System.out.println("Not found");
            }
        }
    }
}
