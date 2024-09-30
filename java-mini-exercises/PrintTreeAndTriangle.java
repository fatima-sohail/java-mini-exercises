//PART1: Printing stars and spaces
//Define a method called printSpaces(int number) that produces the number of spaces specified by number. The method does not print the line break.
//
//You will also have to either copy the printStars method from your previous exercise or reimplement
//it in this exercise template.
//PART2:Printing a right-leaning triangle
//Create a method called printTriangle(int size) that uses printSpaces and printStars to
// print the correct triangle. So the method call printTriangle(4) should print the following:
//   *
//  **
// ***
//****
//PART3:Printing a Christmas tree
//Define a method called christmasTree(int height) that prints the correct Christmas tree. The
// Christmas tree consists of a triangle with the specified height as well as the base. The base
// is two stars high and three stars wide, and is placed at the center of the triangle's bottom.
// The tree is to be constructed by using the methods printSpaces and printStars.
//For example, the call christmasTree(4) should print the following:
//
//Sample output
//
//   *
//  ***
// *****
//*******
//  ***
//  ***


public class PrintTreeAndTriangle {
    public static void main(String[] args) {
       //printStars(3);
      // printSpaces(4);
       printRightAngledTriangle(4);
        christmasTree(4);
    }

    public static void printStars(int number){
        int i = 0;
        while(i<number){
            System.out.print("*");
            i++;
        }
        System.out.println(""); //move to the next line after printing stars
    }


    public static void printSpaces(int number){
        int i = 0;
        while(i < number){    //loop shall run number of times
            System.out.print("."); //print a space or to see the space print dot(.)
            i++;
        }
        //no line break here
    }

    public static void printRightAngledTriangle(int size){
        //The number of dots decreases while the number of stars increases
        //as we move down the rows from the right.

        for(int row = 1; row<=size; row++){
            printSpaces(size - row);//This calculates how many dots to print before the stars.
            printStars(row);       //Print stars after the leading dots.
        }
    }

    public static void christmasTree(int height){
    //tree has two parts:
        // a base that remains the same in all trees, placed at the center of a triangles bottom
        //height that keeps changing with each tree

        //height
        for(int row = 1; row <= height; row++){
            printSpaces(height - row); //centers the stars for each row
            printStars(2*row - 1); //creates the odd-numbered stars needed for a triangular shape.

        }
        printSpaces(height - 2); //centers the base under the tree.
        printStars(3); //prints 3 stars for the 1st row of the base
        printSpaces(height - 2);
        printStars(3);

    }

}
