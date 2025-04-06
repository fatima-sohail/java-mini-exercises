package linked_list_singly;
//list: 6 1 2 3 6 4 5 6
//remove 6 from list: 1 2 3 4 5
public class RemoveValues {
    public Node removeDuplicateValues(Node head, int val){
        Node pseudoHead = new Node(0); //create a pseudoHead and set it before head
        pseudoHead.next = head;
        Node prev = pseudoHead;
        Node current = head; //set current to head

        while(current != null){
            if(current.val == val){ //if current val matches val to be removed, remove it by skiping over it
                prev.next = current.next;
            }
            if(current.val != val){ //if current val doesnt match val to be removed, go to next node
                prev = current;
            }
            current = current.next; //move current node
        }
        return pseudoHead.next; //update the head
    }
}
