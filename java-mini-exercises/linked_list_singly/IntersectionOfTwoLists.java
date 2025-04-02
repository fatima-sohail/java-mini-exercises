package linked_list_singly;

import java.util.HashSet;

public class IntersectionOfTwoLists {
    public Node Method1(Node headA, Node headB) {

        //start at any pointer, set it to headA
        HashSet<Node> set = new HashSet<>();
        Node pointer = headA;

        //as long as pointer is not null, keep on adding nodes to the set

        //iterate one of the lists(in this case headA)
        while(pointer != null){

            set.add(pointer);
            pointer = pointer.next;

        }

        //now, we want to detect the intersection where both pointers meet.
        //if the set contains pointerB, we have found intersection, return the intersecting node
        Node pointerB = headB;
        while(pointerB != null){
            if(set.contains(pointerB)){
                //cycle is detected, found intersection
                return pointerB;
            }

            pointerB = pointerB.next;
        }

        // if(pointerA == null || pointerB == null || pointerA.next == null || pointerB.next == null){
        //     return null;
        // }
        //otherwise return null
        return null;
    }

    public Node Method2(Node headA, Node headB){
        //use two pointer Algorithem: uses two pointers, if one pointer reaches the
        //end of its list, it jumps to the other list's head, it ensures that
        //both pointers traverse the same number of nodes by the time the meet
        //at the intersection(if it exists)
        //listA:   4 1
        //              8 4 5 //lists meet at 8
        //listb: 5 6 1

        //step1: initialize pointers
        //while both pointers are not pointing at the same node
            //step2: traverse both lists simultaneously
                //move pA and pB one step at a time
                //once pA reaches the end of its list, jump to headB
                //once pB reaches the end of its list, jump to headA
        //step3: meeting point
        //if both lists intersect, pA and pB will meet at the intersection node
        //if they don't intersect, both pointers will reach null(pA will reach the
        //end of ListB and vice versa),we return null

    Node pointerA = headA;
    Node pointerB = headB;
    while(pointerA != pointerB){
        if(pointerA == null){
            pointerA = headB;
        }else{
            pointerA = pointerA.next;
        }

        if(pointerB == null){
            pointerB = headA;
        }else{
            pointerB = pointerB.next;
        }
    }
    return pointerA;

    }

}
