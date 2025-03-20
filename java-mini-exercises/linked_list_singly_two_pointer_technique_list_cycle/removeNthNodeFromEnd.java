package linked_list_singly_two_pointer_technique_list_cycle;

public class removeNthNodeFromEnd {
    public Node removeNthNodeFromTheEnd(Node head, int n){
        //create a pointer to traverse the list
        Node pointer = head;
        //you cant traverse linked list from tail to head, its only goes forward
        //calculate the length of the array using while loop
        int length = 0;
        while(pointer != null){
            length++;
            pointer = pointer.next;
        }
        //after getting to know the length:
        //codition 1: if you need to remove a node from head,
        //OR if the list has one node, remove it
        if(n == length){
            return head.next;
        }
        //condition 2: stop just before the node that needs to be removed and remove it
        //before that, reset the pointer to head again/ create a new pointer
        Node pointer2 = head;
        int targetIndexFromHead = length-n;
        int count = 1;

        while(count < targetIndexFromHead-1 ){
            pointer = pointer.next;
        }
        //now you are there, remove the node by skipping over it
        pointer.next = pointer.next.next;
        //return the updated list
        return head;
    }

}
