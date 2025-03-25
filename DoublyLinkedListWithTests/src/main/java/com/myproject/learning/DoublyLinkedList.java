package com.myproject.learning;

public class DoublyLinkedList {
    ListNode head;
    ListNode tail;
    int listSize;

    public DoublyLinkedList() {
        this.head = new ListNode(-1);
        this.tail = new ListNode(-1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
        this.listSize = 0;
    }

    public int get(int index) {
        ListNode cur = getNode(index);  // Call getNode to retrieve the node at the index
        return cur == null ? -1 : cur.val;  // If the node doesn't exist, return -1
    }

    // Helper method to retrieve the node at the specified index.
    private ListNode getNode(int index) {
        // Handle invalid index
        if (index < 0) {
            return null;
        }

        // Start from the head
        ListNode current = head;
        int count = 0;

        // Traverse the list to the node at the specified index
        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        return current;  // Return the node, or null if out of bounds
    }

    public void addAtHead(int val) {
        //create a pseudo head and tail
        //everything that you add will be in between the two

        ListNode newNode = new ListNode(val);
        //case 1: list is null
        if(listSize == 0){
            newNode.next = tail;
            newNode.prev = head;
            head.next = newNode;
            tail.prev = newNode;
            return;
        }

        //case 2: when list is not null
        //add at head, after pseudo head

        //update the newNode's pointers
        newNode.next = head.next;
        newNode.prev = head;

        //update existing nodes pointers
        head.next.prev = newNode;
        head.next = newNode;

        listSize++;

    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        //create a pseudo head and tail
        //everything that you add will be in between the two


        //case 1: list is null
        if(listSize == 0){
            head.next = newNode;
            tail.prev = newNode;

            newNode.prev = head;
            newNode.next = tail;
            return;
        }

        //case 2: add at tail, before pseudo tail
        //update the newNode's pointers
        newNode.next = tail;
        newNode.prev = tail.prev;

        //update existing nodes pointers
        tail.prev.next = newNode;
        tail.prev = newNode;

        listSize++;
    }

    public void addAtIndex(int index, int val) {
        ListNode newNode = new ListNode(val);
        //you have a pseudo head and pseudo tail
        //everything that you add will be in between the two

        //case 1: list is null
        if(listSize == 0){
            head.next = newNode;
            tail.prev = newNode;

            newNode.prev = head;
            newNode.next = tail;
            return;
        }


        ListNode current = head;
        index = 0;
        int count = 0;
        while(count < index){
            count ++;
            current = current.next;
        }

        //add newNode after current
        newNode.next = current.next; //update newNode ptr
        current.next.prev = newNode; // update existing node ptr

        current.next = newNode; // update existing node ptr
        newNode.prev = current; //update newNode ptr

        listSize++;
    }

    public void deleteAtIndex(int index) {


        //case 1: list is null
        if(listSize == 0){
            return;
        }

        //you have a pseudo head and pseudo tail
        //everything that you remove will be in between the two
        //delete current node

        ListNode current = head;
        int count = 0;
        index = 0;
        while(count < index){
            count ++;
            current = current.next;
        }

        //you are at current
        //remove current by skipping over it
        current.next.prev = current.next;

        //update prev node and next node's pointers
        current.next.prev = current.prev;

        listSize--;

    }
}
