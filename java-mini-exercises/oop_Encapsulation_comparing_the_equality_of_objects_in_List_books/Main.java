package oop_Encapsulation_comparing_the_equality_of_objects_in_List_books;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ask from user to give you books name and publication year
        //add them to an arrayList
        ArrayList<Books> bookList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Leaving space empty will terminate the program.");
        while(true){
            System.out.print("Books's name: ");
            String inputName = scanner.nextLine();

            if(inputName.isEmpty()){
                break;
            }

            System.out.print("Publication year: ");
            Integer inputYear = Integer.valueOf(scanner.nextLine());

            Books bookObj = new Books(inputName, inputYear);

            //to avoid dublication of books
            if(bookList.contains(bookObj)){
                System.out.println("This book already exists!");
            }else{
                bookList.add(bookObj);
            }

        }//loop ends

        for(Books bookObj : bookList){
            System.out.println(bookObj);
        }

        //print array size
        System.out.println("Book list size/total elements:  " + bookList.size());

    }


}
