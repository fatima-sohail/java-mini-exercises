package linkedList_singly_add_remove_addAtAnyPosition_methods_valueType_String;

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }


    //get the value at the specific index/position: zero based index
    public String get(int index){

        if (head == null) {
            return null; // List is empty
        }

        Node current = head;
        int count = 0;

        // Traverse the list until reaching the index
        while (count < index && current != null) {
            current = current.next;
            count++;
        }

        // If index is out of bounds
        if (current == null) {
            return null;
        }

        return current.data; // Return value at index
    }

    //add node to end-works for all 3 constructors
    public void addAtTail(String val){
        //case1: inserting into an empty list e,g
        //list = []  // Empty list
        //list.addAtTail(1);
        //list = [1]  // Now the list has one element.
        if(head == null){
            Node newNode = new Node(val);
            head = newNode;
            return; //exit
        }

        //inserting at the end of the tail
        Node current = head;
        Node prev = null;
        //traverse till end
        while(current != null){
            prev = current;
            current = current.next;
        }

        //insert at tail
        //current is null which means we have moved passed the last node
        //since prev is a step behind current, so prev is set to last node
        //new node is added after prev node, and becomes the new tail
        //list = [1, 2, 3]  // Existing list
        //list.addAtTail(4);  // We reach the last node (3) and add 4 after it.
        //list = [1, 2, 3, 4]  // New list with 4 added at the tail
        if(current == null){
            Node newNode = new Node(val);
            prev.next = newNode;
        }


    }

    // Add a new node to the beginning of the list
    public void addAtHead(String val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }


    public void addAtIndex(int index, String val){
        //index: desired index where we want to insert a new node
        //Case 1: insert at head, index = 0
        if(index == 0){
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            return; //exit
        }

        //insert at mid or tail
        //current: traverses across the list, starts at head
        //prev: stays a step behind current
        //count: keeps track of current's movement till current reaches desired index
        //count stops when it reaches the value of index, when count = index
        Node current = head;
        Node prev = null;
        int count = 0;
        while(current != null && count < index){    //(count < index)ensures we stop
                                                    // one step before current so we can properly
                                                    // insert the new node b/w prev and curr.

           prev = current; //move prev one step forward
           current = current.next; //move current one step forward
           count = count + 1; //move count forward

        }

        //list = [1, 2, 3] // 3 nodes, indexes 0, 1, 2
        //list.addAtIndex(5, 99); // ❌ index 5 is out of bounds
        //We stop at index 3, current = 3.next, we get current = null. (current == null).
        //If current == null, it means we have moved past the last node, and we are now pointing to null.
        //Since 3 < 5, if (count < index), We return early because the index is out of bounds.
        //We tried to reach index, but current became null before reaching it.
        //This means the Index is too large (count < index).
        //Case 2: index is too large for the list
        if( current == null && count < index){
            return;
        }

        //Case 3: insert at middle, after prev and before current
        //count stops when it reaches the value of index
        //list = [1, 2, 3]  // Existing list
        //addAtIndex(2, 4), which inserts 4 at index 2 (between val 2 and 3)
        //list = [1, 2, 4, 3],  4 is added right after 2.
        if(count == index && current != null){
            Node newNode = new Node(val);
            newNode.next = current;
            prev.next = newNode;
        }

        //case 4: insert at tail
        if(count == index && current == null){ //if current reaches null, it means we have moved past the last node,
                                                //since prev is a step behind current, prev is set to last node
                                                //new node will be added after prev node, and will become new tail
                                                //list = [1, 2, 3]  // Existing list
                                                //list.addAtIndex(2, 4);  // We reach the last node (3) and add 4 after it.
                                                //list = [1, 2, 3, 4]  // New list with 4 added at the tail
            Node newNode = new Node(val);
            prev.next = newNode;
        }

    }

    public void removeLastNode(){
        if(head == null){
            return;
        }

        //if there is only one node in the list
        if(head.next == null){
            head = null;
            return;
        }

        Node current = head;
        Node prev = null;
        while(current != null){
            prev = current;
            current = current.next;
        }

        //current is the last node, prev is the second last node
        if(current != null && current.next == null) {
            prev.next = null;
        }
    }

    public void removeFirstNode(){
        //if list is empty, do nothing
        if(head == null){
            return;
        }
        //otherwise remove the head by setting head to next node
        head = head.next;

    }


    public void deleteAtIndex(int index){
        //case1: delete at head
        if(index == 0){
            head = head.next;
            return;
        }

        //case2: delete at mid/tail
        Node current = head;
        Node prev = null;
        int count = 0;
        while(current != null && count < index){//(count < index)ensures we stop
                                                // one step before current so we can properly
                                                // insert the new node b/w prev and curr.
            prev = current;
            current = current.next;
            count = 0;
        }

        //case 3:
        //If (current == null), it means we have moved past the last node,
            // and you cant delete a node that doesnt exist
        //if (count < index), index is too large e.g
            //list = [1, 2, 3] // 3 nodes, indexes 0, 1, 2
            //list.delAtIndex(4); // ❌ index 4 is out of bounds
                //Since 3 < 4, (count < index), We return early because the index is out of bounds e.g.
                //We tried to reach index, but current became null before reaching it.
                //This means the Index is too large (count < index), cant delete a node that doent exist
        if(current == null || count < index){
            return;
        }

        //delete at middle
        if(count == index && current != null && current.next != null){
            prev.next = current.next;
        }

        //delete at tail
        if(count == index && current != null && current.next == null){
            prev.next = null;
        }
    }



    public void printList(){
        //Start from the head
        Node current = head;

        //traverse the list and print each node's value
        while(current!=null){
            System.out.print(current.data + " -> "); // print the value and the arrow to represent the link
            current = current.next; // move to the next node
        }

        // After the loop, print "null" to indicate the end of the list
        System.out.println("null");
    }

}
