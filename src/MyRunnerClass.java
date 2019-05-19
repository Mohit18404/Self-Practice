public class MyRunnerClass {

        /*public static void main(String[] args) {
            int[] a=new int[]{55,25,65,77,23,4,5,54,2,213};
            Node root=new Node(a[0],null,null);
            for(int i=1;i<a.length;i++){
                insert(root,a[i]);
            }
            inOrder(root);
            System.out.println("height is:"+getHeight(root));
        }

        public static int getHeight(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=getHeight(root.left);
            int rightHeight=getHeight(root.right);
            int currentHeight=leftHeight>rightHeight?leftHeight:rightHeight;
            currentHeight++;
            return currentHeight;
        }

        public static Node insert(Node root,int data){
            if(root==null){
                Node newNode=new Node(data,null,null);
                return newNode;
            }
            if(root.value>data){
                Node leftNode=insert(root.left,data);
                root.left=leftNode;
            }
            else if(root.value<data){
                Node rightNode=(insert(root.right,data));
                root.right=(rightNode);
            }
            return root;
        }

        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.println(root.value);
            inOrder(root.right);
        }

        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root==null) {
                return;
            }
            preOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value);

        }*/
}
