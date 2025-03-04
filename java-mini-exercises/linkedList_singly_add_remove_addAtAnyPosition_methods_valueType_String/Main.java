package linkedList_singly_add_remove_addAtAnyPosition_methods_valueType_String;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        //if you treat linkedList as a stack
        //by using stack inbuilt methods-not asked in interview
        System.out.println("Linked list as a stack and stack methods: ");
        LinkedList<String> stack = new LinkedList<String>();
        stack.push("A");  // Adds "A" to the top of the stack
        stack.push("B");  // Adds "B" to the top
        stack.push("C");  // Adds "C" to the top
        stack.push("D");  // Adds "D" to the top
        stack.push("F");  // Adds "F" to the top
        System.out.println(stack);  // Stack-like order: [F, D, C, B, A]

        stack.pop();  // Removes "F" (the last added element) LIFO-Last In First Out
        System.out.println(stack);  // Prints stack without "F"

        System.out.println(stack.peek()); //prints D(top of stack)
        System.out.println(stack.peekFirst()); //prints D(top of stack)
        System.out.println(stack); //Still prints: [A,B,C,D,F] because peekFirst() does not remove the element
        System.out.println();

        //use linked list as queue
        System.out.println("Linked list as a queue and queue methods: ");
        LinkedList<String> queue = new LinkedList<String>();
        queue.offer("a");  // Adds "a" to the end
        queue.offer("b");  // Adds "b" to the end
        queue.offer("c");  // Adds "c" to the end
        queue.offer("d");  // Adds "d" to the end
        queue.offer("f");  // Adds "f" to the end
        System.out.println(queue);  // Prints: [a, b, c, d, f]

        //queue.poll();  // Removes "a" (the first added element)
        //System.out.println(queue);  // Prints: [b, c, d, f]

        System.out.println(queue.peek()); // Prints: a
        System.out.println(queue.peekFirst()); // Prints: a
        System.out.println(queue); //Still prints: [a, b, c,d,f] because peekFirst() does not remove the element
        System.out.println();

        //General linked Lists methods:
        System.out.println("General linked list methods: ");

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("A"); // Adds "A" at the tail (becomes head since it's the first element)
        linkedList.add("C"); // Adds "C" at the tail
        linkedList.add("E"); // Adds "E" at the tail (now list: A -> C -> E)

        // Insert elements at specific positions
        linkedList.add(1, "B"); // Inserts "B" at index 1 (between A and C), now: A -> B -> C -> E
        linkedList.add(3, "D"); // Inserts "D" at index 3 (between C and E), now: A -> B -> C -> D -> E

        System.out.println(linkedList); // Prints: [A, B, C, D, E]

        linkedList.remove("D"); // Removes "D" from the list, now: A -> B -> C -> E
        System.out.println(linkedList); // Prints: [A, B, C, E]

        // Demonstrating peekFirst()
        linkedList.peekFirst(); // Retrieves "A" but does nothing with it (list remains unchanged)
        System.out.println(linkedList); // Prints: [A, B, C, E]

        // Using peekFirst() correctly
        System.out.println(linkedList.peekFirst()); // Prints: A (retrieves first element but doesn't remove it)
        System.out.println(linkedList); // Still prints: [A, B, C, E]

        // Using peekLast()
        System.out.println(linkedList.peekLast()); // Prints: E (retrieves last element but doesn't remove it)

        // Adding elements at the beginning and end
        linkedList.addFirst("0"); // Adds "0" at the head, now: 0 -> A -> B -> C -> E
        linkedList.addLast("g"); // Adds "g" at the tail, now: 0 -> A -> B -> C -> E -> g
        System.out.println(linkedList); // Prints: [0, A, B, C, E, g]

        // Removing first and last elements
        linkedList.removeFirst(); // Removes "0" (head), now: A -> B -> C -> E -> g
        linkedList.removeLast(); // Removes "g" (tail), now: A -> B -> C -> E
        System.out.println(linkedList); // Prints: [A, B, C, E]
        System.out.println();

        //use your own created method
        System.out.println("Customized methods of linked list: ");
        SinglyLinkedList list = new SinglyLinkedList();
        // Adding elements at the head of the list
        list.addAtHead("Alpha");  // Adds "Alpha" at the head (list: Alpha)
        list.addAtHead("Bravo");  // Adds "Bravo" at the head (list: Bravo -> Alpha)
        list.addAtHead("Charlie");  // Adds "Charlie" at the head (list: Charlie -> Bravo -> Alpha)
        list.printList();  // Output: Charlie -> Bravo -> Alpha -> null

        // Adding elements at the tail of the list
        list.addAtTail("Delta");  // Adds "Delta" at the tail (list: Charlie -> Bravo -> Alpha -> Delta)
        list.addAtTail("Echo");   // Adds "Echo" at the tail (list: Charlie -> Bravo -> Alpha -> Delta -> Echo)
        list.printList();  // Output: Charlie -> Bravo -> Alpha -> Delta -> Echo -> null

        // Inserting an element at a specific position
        list.addAtPosition(3, "Fox");  // Inserts "Fox" at position 3 (between Alpha and Delta)
        list.printList();  // Output: Charlie -> Bravo -> Alpha -> Fox -> Delta -> Echo -> null

        // Inserting more elements at specific positions
        list.addAtPosition(2, "Golf");  // Inserts "Golf" at position 2 (between Bravo and Alpha)
        list.addAtPosition(5, "Hotel"); // Inserts "Hotel" at position 5 (between Fox and Delta)
        list.printList();  // Output: Charlie -> Bravo -> Golf -> Alpha -> Fox -> Hotel -> Delta -> Echo -> null

        // Try to insert at an invalid position (too large)
        list.addAtPosition(20, "India");  // Invalid position, no change in list
        list.printList();  // Output remains: Charlie -> Bravo -> Golf -> Alpha -> Fox -> Hotel -> Delta -> Echo -> null

        //remove first and last
        list.removeFirstNode();
        list.removeLastNode();
        list.printList(); //prints: Bravo -> Golf -> Alpha -> Fox -> Hotel -> Delta -> null

        list.deleteAtPosition(3);
        list.printList(); //prints: Bravo -> Golf -> Fox -> Hotel -> Delta -> null
        System.out.println(list.get(1)); // Output:
        System.out.println(list.get(0)); // Output:
        System.out.println(list.get(5));

    }

}
