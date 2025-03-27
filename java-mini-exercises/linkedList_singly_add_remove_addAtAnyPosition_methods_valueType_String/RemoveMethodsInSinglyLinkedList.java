package linkedList_singly_add_remove_addAtAnyPosition_methods_valueType_String;
//another way of removing nodes
public class RemoveMethodsInSinglyLinkedList {
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

    public RemoveMethodsInSinglyLinkedList(){
        head = new ListNode(-1); //acts as a pseudo head i.e head with no real data
        tail = new ListNode(-1);    //acts as a pseudo tail i.e tail with no real data

        head.next = tail;
        //tail.prev = head;     //singlylinkedlist doesnt have prev ptr
        listSize = 0;   //listSize decreases everytime a node is removed
    }

    public void removeAtHead(int val){
        if(head.next == tail){ //if list is empty, return
            return;
        }
        head.next = head.next.next;
        listSize--;
    }

    public void removeAtTail(int val){
        if(head.next == tail){ //if list is empty, return
            return;
        }

        ListNode current = head;
        while(current.next.next != null && current.next != tail){
            current = current.next;
        }

        current.next = tail;  // Remove the last real node
        listSize--;
    }

    public void delAtIndex(int index){
        if (index < 0 || index >= listSize) return;  // If index is out of bounds

        //everything that happens, happens between pseudo head and pseudo tail
        ListNode current = head;
        int count = 0;

        // stop at the node before the node to be removed
        while (count < index) {
            current = current.next;
            count++;
        }

        //remove node after current
        current.next = current.next.next;

        listSize--;
    }
}
