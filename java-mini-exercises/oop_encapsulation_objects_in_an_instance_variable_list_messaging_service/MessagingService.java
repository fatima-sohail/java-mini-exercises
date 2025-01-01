package oop_encapsulation_objects_in_an_instance_variable_list_messaging_service;

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messageList;

    public MessagingService(){
        messageList = new ArrayList<>();
    }

    public void add(Message message){
        if(message.getContent().length() <= 280){
            messageList.add(message);
            return;
        }else{
            System.out.println("Content is more than 280 characters");
        }
    }

    public ArrayList<Message> getMessages(){
        return this.messageList;
    }
}
