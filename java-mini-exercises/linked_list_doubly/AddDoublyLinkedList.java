package linked_list_doubly;
//another way of adding nodes
public class AddDoublyLinkedList {
    Node head;
    Node tail;
    int listSize;

    public AddDoublyLinkedList(){
        head = new Node(-1); //acts as a pseudo head i.e head with no real data
        tail = new Node(-1); //acts as a pseudo tail i.e tail with no real data

        head.next = tail;
        tail.prev = head;

        listSize = 0;   //listSize increases everytime a new node is added
    }

    public void addAtHead(int val){
        //everything that happens, happens between pseudo head and pseudo tail
        //add new head after pseudo head
        Node nn = new Node(val);

        //update nn next and prev ptrs
        nn.prev = head;
        nn.next = head.next;

        //update existing nodes ptrs
        head.next = nn;
        head.next.prev = nn; //list: -1, 1, 2, 3, -1 // where -1 is pseudo head, -1 at the end is pseudo tail
                            // before adding:  h.n.p is 2's prev ptr while h.n refers to node 2
                            //add nn at 1
                            //output: -1, nn, 1, 2, 3, -1
        listSize++;
    }

    public void addAtTail(int val){
        //everything that happens, happens between pseudo head and pseudo tail
        //add new node before pseudo tail
        Node nn = new Node(val);

        //update nn's prev and next ptrs
        nn.next = tail;
        nn.prev = tail.prev;

        //update existing nodes ptrs
        tail.prev = nn;
        tail.prev.next = nn;  //list: -1,2,3,-1 //add 4 at the tail, before pseudo tail(-1)
                              //before adding: 3 refers to tail.prev, t.p.n refers to 3's next pointer
                            //t.p refers to a node while t.p.n refers to t.p's next pointer
                            //output: -1,2,3,4,-1
        listSize++;
    }

    public void addAtIndex(int index, int val){
        //how to approach the problem:
        //handle edge cases, handle regular cases

        //case 1: if index is small or large for the list, it is out of bounds
        if(index < 0 || index >= listSize){
            return;
        }

        //everything that happens, happens between pseudo head and pseudo tail
        //add new node between current and current.next node
        Node current = head; //traversing starts from pseudo head
        int count = 0; //keeps track of current's traversal till curr reaches desired index
        while(count < index){
            current = current.next;
            count++;
        }

        //link new node's prev and next ptrs
        //update existing nodes prev and next ptrs
        Node nn = new Node(val);
        nn.next = current.next;
        nn.prev = current;

        current.next = nn;
        current.next.prev = nn;

        listSize++;
    }
}
