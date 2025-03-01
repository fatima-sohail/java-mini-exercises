package linkedList_singly_add_remove_addAtAnyPosition_methods_valueType_String;

public class Main {
    public static void main(String[] args){
        //if you use inbuilt methods-not asked in interview
//        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        System.out.println(linkedList);

        //use your created method
        SinglyLinkedList list = new SinglyLinkedList();
        list.addAtTail("A");
        list.printList();

        list.addAtTail("B");
        list.addAtTail("C");
        list.addAtTail("E");
        list.printList();

        //use addAtPosition()
        list.addAtPosition(3, "D");
        list.printList();

        //add at the the tail using addAtPoistion()
        list.addAtPosition(4, "F");
        list.addAtPosition(5, "F");
        list.addAtPosition(6, "G");
        list.printList();
    }

}
