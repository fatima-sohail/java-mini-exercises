package oop_encapsulation_object_distribution_of_grades_as_stars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        UserInterface userInterface = new UserInterface(register, scanner);
        userInterface.start();

//        register.addGradesBasedOnPoints(93);
//        register.addGradesBasedOnPoints(91);
//        register.addGradesBasedOnPoints(92);
//        register.addGradesBasedOnPoints(88);
//
//        System.out.println(register.averageOfGrades());
//        System.out.println();
//        System.out.println(register.averageOfPoints());
    }
}
