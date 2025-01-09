import java.util.ArrayList;

public class Tree_1 {
    public static void inOrderTraversal(TreeClass A){

        //arraylist to store elements
        ArrayList<Integer> al = new ArrayList<>();

        //helper function to traverse tree INORDER
        inOrderTraversalHelper(A, al);

        //loop to print values of array
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
    }

    //helper function implementation
    public static void inOrderTraversalHelper(TreeClass node, ArrayList<Integer> A){

        //base condition for recursion
        if(node == null){
            return;
        }

        // Left
        inOrderTraversalHelper(node.left, A);

        //node
        A.add(node.data);

        //right
        inOrderTraversalHelper(node.right, A);
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