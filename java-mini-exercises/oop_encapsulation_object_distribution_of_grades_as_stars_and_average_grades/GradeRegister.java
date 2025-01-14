package oop_encapsulation_object_distribution_of_grades_as_stars_and_average_grades;

import java.util.ArrayList;

//this class keeps track of numbers of different grades received by students
//arrayList instance variable of grades
//constructor for above variable
//public static int pointsToGrades(int points) that converts points to grades,
//passes points as a parameter.
//points < 50, grade is 0
//points < 60, grade = 1
//points < 70, grade = 2
//points < 80, grade = 3
//points < 90, grade = 4
//else grade = 5
//addGradesBasedOnPoints() takes `int points` as a parameter, adds points(that are
//already converted into grades) to gradesList
//numberOfGrades() checks how many times a certain grade appears in gradeList, it
//takes grades as a parameter and returns an int
public class GradeRegister {
    ArrayList<Integer> gradeList;
    ArrayList<Integer> pointList;

    public GradeRegister(){
        gradeList = new ArrayList<>();
        pointList = new ArrayList<>();
    }

    public int pointToGrades(int points){
        //create a variable to store grade
        int grade = 0;
        if(points < 50){
            grade = 0;
        } else if (points<60) {
            grade = 1;
        } else if (points<70) {
            grade = 2;
        } else if (points<80) {
            grade = 3;
        } else if (points<90) {
            grade = 4;
        }else {
            grade = 5;
        }
        return grade;
    }

    public void addGradesBasedOnPoints(int points){
        gradeList.add(pointToGrades(points));
        //update the points in the pointList
        pointList.add(points);
    }

    public int numberOfGrades(int grade){
        int count = 0;
        for(int received: gradeList){
            if(received == grade){
                count++;
            }
        }
        return count;
    }

    public double averageOfGrades(){

        if(gradeList.isEmpty()){
            return -1;
        }

        int sum = 0;
        int count = 0;
        for(int grade: gradeList){
            sum = sum + grade;
            count++;
        }
        double average = (double) sum/count;
        return average;
    }

    public double averageOfPoints(){
        if(pointList.isEmpty()){
            return -1;
        }

        int sum = 0;
        int count = 0;
        for(int point: pointList){
            sum = sum + point;
            count++;
        }
        double average = (double) sum/count;
        return average;
    }


}
