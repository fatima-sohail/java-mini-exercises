package linked_list_singly;
//list: 2,3,5,6,7,9 // is the list has even length?
//output: true //cz the list has even length

//list: 2,3,4,5 // is the list has even length?
//output: false
public class IsLengthEven {
    public boolean hasEvenLength(Node head){
        //step1: find the length of the linked list
        //if the length is divisible by 2 i.e length % 2 == 0, it is even, return true
        //otherwise return false

        int length = 0;
        Node current = head; //start traversing from head node
        while(current != null){
            length++;
            current = current.next;
        }

        if(length % 2 == 0){
            return true;
        }

        return false;
    }

}
