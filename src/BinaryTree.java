public class BinaryTree {
    TreeNode treeNode;
    BinaryTree()
    {
        treeNode=null;
    }
    void printPreorder(TreeNode treeNode)
    {
        if(treeNode==null)
            return;
        System.out.print(treeNode.value+" ");
        printPreorder(treeNode.left);
        printPreorder(treeNode.right);
    }
    void printPostorder(TreeNode treeNode)
    {
        if(treeNode==null)
            return;
        printPostorder(treeNode.left);
        printPostorder(treeNode.right);
        System.out.print(treeNode.value+" ");
    }
    void printInorder(TreeNode treeNode)
    {
        if(treeNode==null)
            return;
        printInorder(treeNode.left);
        System.out.print(treeNode.value+" ");
        printInorder(treeNode.right);
    }
    void printPreorder()
    {
        printPreorder(treeNode);
    }
    void printPostorder()
    {
        printPostorder(treeNode);
    }
    void printInorder()
    {
        printInorder(treeNode);
    }
    public static void main(String... s)
    {
        BinaryTree bt=new BinaryTree();
        bt.treeNode=new TreeNode(5);
        bt.treeNode.left=new TreeNode(10);
        bt.treeNode.right=new TreeNode(20);
        bt.treeNode.left.left=new TreeNode(30);
        bt.treeNode.left.right=new TreeNode(40);

        System.out.println("Preorder traversal of binary tree is ");
        bt.printPreorder();
        System.out.println("");
        System.out.print("Postorder traversal of binary tree is ");
        System.out.println("");
        bt.printPostorder();
        System.out.println("");
        System.out.print("Inorder traversal of binary tree is ");
        System.out.println("");
        bt.printInorder();
    }
}
