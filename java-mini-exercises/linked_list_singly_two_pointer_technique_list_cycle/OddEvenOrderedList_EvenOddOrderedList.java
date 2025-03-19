package linked_list_singly_two_pointer_technique_list_cycle;

//Task1: oddEvenList():
    //list is 1 based index
    //odd indices should come first, followed by even indices i.e
    //Input: head = [index1:1, index2:2, index3:3, index4:4, index5:5]
    //Output: [1,3,5,2,4]
//Task2: evenOddList()
    // where even indices come first, followed by odd indices
    //Input: head = [index1:1, index2:2, index3:3, index4:4, index5:5]
    //Output: [2,4,1,3,5]

public class OddEvenOrderedList_EvenOddOrderedList {

    public Node oddEvenList(Node head){
        //create 4 pointers, initiate from head
        Node oddHead = head; //points to first node
        Node evenHead = head; //points to second node

        Node oddPointer = head; //keeps track of odd indices
        Node evenPointer = head.next; //keeps track of even indices

        //each iteration moves oddPtr to next odd-indexed node and
        //evenPtr moves to next even-indexed node
            //If the last node index is odd → evenPtr.next == null, and the loop stops.
            //If the last node index is even → evenPtr == null, and the loop stops
        while(evenPointer != null && evenPointer.next != null){ //ensures odd nodes are processed first
            oddPointer.next = evenPointer.next;
            oddPointer = oddPointer.next; //move odd pointer forward

            evenPointer.next = oddPointer.next;
            evenPointer = evenPointer.next; //move even pointer forward
        }

        oddPointer.next = evenHead; //attach the last odd node to the fist even node

        return head; //return updated list
    }


    public Node evenOddList(Node head){
        Node oddHead = head.next;
        Node evenHead = head;

        Node oddPtr = head.next;
        Node evenPtr = head;

        while(evenPtr.next != null && oddPtr.next != null){
            oddPtr.next = evenPtr.next;
            oddPtr = oddPtr.next;

            evenPtr.next = oddPtr.next;
            evenPtr = evenPtr.next;
        }

        evenPtr.next = oddHead; //Attach last even node to the first odd node

        return head; //head is updated
    }
}
