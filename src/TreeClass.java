public class TreeClass {

    //nodes to store address
    public TreeClass left;
    public TreeClass right;

    //data variable to store data of each node
    public int data;

    //constructor function to initialize tree
    TreeClass(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}