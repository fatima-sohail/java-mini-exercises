package linkedList_singly_basic_operations_stack_queue;

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
        list.addAtTail("D");
        list.printList();
    }

}
