package oop_encapsulation_object_distribution_of_grades_as_stars;
//two essential parts of UI
    //reading the points
    //printing the grade distribution, means how many students received each possible grade,
    //represented with stars e.g
        //Suppose the user enters the following points:
        //85 (grade 5)
        //92 (grade 5)
        //73 (grade 4)
        //88 (grade 5)
        //50 (grade 3)
        //The program will print the grade distribution:
        //5: ****
        //4: *
        //3: *
        //2:
        //1:
        //0:
//contains two instance variables
    //register of type `GradeRegister`
    //scanner of type `scanner`
//constructor that instantiates/initiates the above variables by assigning them values
    //passed in as parameters(register and scanner)
//public void readPoints() asks the user to input their points, the user can keep
    //entering their points until they stop
    //each valid point is added to the register
//public static void printStars(int stars)
    //while stars<0, keep on printing stars till no stars are left(stars--)
//public void printGradeDistribution() shows how many students received each
    //grade(from 5 to 0) using stars *. Each star represents one student who received
    //that grade e.g
        //If you had 3 students get grade 5, 2 students get grade 4, and 1 student get grade 3,
        // the output would be:
        //5: ***
        //4: **
        //3: *
        //2:
        //1:
        //0:
    //the method begins by looking at the highest grade-5
    //register.numberofGrades(grade) asks the register how many students got a specific grade
    //e.g: register.numberOfGrades(5), it will tell you how many students got a grade of 5.
    //it uses this number to print stars
//public void start() activates the terminal for receiving input
    //call the method readPoints()
    //give a line gap
    //call printGradeDistribution


import java.util.Scanner;

public class UserInterface {
    GradeRegister register;
    Scanner scanner;

    public UserInterface(GradeRegister registerr, Scanner scannerr){
        register = registerr;
        scanner = scannerr;
    }

    public void readPoints(){
        while (true){
            System.out.println("points: ");
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            int points = Integer.valueOf(input);

            if(points < 0 || points > 100){
                System.out.println("impossible number");
                continue;
            }

            register.addGradesBasedOnPoints(points);
        }
    }

    public void printGradeDistribution(){
        int grade = 5;
        while(grade >= 0){
            int stars = register.numberOfGrades(grade);
            System.out.print("grade: " + grade + " ,students that received this grade: ");
            printStars(stars);
            System.out.println();
            grade--;
        }
        // After printing the grade distribution, print the averages
        printAverages();
    }

    public static void printStars(int stars){
        //stars represent students;
        while(stars > 0){
            System.out.print("*");
            stars--;
        }
    }

    public void start(){
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void printAverages(){
        double averagePoints = register.averageOfPoints();
        double averageGrades = register.averageOfGrades();

        System.out.println("The average of points: " + averagePoints);
        System.out.println("The average of grades: " + averageGrades);
    }
}
