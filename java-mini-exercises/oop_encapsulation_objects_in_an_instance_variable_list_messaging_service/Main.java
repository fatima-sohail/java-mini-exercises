package oop_encapsulation_objects_in_an_instance_variable_list_messaging_service;

public class Main {
    public static void main(String[] args) {
        MessagingService service = new MessagingService();
        service.add(new Message("Alice", "Hello, this is a short message"));
        service.add(new Message("Bob", "\"This is a longer message, but still under the 280-character limit.\""));
        service.add(new Message("Charlie", "This is a message that exceeds 280 characters. "
                + "It is intentionally long to ensure that the MessagingService correctly checks the message length "
                + "and does not add it to the message list when it is too long."));

        //retrive messages from the service

    }
}
