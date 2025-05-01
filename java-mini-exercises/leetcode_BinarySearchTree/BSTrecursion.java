package leetcode_BinarySearchTree;
//there are two ways to create methods:
//1. using manual way: used in BinarySearchTree file
//2. using recusrsion: used here in this file

//creating methods in Node is easier, cz you dont need a helper method
//here you need a helper method in which recusrion occurs, and BTSrecursion is a wrapper class
public class BSTrecursion {
    Node root;


    //contains method
    public boolean contains(int target){
        return helperMethod_contains(root, target); //start from the root
    }

    public boolean helperMethod_contains(Node current, int target){

        if(current == null){
            return false;
        }
        if(target == current.data){
            return true;
        }
        else if(target < current.data){
            //search left subtree
            return helperMethod_contains(current.left, target);
        }
        else if(target > current.data){
            //search right subtree
            return helperMethod_contains(current.right, target);
        }

        return false;
    }



    //insert method
    public void insert(int target){
        root = helper_insert(root, target);
    }

    public Node helper_insert(Node current, int target){
        if(current == null){
            current = new Node(target);
            return current;
        }

        if(target < current.data){
            current.left = helper_insert(current.left, target);
        }
        else if(target > current.data){
            current.right = helper_insert(current.right, target);
        }

        return current;

    }


}
