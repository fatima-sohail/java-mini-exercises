package oop_encapsulation_objects_in_an_instance_variable_list_messaging_service;

import java.util.Objects;

public class Message {
    String sender;
    String content;

    public Message(String sender, String content){
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return this.sender + ": " + this.content;
    }

    @Override
    public boolean equals(Object obj2){
        if(this == obj2){
            return true;
        }

        if(obj2 == null){
            return false;
        }
        if(getClass() != obj2.getClass()){
            return false;
        }

        final Message other = (Message) obj2;
        if(!Objects.equals(this.sender, other.sender)){
            return false;
        }if(!Objects.equals(this.content, other.content)){
            return false;
        }

        return true;
    }
}

