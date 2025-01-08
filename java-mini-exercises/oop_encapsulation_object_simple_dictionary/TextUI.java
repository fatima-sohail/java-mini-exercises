package oop_encapsulation_object_simple_dictionary;

import java.util.Scanner;

public class TextUI {
    Scanner scanner;
    SimpleDictionary simpleDict;

    public TextUI(Scanner scannerr, SimpleDictionary simpleDictt){
        scanner = scannerr;
        simpleDict = simpleDictt;
    }

    public void start(){
        while(true){
            System.out.println("command: ");
            String userInput = scanner.nextLine();

            if(userInput.contains("end")){
                break;
            }
            if(userInput.contains("add")){
                System.out.println("word: ");
                String wordInput = scanner.nextLine();

                System.out.println("translation: ");
                String translationInput = scanner.nextLine();
                simpleDict.add(wordInput,translationInput);
            }else if(userInput.contains("search")){
                System.out.println("to be translated: ");
                String wordInput = scanner.nextLine();
                if(simpleDict.translate(wordInput)== null){
                    System.out.println(wordInput + " was not found");
                }else{
                    System.out.println("Translation: " + simpleDict.translate(wordInput));
                }
            }else{
                System.out.println("unknown command");
            }

        }
        System.out.println("bye bye");
    }
}
