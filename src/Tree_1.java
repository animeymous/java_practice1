import java.util.ArrayList;

public class Tree_1 {
    public static void inOrderTraversal(TreeClass A){
        ArrayList<Integer> al = new ArrayList<>();
        inOrderTraversalHelper(A, al);

        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
    }

    public static void inOrderTraversalHelper(TreeClass node, ArrayList<Integer> A){
        if(node == null){
            return;
        }

        inOrderTraversalHelper(node.left, A);
        A.add(node.data);
        inOrderTraversalHelper(node.right, A);
    }
}

1 2(4, 5) 3(6, 7)