package leetcode_BinarySearchTree;

//there are two ways to create methods:
//1. using manual way: used here
//2. using recusrsion: used in BSTrecursion

public class BinarySearchTree {
    Node root;

    public BinarySearchTree(){
        root = null;
    }

    //🌱 Insert() Intuition:
    //Start from the root.
    //
    //Compare the new value with the current node.
    //
    //If value < current.data, ❗ go left.
    //
    //If value > current.data, ❗ go right.
    //
    //Keep moving left or right until you find a null spot.
    //
    //When you find a null, insert the new node there.

    public void insert(int val){
        //if the root is null, value will become the root
        if(root == null){
            root = new Node(val);
            return;
        }
        Node current = root;
        while(true){
            if(val < current.data){
                if(current.left == null){
                    current.left = new Node(val);
                    return;
                }else{
                    current = current.left;
                }
            } else {
                if(val > current.data){
                    if(current.right == null){
                        current.right = new Node(val);
                        return;
                    }else{
                        current = current.right;
                    }
                }
            }
        }
    }


    //Intuition:
    //Start from the root.
    //
    //Compare val to the current node.
    //
    //If val == current.data, ✅ found → return true.
    //
    //If val < current.data, ❗ go left.
    //
    //If val > current.data, ❗ go right.
    //
    //If we reach a null node, it means the value does not exist → return false.

    public boolean contains(int val){
        Node current = root;
        while(current != null){
            if(val == current.data){
                return true;
            }else if(val < current.data){
                current = current.left;
            }else if (val > current.data) {
                current = current.right;
            }

        }

        return false;

    }
}
