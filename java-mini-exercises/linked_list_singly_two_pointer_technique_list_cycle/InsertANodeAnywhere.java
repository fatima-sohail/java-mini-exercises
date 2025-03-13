package linked_list_singly_two_pointer_technique_list_cycle;

public class InsertANodeAnywhere {
    public Node insertNodeAnywhere(Node head, int index, int val){
        //variables:
        //previous(comes before current)
        //curren(traverses through the array)
        //index(tracks the index of current till it reaches the desired index)

        //1- desired index= 0, insert new node at the start, before the head
        if(index == 0){
            Node newHead = new Node(val);
            newHead.next = head;  //newHead points to the old head
            return newHead;        // return the newHead as the first node of the list
        }

        //2-if you want to insert a new node anywhere in the list and after the end
        //insert before current → You stop at prev
        //for traversing you need:
            //current-that moves from node to node, starts from head
            //counter to keep track of index of current till we reach desired index
            //prev-that stays a step behind current
            //both need to move a step forward
        Node current = head;
        Node prev = null;
        int count = 0;
        //keep on looping untill we reach the end of the list OR we reach the (desired) index
        while(current != null && count < index){
            prev = current;     //prev moves a step forward (to old current node)
            current = current.next; //current moves forward
            count = count + 1;  //count moves forward
        }

        Node newNode = new Node(val);
        if(count == index && current == null){ //desired index: end, insert new node at the tail
            prev.next = newNode;
            return head;
        }

        if(count == index){ //desired index: middle, insert new node anywhere b/w head and tail
             //insert a new node(23) between 11 and 9
            //3 -> 11 -> new -> 9
            //insert new node before current → Stop at prev (update prev.next)
            //OR //you can insert new node after → Stop at current (update current.next)
            //next pointer of new node should point to whatever previous was originally pointing to
            newNode.next = prev.next;       //Link new node to current (9)
            //the next pointer of prev should now point to the new node we just created
            prev.next = newNode;       //Link previous (11) to new node (23)

            return head;
        }else{
            return null; // We never reached index, meaning it's out of bounds
        }

    }
}
