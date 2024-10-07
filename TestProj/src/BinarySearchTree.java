public class BinarySearchTree {

    Node root = null;


    public void insert(int data){
        root = insertRecord(root, data);
    }

    private Node insertRecord(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return  root;
        }

        if(data < root.data) {
            root.left = insertRecord(root.left, data);
        }
        else {
            root.right = insertRecord(root.right, data);
        }
        return  root;
    }

    public void inOrder() {
        inOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);
            System.out.println(root.data);
            inOrderTraversal(root.right);
        }
    }

    public int search(int data) {
        return searchRecord(root, data);
    }

    private int searchRecord(Node root, int data) {
        if(root== null) {
            return -1;
        }
        if(root.data == data) {
            return root.data;
        } else if (data < root.data ) {
           return searchRecord(root.left, data);
        } else  {
            return searchRecord(root.right, data);
        }
    }
}
