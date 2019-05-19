package ArrayPractice.BinarySearchTree;

public class BinarySearchTreebasic {
    Node root;
    BinarySearchTreebasic(){
        root=null;
    }
    void insert(int key){
        root=insertRec(root,key);
    }
    Node insertRec(Node root,int key){
        if(root==null){
            root=new Node(key);
            //System.out.println(key);
            return root;
        }
        if(key<root.key)
            root.left=insertRec(root.left,key);
        else if(key>root.key)
            root.right=insertRec(root.right,key);
        return root;
    }
    void inorder(){
        inorderRoot(root);
    }
    void inorderRoot(Node root){
        if(root!=null){
            inorderRoot(root.left);
            System.out.println(root.key);
            inorderRoot(root.right);
        }
    }
    public Node search(Node root,int key){
        if(root==null||root.key==key)
            return root;
        if(key<root.key)
             return search(root.left,key);
        return search(root.right,key);
    }
    void deleteKey(int key){
        root = deleteRec(root, key);
    }
    int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
    Node deleteRec(Node root, int key){
        if(root==null)
            return root;
        if(key<root.key)
            root.left=deleteRec(root.left,key);
        else if(key>root.key)
            root.right=deleteRec(root.right,key);

        else {
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;

            root.key=minValue(root.right);
            root.right=deleteRec(root.right,root.key);
        }
        return root;
    }
    public static void main(String[] args) {
        BinarySearchTreebasic binarySearchTreebasic=new BinarySearchTreebasic();
        binarySearchTreebasic.insert(50);
        binarySearchTreebasic.insert(30);
        binarySearchTreebasic.insert(20);
        binarySearchTreebasic.insert(40);
        binarySearchTreebasic.insert(70);
        binarySearchTreebasic.insert(60);
        binarySearchTreebasic.insert(80);
        binarySearchTreebasic.inorder();
        System.out.println();
        Node node=binarySearchTreebasic.search(binarySearchTreebasic.root,20);
        System.out.println(node.key);
        System.out.println();
        binarySearchTreebasic.insert(90);
        binarySearchTreebasic.insert(10);
        binarySearchTreebasic.inorder();
        binarySearchTreebasic.deleteKey(70);
        System.out.println();
        binarySearchTreebasic.inorder();
    }
}
