package Tree;

import org.omg.PortableInterceptor.INACTIVE;

/*
 * @author: mohit5.kumar
 * @created: 20/04/19
 */
public class Insertion {
    Node node;

    Insertion() {
        node = null;
    }

    public void insertRecord(int data){
        node=insert(node,data);
    }

    public Node insert(Node node,int data){
        if(node==null){
            node = new Node(data);
            return node;
        }
        if(data<=node.data) node.left=insert(node.left,data);
        else if (data>node.data) node.right=insert(node.right,data);
        return node;
    }

    public boolean search(Node node,int data){
        if(node==null){
            return false;
        }
        if(node.data==data){
            return true;
        }
        if(data<node.data) return search(node.left,data);
        else return search(node.right,data);
    }

    public int findMin(Node node){
        Node current=node;
        while (current.left!=null) current=current.left;
        return current.data;
    }

    public int findMax(Node node){
        Node current=node;
        while (current.right!=null) current=current.right;
        return current.data;
    }

    public void inorder(Node node){
        if(node==null) return;
            inorder(node.left);
            System.out.print(node.data+" ");
            inorder(node.right);
    }

    public void preOrder(Node node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    int sum=0;
    public int height(Node node){
        if(node.left==null) return 0;
        sum=sum+1;
        height(node.left);
        return sum;
    }
    public static void main(String[] args) {
        Insertion insertion=new Insertion();
        insertion.insertRecord(50);
        insertion.insertRecord(30);
        insertion.insertRecord(20);
        insertion.insertRecord(40);
        insertion.insertRecord(70);
        insertion.insertRecord(60);
        insertion.insertRecord(80);
        System.out.println(insertion.findMin(insertion.node));
        System.out.println(insertion.findMax(insertion.node));
        System.out.println(insertion.search(insertion.node,90));
        insertion.inorder(insertion.node);
        System.out.println();
        insertion.preOrder(insertion.node);
        System.out.println();
        insertion.postOrder(insertion.node);
        System.out.println();
        System.out.println(insertion.height(insertion.node));
    }
}
