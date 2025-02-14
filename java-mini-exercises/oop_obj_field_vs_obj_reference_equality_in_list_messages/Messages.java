package oop_obj_field_vs_obj_reference_equality_in_list_messages;

import java.util.ArrayList;

public class Messages {
    private String name;

    public Messages(String name){
        this.name = name;
    }

    public static void main(String[] args){
        //create two messages obj
        Messages sms = new Messages("SMS");
        Messages mms = new Messages("MMS");

        //see if sms is equal to sms //prints: true, cz each are pointing to the same obj
        System.out.println(sms.equals(sms));

        //see whether sms is equal to mms //prints: false, cz each are refering to diff objs
        System.out.println(sms.equals(mms));

        //see if sms is equal to a new object with same fields
        // prints: false, cz althoug fields are identical
        //but `sms` and `new Messages("SMS")` have different memory locations
        System.out.println(sms.equals(new Messages("SMS")));

        //create an empty list and add sms objs to it, print the list size
        ArrayList<Messages> messageList = new ArrayList<>();
        if(!messageList.contains(sms)){
            messageList.add(sms);   //sms is added
        }

        if(!messageList.contains(sms)){
            messageList.add(sms);      //sms is not added again, cz it already exists in the list
        }

        if(!messageList.contains(new Messages("SMS"))){
            messageList.add(sms);   //sms is added again
        }

        if(!messageList.contains(new Messages("SMS"))){
            messageList.add(sms);   //sms is added again, cz although objs in prev. condition and
                                    //this condition have identical content but they are different
                                    //objs(refer to different memory location)
        }

        if(!messageList.contains(mms)){
            messageList.add(sms);   //sms is added again
        }

        if(!messageList.contains(mms)){
            messageList.add(sms);   //sms is added again, cz list does not contain any
                                    //mms obj, if it did, then sms won't be added in
                                    //both the if statements
        }

        System.out.println(messageList.size()); //prints: 5
    }

}
