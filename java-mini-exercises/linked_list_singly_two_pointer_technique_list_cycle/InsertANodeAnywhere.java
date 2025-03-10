package linked_list_singly_two_pointer_technique_list_cycle;

public class InsertANodeAnywhere {
    public Node insertNodeAnywhere(Node head, int index, int val){
        //variables:
        //previous(comes before current)
        //curren(traverses through the array)
        //index(tracks the index of current), starts at 0.

        //1-if you want to insert a new node before the head node
        if(index == 0){
            Node newHead = new Node(val);
            newHead.next = head;  //newHead points to the old head
            return newHead;        // return the newHead as the first node of the list
        }

        //2-if you want to insert a new node anywhere in the list and after the end
        //you need traversing, stop before the current aka at prev and insert the new node,
        //for traversing you need:
            //current-that moves from node to node, starts from head
            //counter to keep track of index of current
            //prev-that stays a step behind current
            //both need to move a step forward
        Node current = head;
        Node prev = null;
        int count = 0;
        //keep on looping untill we reach the end of the list OR we reach the desired index
        while(current != null || count < index){
            prev = current;     //prev moves a step forward (to old current node)
            current = current.next; //current moves forward
            count = count + 1;  //count moves forward
        }

        //once we reach the index that we want to insert the new node
        //we need to make sure we are not


    }
}
