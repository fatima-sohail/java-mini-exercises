//In the exercise template there is a ready-made class TelevisionProgram,
//representing a television program. The class has object variables name and
//duration, a constructor, and a few methods.
//
//Main file:
//Implement a program that begins by reading television programs from the user. When
//the user inputs an empty string as the name of the program, the program stops reading
//programs.
//
//After this the user is queried for a maximum duration. Once the maximum is given,
//the program proceeds to list all the programs whose duration is smaller or equal to
//the specified maximum duration.
//
//Sample output
//Name: Rick and Morty
//Duration: 25
//Name: Two and a Half Men
//Duration: 30
//Name: Love it or list it
//Duration: 60
//Name: House
//Duration: 60
//
//Program's maximum duration? 30
//Rick and Morty, 25 minutes
//Two and a Half Men, 30 minutes

package oopListTVprogramMaxDuration;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvProgram> programList = new ArrayList<>();

        while(true){
            System.out.print("Program Name: ");
            String inputName = scanner.nextLine();
            if(inputName.isEmpty()){
                break;
            }

            System.out.print("Program duration in minutes: ");
            int inputDuration = Integer.valueOf(scanner.nextLine());

            TvProgram obj = new TvProgram(inputName, inputDuration);
            programList.add(obj);
        }

        System.out.println("What's the maximum duration would you prefer?");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        for(TvProgram obj: programList){
            if(obj.getDuration() <= maxDuration){
                System.out.println(obj);
            }
        }
    }
}
