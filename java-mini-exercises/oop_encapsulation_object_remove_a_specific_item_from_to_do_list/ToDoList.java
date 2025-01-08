package oop_encapsulation_object_remove_a_specific_item_from_to_do_list;

import java.util.ArrayList;

public class ToDoList {
    ArrayList<String> taskList;

    public ToDoList(){
        taskList = new ArrayList<>();
    }

    public void add(String task){
        taskList.add(task);
    }

    public void print(){
        //go through the list
        //print each task with a number
        //1. laundry
        //2. cooking
        int taskIndex = 1;
        for(String task: taskList){
            System.out.println(taskIndex + ". " + task);
            taskIndex ++;
        }
    }

    public void remove(int number){
        //remove the number that is associated with the task
        //removing number removed that task

        //convert to 0 based index for computer to understand i.e 1-1=0
        int index = number - 1;
        //if the index is within the valid range from 0 to taskList.size() - 1
        if(index >= 0 && index < taskList.size()){
            taskList.remove(index);
        }else{
            System.out.println("Invalid index, unable to remove item.");
        }
    }
}
