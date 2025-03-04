package linkedList_singly_add_remove_addAtAnyPosition_methods_valueType_String;

public class SinglyLinkedList {
    Node head;
    Node tail;

    //constructor no.1
    //when you start with an empty list
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    // Constructor 2: Start with a list that already has a head node
    public SinglyLinkedList(Node head) {
        this.head = head;

        //since there's only one node, it is also the tail
        this.tail = head;
    }

    // Constructor 3: Start with both head and tail nodes
    public SinglyLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    //add node to end-works for all 3 constructors
    public void addAtTail(String val){
        //create a new node that you can add
        //if the list is empty, set both head and tail to this new node,
            //use return to exit the method because a node has already been added
        //otherwise-if list is not empty, the current tail should now point to this new node
        //this makes the new node the tail of the linked list, so update the tail to new node.

        // for an empty list (constructor 1)
        Node newNode = new Node(val);
        if(head == null){
            // Empty list: new node becomes both head and tail
            head = newNode;
            tail = newNode;
            return;
        }

        // for non-empty list (constructor 2 and 3) append the new node after the current tail
        tail.next = newNode;
        tail = newNode;
    }

    // Add a new node to the beginning of the list
    public void addAtHead(String val){

        Node newNode = new Node(val);
        // if the list is empty: new node becomes both head and tail
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        //otherwise, if the list is not empty,
        // Point new node to the current head, then update head
        newNode.next = head; //why not head = newNode.next?
                            //code is read from right to left
                            //evaluate right hand side: head currently points to the existing first
                            //node of the list
                            //assign the result to the left hand side: 'newNode.next' now points to the
                            // old `head`
        head = newNode;
    }

    //below method works the same incase of int type val. BUT
    //if return type is `Node` instead of `void` like below, public Node addAtPosition(int position, String val)
    //return; will be replaced by return = head; both are basically saying return the
    //list as it is.

    // Add a new node at a specific position (zero-based index/position)
    //It handles out-of-bounds checks (position < 0, and currentNode == null cases).
    //It correctly updates the tail if the node is inserted at the end.
    //It inserts at head, middle, and tail correctly.
    //It even handles empty lists (head == null) via other methods or position == 0.
    public void addAtPosition(int position, String val){

        //case 1: check if the position of new node is invalid/out of bounds
        if(position < 0){ //zero based index/position
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(val);

        //case 2: insert newNode at the head: new node becomes the head
        if(position == 0){
            newNode.next = head;
            head = newNode;
            // If the list becomes a single element
            if (head.next == null) {  // Only one node in the list
                tail = newNode;
            }
            return;
        }

        Node currentNode = head;

        //case 3a:
        // to insert new node anywhere in the list, including at tail, traverse to the node
        //just before the desired position, we start from the first node for traversing
        //i.e currentNode = head
        //and make sure the currentNode is not null
        for(int i = 0; i < position-1 && currentNode != null; i++){
            currentNode = currentNode.next;         //its acts as counter++, does not modify the node,
                                                    //since traditional index system is not used in
                                                    // linked list so this
                                                    //is how we go to next node
        }

        //case 3b:
        // if you reach after the end i.e current == null, that means its invalid and you can't
        //insert the new node, so return the list as it is
        if(currentNode == null || currentNode.next == null){
            // Position is beyond the current list size
            System.out.println("Invalid position");
            return;  //this means just return the list as it is, it's just an expression
        }

        //case 3c:
        // otherwise, if currentNode is not null, do this:
        // node next to `new node` and node next to `currentNode` should refer to same node
        //since they refer to same node, node next to currentNode should refer to the newNode,
        //so update the current.next node
        //return the updated list
        newNode.next = currentNode.next;
        currentNode.next = newNode;

        // Case 3d: If we inserted at the tail (i.e., currentNode was the last node), update the tail
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void removeLastNode(){
        //case 1: if list is empty, there is nothing to remove
        if(head == null){
            return;
        }
        //case 2: if there's only one node in the list, remove it
        if(head == tail){
            head = null;
            tail = null;
        }

        // otherwise, traverse to the second last node
            Node current = head;
            while(current.next != tail){
                current = current.next; //`current.next` is just a counter to move forward
            }

            //set next to second last node to null(removes the last node/tail)
            current.next = null;
            //update the tail to the second to last node
            tail = current;

    }

    public void removeFirstNode(){
        //if the list is empty, there's nothing to remove
        if(head == null){
            return;
        }

        //move head to the next node
        head = head.next;

    }

    // Delete a node at a specific position (zero-based index)
    //it handles Invalid positions (< 0 or empty list)
    //handles Deleting the head node
    //handles Deleting the tail node
    //handles Deleting any middle node
    //handles List with only one node
    public void deleteAtPosition(int position){
        //see if your position is invalid or out of bounds
        if(position <0 || head == null){ //zero based index/position
            System.out.println("Position out of bounds");
            return;
        }

        //if you want to delete the head node
        if(position == 0){ //zero based index
            head = head.next;
            // If the list is now empty, also update tail
            if(head == null){
                tail = null;
            }
            return;
        }

        Node current = head;

        // Traverse to the node just before the one to delete
        for(int i = 0; i< position-1 && current != null; i++){
            current = current.next;
        }

        // Check if the position is valid, i.e., we're not trying to delete a node that doesn't exist
        if(current == null || current.next == null){
            System.out.println("Position out of bounds");
            return;
        }

        //remove the node by just skipping over it.
        current.next = current.next.next;

        // If we're deleting the tail node
        if(current.next == tail){
            tail = current;
        }

    }

    //get the value at the specific index/position: zero based index
    public String get(int index){
        //check if index is out of bounds or if the list is empty
        if(index < 0){//index starts from 0, so index= 1 shall not return null
            System.out.println("position out of bounds");
            return null; //OR print: invalid index;
        }

        Node current = head;
        //traverse through the list until you reach the desired index
        for(int i = 0; i<index && current != null; i++){
            current = current.next;
        }
        //if the current is null after the loop, index is out of bounds
        if(current == null){
            return null;
        }
        //otherwise, return the value of current node at specified index;
        return current.data;

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
