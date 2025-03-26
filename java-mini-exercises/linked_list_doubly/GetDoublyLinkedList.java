package linked_list_doubly;

public class GetDoublyLinkedList {
    ListNode head;
    ListNode tail;
    int listSize;

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;

        }
    }

    public GetDoublyLinkedList(){
        head = new ListNode(-1); //acts as a pseudo head i.e head with no real data
        tail = new ListNode(-1);    //acts as a pseudo tail i.e tail with no real data

        head.next = tail;
        //tail.prev = head;     //singlylinkedlist doesnt have prev ptr
        listSize = 0;   //listSize increases/decreases everytime a node is added/removed
    }

    public int get(int index) {
        if (index < 0 || index >= listSize) {
            return -1; // If index is out of bounds
        }
        ListNode current = head.next;  // Start from the first real node
        int count = 0;
        while (count < index) {
            count++;
            current = current.next;
        }
        return current.val;
    }
}
