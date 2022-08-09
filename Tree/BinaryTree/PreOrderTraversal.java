package Tree.BinaryTree;
/**
 * InnerConstructTree
 */
public class PreOrderTraversal {
static class Node {
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
static class BinaryTree{
    static int idx=-1;
    public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newnode = new Node(nodes[idx]);
        newnode.left = buildTree(nodes);
        newnode.right = buildTree(nodes);
        return newnode;
    }
    
}




    public static void displayPreorder(Node root){
        if(root==null){
            System.out.print("-1");
            return;
        }
        System.out.print(root.val+" ");
        displayPreorder(root.left);
        displayPreorder(root.right);
    }
    public static void main(String[] args) {
        int[] nodes = {  1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };//PreOrder
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        displayPreorder(root);
    }
}
