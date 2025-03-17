package linked_list_singly_two_pointer_technique_list_cycle;

//find out if the list has cycle, if yes, where(at which node) does it start?
//use method that has return type  `Node`.

import java.util.HashSet;

public class DetectCycleTypeNode {
    public Node detectCycle(Node head) {
        //create a hashset, create a pointer/temp
        HashSet<Node> set = new HashSet<>();
        Node current = head;
        //as the pointer traverses across nodes, it adds nodes to the hashset:
        //hashset does not store duplicates
        //while(pointer is not null):
        while(current != null) {
            //if the hashset already contains that pointer, it means there is a cycle in the
            //list, and tells you at which node the cycle starts
            if(set.contains(current)) {
                System.out.println("Cycle detected");
                return current;
                //break;
            }

            set.add(current);
            current = current.next;
        }

        //if pointer is null or node next to pointer is null(i.e tail), no cycle detected
        if(current == null || current.next == null){
            System.out.println("No cycle detected");
            return null;
        }

        return current;
    }

    public Node detectCycleAnotherMethod(Node head){
        //detect cycle using Floyd's algorithem(slow and fast pointers)
        //if no cycle exists, return null
        //if cycle is detected, reset slow to head and move both slow and fast one step each
        //where they meet is the start of the cycle

        Node slow = head;
        Node fast = head;

        //case1: detect cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }

        // Step 2: If no cycle is found, return null
        if(fast == null || fast.next == null){
            return null;
        }

        //since cycle is detected in while loop
        // Step 3: Find the start of the cycle
        slow = head;
        while(slow != fast){ //traverse cycle till they meet
            slow = slow.next;
            fast = fast.next;
        }

       // if(slow == fast){
            return slow;  //when they meet, start of the cycle
        //}
    }

    public static void main(String[] args) {
        // Create nodes
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(0);
        Node node4 = new Node(-4);

        // Link nodes together
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create cycle (tail connects to node2)
        node4.next = node2; // see markdown file for diagram

        DetectCycleTypeNode list = new DetectCycleTypeNode();
        Node cycleStart = list.detectCycle(node1);

        if (cycleStart != null) {
            System.out.println(" -> Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println(" -> No cycle detected.");
        }
    }
}
