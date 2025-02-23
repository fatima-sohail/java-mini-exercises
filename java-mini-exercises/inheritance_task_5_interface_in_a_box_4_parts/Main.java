package inheritance_task_5_interface_in_a_box_4_parts;

public class Main {
    public static void main(String[] args){

        //Part 1:
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        //Part 2:
        Box box = new Box(10);

        box.addBookOrCDInList(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.addBookOrCDInList(new Book("Robert Martin", "Clean Code", 1));
        box.addBookOrCDInList(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.addBookOrCDInList(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.addBookOrCDInList(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.addBookOrCDInList(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);

    }
}
