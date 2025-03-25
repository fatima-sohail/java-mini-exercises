package linked_list_double;

public class RemoveANode {
    Node head;
    Node tail;

    public void deleteAtHead(){
        //in case of empty list
        //in case of one node list
        //in case of multiple nodes list

        if (head == null) {  // If the list is empty, nothing to delete
            return;
        }

        if (head.next == null) {  // If there's only one node in the list
            head = null;
            tail = null;
        }

        head = head.next;  // Move head to the next node
        head.prev = null;  // Set the new head's prev to null
    }

    public void deleteAtTail(){
        if (tail == null) {  // If the list is empty, nothing to delete
            return;
        }

        if (tail.prev == null) {  // If there's only one node in the list
            head = null;
            tail = null;
        }

        //if there are multiple nodes in the list
        tail = tail.prev;
        tail.next = null;
    }



}
