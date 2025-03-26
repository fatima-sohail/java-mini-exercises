package linked_list_doubly;
//another way of removing nodes
public class RemoveDoublyLinkedList {

    Node head;
    Node tail;
    int listSize;

    public RemoveDoublyLinkedList(){
        head = new Node(-1); //acts as a pseudo head i.e head with no real data
        tail = new Node(-1); //acts as a pseudo tail i.e tail with no real data

        head.next = tail;
        tail.prev = head;

        listSize = 0;   //listSize decreases everytime a node is removed
    }

    public void deleteAtHead(int val){
        //everything that happens, happens between pseudo head and pseudo tail
        //remove head after pseudo head
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

        //incase of multiple nodes list
        head = head.next;
        head.prev = null;
        listSize--;
    }

    public void deleteAtTail(int val){
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

        listSize--;
    }

    public void delAtIndex(int index){
        //how to approach the problem:
        //handle edge cases, handle regular cases

        //case 1: if index is small or large for the list, it is out of bounds
        if(index < 0 || index >= listSize){
            return;
        }

        //everything that happens, happens between pseudo head and pseudo tail
        //remove node at current
        Node current = head.next; //traversing starts from actual head
        int count = 0; //keeps track of current's traversal till curr reaches desired index
        while(count < index){
            current = current.next;
            count++;
        }

        //remove current node by skipping over it
        //link current.prev node's next ptr to current.next node
        current.prev.next = current.next;

        //update current.next's pointer
        current.next.prev = current.prev;

        listSize--;
    }
}
