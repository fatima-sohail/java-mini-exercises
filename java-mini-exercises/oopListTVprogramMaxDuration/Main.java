
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
