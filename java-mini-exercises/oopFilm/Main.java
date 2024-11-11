package oopFilm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);
        //ask the user how old they are in the terminal
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");

        //user input is gonna be in int
        int age = Integer.valueOf(reader.nextLine());

        //give a gap
        System.out.println();

        //if the user input age is above the age rating, you can watch this film, otherwise you can not.
        if(age >= chipmunks.ageRating()){
            System.out.println("You can watch " + chipmunks.name);
        }else{
            System.out.println("You can not watch " + chipmunks.ageRating);
        }

    }
}
