package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
public class LevelOrderTraversal {
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
    

    public static void displayLevelOrder(Node root){

        if(root == null){
            System.out.println();
        }
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        Node curr=root;
        while(!que.isEmpty()){
            curr = que.poll();
            System.out.print(curr.val+" ");
            if(curr.left!=null){
                que.offer(curr.left);
            }
            if(curr.right!=null){
                que.offer(curr.right);
            }
        }

    }
    public static void main(String[] args) {
        int[] nodes = {  1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };//PreOrder
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        displayLevelOrder(root);
    }
}
