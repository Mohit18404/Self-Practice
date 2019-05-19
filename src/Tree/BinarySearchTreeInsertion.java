package Tree;

import java.util.Scanner;

/*
 * @author: mohit5.kumar
 * @created: 29/03/19
 */
public class BinarySearchTreeInsertion {
    public static int getHeight(Node root){
        int hight=0;

        return hight;
    }
    public static Node search(Node root, int data){
        if(root==null || root.data==data)
            return root;
        if(data<root.data)
            return search(root.left,data);
        return search(root.right,data);
    }
    public static Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }else {
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }else {
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        Node root=null;
        while (number-->0){
            int data=scanner.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
