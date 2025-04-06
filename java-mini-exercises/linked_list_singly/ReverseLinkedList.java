package linked_list_singly;
//List: 1 2 3 4
//reverse: 4 3 2 1
public class ReverseLinkedList {
    public Node reverseList(Node head) {
        if(head == null){
            return null;
        }

        Node currentHead = head;
        //First, we use a temporary pointer p to indicate the next node of the head node.
        // And link the "next" field of head to the "next" field of p.
        while(head != null){
            Node p = head.next;
            head.next = p.next;
            p.next = currentHead;
            currentHead = p;
        }
        return currentHead;
    }

}
