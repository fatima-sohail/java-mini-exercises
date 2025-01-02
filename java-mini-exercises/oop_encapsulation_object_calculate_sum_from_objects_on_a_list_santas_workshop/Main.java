package oop_encapsulation_object_calculate_sum_from_objects_on_a_list_santas_workshop;

public class Main {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);

        Package giftBox = new Package();
        giftBox.addGift(book);
        System.out.println(giftBox.totalWeight());

        Gift shoes = new Gift("Nike", 2);
        giftBox.addGift(shoes);
        System.out.println(giftBox.totalWeight());
    }

}
