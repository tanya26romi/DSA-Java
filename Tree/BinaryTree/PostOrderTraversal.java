package Tree.BinaryTree;

public class PostOrderTraversal {
static class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        this.left=null;
        this.right=null;
    }
}
static class BinaryTree{
    static int idx=-1;
    public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }

        Node newnode = new Node(nodes[idx]);
        newnode.left = buildTree(nodes);
        newnode.right = buildTree(nodes);
        return newnode;
    }
}

    public static void displayPostOrder(Node root){
        if(root==null){
            System.out.print("-1 ");
            return;
        }
        displayPostOrder(root.left);
        displayPostOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        int[] nodes = {  1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };//PreOrder
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        displayPostOrder(root);
    }
    
}
