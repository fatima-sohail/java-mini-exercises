package linkedList_singly_add_remove_addAtAnyPosition_methods_valueType_String;
//another way of adding nodes
public class AddMethodsInSinglyLinkedList {
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

    public AddMethodsInSinglyLinkedList() {
        head = new ListNode(-1); //acts as a pseudo head i.e head with no real data
        tail = new ListNode(-1);    //acts as a pseudo tail i.e tail with no real data

        head.next = tail;
        //tail.prev = head;     //singlylinkedlist doesnt have prev ptr
        listSize = 0;   //listSize increases everytime a new node is added
    }

    public void addAtHead(int val){
        //everything that happens, happens between pseudo head and pseudo tail
        //add new head after pseudo head
        ListNode nn = new ListNode(val);

        //update nn's pointer
        nn.next = head.next;

        //update existing node's pointers
        head.next = nn;

        listSize++;
    }

    public void addAtTail(int val){
        //everything that happens, happens between pseudo head and pseudo tail
        //add new node before pseudo tail
        ListNode nn = new ListNode(val);

        //you need to traverse the list to reach tail unlike doubly linked list
        ListNode current = head; //start traversing from pseudo head
        while(current.next != tail){
            current = current.next;
        }

        nn.next = tail; //nn.next = c.next //cz c.next refers to tail
        current.next = nn; //insert after current node

        listSize++;
    }

    public void addAtIndex(int index, int val) {
        //how to approach the problem:
        //handle edge cases, handle regular cases

        //case 1: if index is small or large for the list, it is out of bounds
        if(index < 0 || index >= listSize){
            return;
        }
        //everything that happens, happens between pseudo head and pseudo tail
        //add new node between current and current.next node
        ListNode current = head; //traversing starts from pseudo head
        int count = 0; //keeps track of current's traversal till curr reaches desired index
        while(count < index){
            current = current.next;
            count++;
        }

        ListNode nn = new ListNode(val);
        //link new node's next ptr
        //update existing nodes next ptr
        nn.next = current.next;
        current.next = nn;

        listSize++;
    }


}
