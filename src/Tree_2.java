import java.util.ArrayList;

public class Tree_2 {
    public static void preOrderTraversal(TreeClass A){

        //arraylist to store traversed elements
        ArrayList<Integer> al = new ArrayList<>();

        //helper function which will give output for traversed elements
        preOrderTraversalHelper(A, al);

        //loop to print elements
        for(int item: al){
            System.out.print(item+" ");
        }
    }

    //helper function
    public static void preOrderTraversalHelper(TreeClass node, ArrayList<Integer> al){

        //base condition
        if(node == null){
            return;
        }

        //Node
        al.add(node.data);

        //go to left node
        preOrderTraversalHelper(node.left, al);

        //go to right node
        preOrderTraversalHelper(node.right, al);
    }
}

/*
 * Ques: Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * Approach:
 * 1: make a arraylist to store elements
 * 2. make helper function with the help of recursion technique to insert elements in array list
 * 3. print array list
 *
 * TC: O(N)
 * SC: O(N)
*/