class BinarySearchTree {
    TreeNode treeNode;
    BinarySearchTree()
    {
        treeNode=null;
    }
    void printInorder(TreeNode treeNode)
    {
        if(treeNode==null)
            return;
        printInorder(treeNode.left);
        System.out.print(treeNode.value+" ");
        printInorder(treeNode.right);
    }
    void printInorder()
    {
        printInorder(treeNode);
    }
    public static void main(String... s)
    {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.treeNode=new TreeNode(10);
        binarySearchTree.treeNode.left=new TreeNode(5);
        binarySearchTree.treeNode.right=new TreeNode(7);
        binarySearchTree.treeNode.left.left=new TreeNode(8);
        binarySearchTree.treeNode.left.right=new TreeNode(4);
        binarySearchTree.treeNode.right.left=new TreeNode(3);
        binarySearchTree.treeNode.right.right=new TreeNode(13);
        binarySearchTree.treeNode.left.left.left=new TreeNode(12);
        System.out.println("in order traversal");
        binarySearchTree.printInorder();

    }
}
