package oop_encapsulation_object_remove_a_specific_item_from_to_do_list;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner;
    ToDoList toDoList;

    public UserInterface(Scanner scannerr, ToDoList toDoListt){
        scanner = scannerr;
        toDoList = toDoListt;
    }

    public void start(){
        while(true){
            System.out.print("command: ");
            String input = scanner.nextLine();

            if(input.contains("stop")){
                break;
            }

            //if the command contains add,
            //ask the user "item to add"
            //once the user enters this task, the item should be added to the list
            if(input.contains("add")){
                System.out.print("To add: ");
                String inputToAdd = scanner.nextLine();
                toDoList.add(inputToAdd);
            }

            //if the command contains list,
            //print all the tasks of the todolist
            if(input.contains("list")){
                toDoList.print();
            }

            //if the command contains remove,
            //ask the user to input the id of the task to be removed
            //remove that task from the list
            if(input.contains("remove")){
                System.out.println("which one you want to remove? enter the task's id");
                int inputId = scanner.nextInt();
                scanner.nextLine(); //so that 'command' doesnt appear twice in the same line
                toDoList.remove(inputId);
            }

        }
    }

}
