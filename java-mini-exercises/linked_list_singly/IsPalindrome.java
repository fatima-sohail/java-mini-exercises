package linked_list_singly;

import java.util.ArrayList;

public class IsPalindrome {

    //Method 1:
    //hard method 0(n) time complexity and
    // 0(1) space complexity -- efficient for large lists
    public boolean palindrome(Node head){
        //empty list or one node list is palindrome
        if(head == null || head.next == null){
            return true;
        }

        //Step1: find the length of the list
        Node current = head;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }

        //now you know the total length, find the mid point
        //step2: find the middle of the linked list
        int midPoint = length/2;
        int count = 1; //1 based index
        current = head; //create a new pointer or reset current
        // Traverse the list until we reach the node just before the midpoint
        while(count < midPoint){ // The loop continues until count reaches the midpoint (1-based index)
            current = current.next;
            count++;
        }
        // At the end of the loop, `current` will be pointing to the node just before the midpoint
        Node midHead = current.next;

        //skip middle node for odd-length palindromes
        if(length % 2 == 1){
            midHead = midHead.next;
        }

        //break the list into two
        current.next = null;

        //step3: reverse the right half
        Node reverse = null;    //1 2 3 | 3 2 1
        while(midHead != null){
            Node nextNode = midHead.next;   //save the next node
            midHead.next = reverse;     //reverse the link
            reverse = midHead;      //move reverse pointer forward
            midHead = nextNode;     //move midheadPointer forward
        }

        midHead = reverse;  //1 2 3 | 1 2 3

        //step4: compare left and right halves
        Node leftHalfPtr = head;
        Node rightHalfPtr = midHead;
        while(rightHalfPtr != null){
            if(leftHalfPtr.val != rightHalfPtr.val){
                return false;   //not a palindrome
            }
            leftHalfPtr = leftHalfPtr.next;
            rightHalfPtr = rightHalfPtr.next;
        }

        return true;    // palindrome
    }

    //Method 2
    //easy method O(n) time but,
    // O(n) space -- inefficient for very large lists
    public boolean palindromeUsingArrayList(Node head){
        //empty list or one node list is palindrome
        if(head == null || head.next == null){
            return true;
        }

        //copy linked list into array list
        //use two pointer method to check for palindrome compare the values
        //from the beginning and end of the list, moving towards the middle.
            //if the values of front doesnt equal values of end, its not a palindrom
            //otherwise, it is a palindrome

        ArrayList<Integer> valList = new ArrayList<>();

        Node current = head;
        while(current != null){
            valList.add(current.val);
            current = current.next;
        }

        int front = 0;
        int end = valList.size() - 1;
        while(front < end){
            if(!valList.get(front). equals(valList.get(end))){
                return false;   //not a palindrome
            }
            front++;
            end--;
        }

        return true; //palindrome
    }

}
