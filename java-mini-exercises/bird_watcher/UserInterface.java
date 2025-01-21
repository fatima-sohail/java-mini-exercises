package bird_watcher;

import java.util.Scanner;

public class UserInterface {
    //create type `scanner` and `birdDatabase` instance variable
    Scanner scanner;
    BirdDataBase birdListManager;

    //constructor, takes a scanner param and creates a new birdDataBasde
    public UserInterface(Scanner scannerr){
        scanner = scannerr;
        birdListManager = new BirdDataBase();
    }

    //main method of interacting with the terminal
    public void start(){
        //starts a while loop until user enters `quit`
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if(command.equalsIgnoreCase("quit")){  //case-insensitive
                break;
            }

    // if command is add, do the following
            if(command.equalsIgnoreCase("add")){ //case-insensitive
                //ask user to print name and create space in the terminal for user input
                System.out.print("Name: ");
                String nameInput = scanner.nextLine();

                //ask user to print its latin name, create space in the terminal for user input
                System.out.print("Latin name: ");
                String latinName = scanner.nextLine();

                //above are values of single obj, add this bird obj in the birdBase
                //syntax: birdbase.add(Bird bird);
                Bird birdObj = new Bird(nameInput, latinName);
                birdListManager.add(birdObj);
            }

            if(command.equalsIgnoreCase("observation")){
                //ask the user to print the bird and create space for user input in terminal
                System.out.print("Bird: ");
                String birdInput = scanner.nextLine();

                //check if this bird exists in the dataBase
                    // retrieves an existing Bird object from the birdbase and
                    // increment the num of observations on it
                    //print a message for updated bird info
                //else, if the bird doesnt exist, print 'Not a bird!'
                if(birdListManager.birdExists(birdInput)){
                    Bird birdObj = birdListManager.getBird(birdInput);
                    birdObj.addObservation();
                    System.out.println(birdObj + " added to the observation");
                }else{
                    System.out.println("Not a bird");
                }

            }

            //if command says `all`, print all the values that user has inputted
            if(command.equalsIgnoreCase("all")){
                birdListManager.printList();
            }

            //if command is `one`, print just the one that the user has inputted
            if(command.equalsIgnoreCase("one")){
                //ask the user the bird they want get printed
                System.out.print("Bird: ");
                String birdInput = scanner.nextLine();

                //check if this bird exists in the dataBase
                    // retrieve an existing Bird object from the birdbase and
                    //print that bird obj
                //else, if the bird doesnt exist, print 'Not a bird!'
                if(birdListManager.birdExists(birdInput)){
                    Bird birdObj = birdListManager.getBird(birdInput);
                    System.out.println(birdObj);
                }else{
                    System.out.println("Not a bird");
                }
            }

        } //loop ends

    }//start() ends

}
