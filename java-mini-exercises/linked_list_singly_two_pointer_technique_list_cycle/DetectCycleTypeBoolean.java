package linked_list_singly_two_pointer_technique_list_cycle;

//Task:
//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//use boolean method

import java.util.HashSet;

public class DetectCycleTypeBoolean {
    public boolean hasCycle(Node head) {
        //create a hashset, create a pointer/temp
        HashSet<Node> set = new HashSet<>();
        Node pointer = head;
        //as the pointer traverses across nodes, it adds nodes to the hashset:
        //hashset does not store duplicates
        //while(pointer is not null):
        while(pointer != null){
            //if the hashset already contains that pointer, it means there is a cycle in the
            //list, and tells you at which node the cycle starts
            if(set.contains(pointer)){
                System.out.println("Cycle detected");
                return true;
            }
            set.add(pointer);
            pointer = pointer.next;
        }

        //if pointer is null or node next to pointer is null(i.e tail), no cycle detected
        if(pointer == null || pointer.next == null){
            System.out.println("Cycle not detected");
            return false;
        }

        return false;

        //OR 2nd way:
        // two pointers needed, slow and fast
        // as long as slow and fast pointers do not point to the same node, there is no cycle
        // the moment these two point to the same node, there is a cycle

        //both traverse from head
//        Node slow = head;
//        Node fast = head;
//
//        while(slow != null && fast != null && fast.next != null){
//
//            // move slow pointer by 1 step, and fast pointer by 2 steps
//            slow = slow.next;
//            fast = fast.next.next;
//
//            // if slow pointer and fast pointer meet, there's a cycle
//            if (slow == fast) {
//                return true;
//            }
//
//        }
//
//        // if fast pointer reaches the end, there's no cycle
//        return false;

    }

    public static void main(String[] args){
        // Create a linked list with a cycle
        Node head = new Node(3);
        Node second = new Node(2);
        Node third = new Node(0);
        Node fourth = new Node(-4);

        // Connecting the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // This creates a cycle by pointing to the second node: see markdown file
                              //for diagram

        // Create a DetectCycleTypeBoolean object to call the method
        DetectCycleTypeBoolean list = new DetectCycleTypeBoolean();

        // Call hasCycle to check if the list has a cycle
        System.out.println(list.hasCycle(head)); // Output: true
    }

}


