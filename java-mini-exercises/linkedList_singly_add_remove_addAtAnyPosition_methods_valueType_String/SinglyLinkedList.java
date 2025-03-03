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

    //constructor no.2
    //when you already have a node and want to start a list from it
    public SinglyLinkedList(Node head) {
        this.head = head;

        //since there's only one node, it is also the tail
        this.tail = head;
    }

    //constructor no.3
    //when you already know both head and tail nodes
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
            head = newNode;
            tail = newNode;
            return;
        }

        // for non-empty list (constructor 2 and 3)
        tail.next = newNode;
        tail = newNode;
    }

    public void addAtHead(String val){
        //create a node to add it to the head
        //if the list is empty, set the head and tail to the newly created node
        //otherwise, if the list is not empty,
            //the current head should point to the new node
            //this makes the new node the head, so update the head to new node
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }


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
    public void addAtPosition(int position, String val){
        //case 1: check if the position of new node is invalid/out of bounds
        //position starts from 1 always
        if(position <= 0){
            return;
        }

        Node newNode = new Node(val);
        //case 2: if position of new node is at the begining, new node becomes the head
        if(position == 1){

            newNode.next = head;
            head = newNode;
            return;
        }

        Node currentNode = head;
        //case 3a: if the position of new node is anywhere in the list, traverse to the node
        //just before the desired position, we start from the first node for traversing
        //i.e currentNode = head
        //and make sure the currentNode is not null
        for(int i = 0; i < position-1 && currentNode != null; i++){
            currentNode = currentNode.next;         //its just a counter++, does not modify the node,
                                                    //since index is not used in linked list so this
                                                    //is how we go to next node
        }

        //case 3b: if you reach after the end i.e current == null, that means its invalid and you can't
        //insert the new node, so return the list as it is
        if(currentNode == null){
            return;            //this means just return the list as it is, its just an expression
        }

        //case 3c: otherwise, if currentNode is not null, do this:
        // node next to `new node` and node next to `currentNode` should refer to same node
        //since they refer to same node, node next to currentNode should refer to the newNode,
        //so update the current.next node
        //return the updated list
        newNode.next = currentNode.next;
        currentNode.next = newNode;

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
        } else {
            // else, traverse to the second last node
            Node current = head;
            while(current.next != tail){
                current = current.next; //`current.next` is just a counter to move forward
            }
            //set next to second last node to null(removes the last node/tail)
            current.next = null;
            //update the tail to the second to last node
            tail = current;

        }

    }

    public void removeFirstNode(){
        //if the list is empty, there's nothing to remove
        if(head == null){
            return;
        }
        //set head to the next node
        head = head.next;

    }

    public void deleteAtPosition(int position){
        //see if your position is invalid or out of bounds
        if(position <=0 || head == null){
            System.out.println("Position out of bounds");
            return;
        }

        //delete head
        if(position == 1){
            head = head.next;
            return;
        }

        Node current = head;

        //reach node before the desired position
        for(int i = 0; i< position-1 && current != null; i++){

            current = current.next;
        }

        //make sure you are not trying to delete a node that doesn't exist
        if(current == null || current.next == null){
            System.out.println("Position out of bounds");
            return;
        }

        //remove the node by just skipping over it.
        current.next = current.next.next;

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
