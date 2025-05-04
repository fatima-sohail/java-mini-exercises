package leetcode_isThisBinaryTree;

public class IsThisBST {
    //create a wraper method to initialize the recursion with valid boundaries
    boolean checkBST(Node root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int min, int max) {
        //base case
        if(node == null){
            return true;
        }
        //node must be between min and max
        if(node.data <= min || node.data >= max){
            return false;
        }

        //check left and right subtrees with updates ranges
        //return true if both the recursive calls return true
        return isBST(node.left, min, node.data) && isBST(node.right, max, node.data);
    }
}
