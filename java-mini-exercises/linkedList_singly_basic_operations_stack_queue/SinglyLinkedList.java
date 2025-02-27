package linkedList_singly_basic_operations_stack_queue;

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


    public void addAtIndex(int index, int val){
        
    }


    public void printList(){
        //Start from the head
        Node current = head;

        //traverse the list and print each node's value
        while(current!=null){
            System.out.print(current.data + "->"); // print the value and the arrow to represent the link
            current = current.next; // move to the next node
        }

        // After the loop, print "null" to indicate the end of the list
        System.out.println("null");
    }
}
