package Tree.BinaryTree;
public class Height_of_BinaryTree {
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
    

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);

        return Math.max(l,r)+1;
    }
    public static void main(String[] args) {
        int[] nodes = {  1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };//PreOrder
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(height(root));
    }
}
