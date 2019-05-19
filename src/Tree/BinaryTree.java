package Tree;

public class BinaryTree {
    Node root;
    BinaryTree(int data){
        root=new Node(data);
    }
    BinaryTree(){
        root=null;
    }
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=new Node(10);
        binaryTree.root.left=new Node(15);
        binaryTree.root.right=new Node(20);
        binaryTree.root.left.left=new Node(25);
        binaryTree.root.right.right=new Node(30);
        binaryTree.root.left.right=new Node(35);
        binaryTree.root.right.left=new Node(40);
    }
}
