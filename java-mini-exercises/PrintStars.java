//PART1:
// Define a method called printStars that prints the given number of stars
// and a line break.
//PART2: Printing a square
//Define a method called printSquare(int size) that prints a suitable square
// with the help of the printStars method. So the method call printSquare(4)
// results in the following output
//PART3:
//Printing a rectangle
//Write a method called printRectangle(int width, int height) that prints the
// correct rectangle by using the printStars method. So the method call
// printRectangle(17, 3) should produce the following output:
//PART4:
//Create a method called printTriangle(int size) that prints a triangle by
// using the printStars method. So the call printTriangle(4) should print
// the triangle


public class PrintStars {
    public static void main(String[] args) {
//        printStars(5);
//        printStars(3);
//        printStars(9);

//        printSquare(4);
//        printRectangle(17, 3);
        printTriangle(4);
    }

    public static void printStars(int number) {
        // you can print one star with the command
        // System.out.print("*");
        // call the print command n times
        // in the end print a line break with the command
        // System.out.println("");
        for(int i = 0; i<number; i++){
            System.out.print("*");

        }
        System.out.println("");
    }

    public static void printSquare(int size) {

            for(int iInRow = 0; iInRow < size; iInRow++){

                    printStars(size);
                }

            }

    public static void printRectangle(int width, int height) {
        for(int i=0; i<height; i++){
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for(int i = 0; i<size; i++){

        }
    }

        }






