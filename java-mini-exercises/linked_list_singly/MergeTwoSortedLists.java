package linked_list_singly;
//merge two sorted lists into one in ascending order
//list1: 1,2,4
//list2: 1,3,4
//output: 1,1,2,3,4,4
//refer to geeksForgeeks for visual explanation of the solution
public class MergeTwoSortedLists {
    public Node mergeTwoLists(Node list1, Node list2){
        //create a pseudoHead node to make merging easy
        //no need to create a separate merge list, just change the
        //pointers here and there to transform both lists into one merged list
        Node pseudoHead = new Node(-1);

        //create a pointer that traverses these lists, starting from pseudoHead
        Node current = pseudoHead;

        //while both lists are not null, samller value of the two goes first into merged list
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            } else if(list2.val <= list1.val){
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        //if either of one is longer, nodes are left unmerged, merge them:
        if(list1 != null){
            current.next = list1;
        } else if(list2 != null){
            current.next = list2;
        }

        //return the merged list starting from the actual head node i.e pseudoHead.next
        return pseudoHead.next;
    }
}
