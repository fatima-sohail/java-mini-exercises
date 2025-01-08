package oop_encapsulation_object_remove_a_specific_item_from_to_do_list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ToDoList class
        ToDoList taskList = new ToDoList();
        taskList.print();
        taskList.add("read the course material");
        taskList.add("watch the latest fool us");
        taskList.add("take it easy");
        taskList.print();

        System.out.println();
        taskList.remove(2);
        taskList.print();

        System.out.println();
        taskList.add("buy raisins");
        taskList.print();

        System.out.println();
        taskList.remove(1);
        taskList.remove(1);
        taskList.print();

        System.out.println();
        taskList.remove(4);

        System.out.println();
        taskList.print();

        //UserInterface class
        //since its object takes two more obj as params, first create todolist obj(created above)
        //and scanner objs
        Scanner scanner = new Scanner(System.in);
        UserInterface terminal = new UserInterface(scanner, taskList);
        terminal.start();


    }
}
