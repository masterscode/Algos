package learn;

public class Tree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        tree.transversePostOrder();



        //
//        System.out.println(factorial(5));
    }



    private void insert(int value){
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while(true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            else  {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }

    }

    private void transversePreOrder() {
        transversePreOrder(root);
    }


    private void transversePreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        transversePreOrder(root.leftChild);
        transversePreOrder(root.rightChild);
    }


    private void transversePostOrder() {
        transversePostOrder(root);
    }

    private void transversePostOrder(Node root) {
        if (root==null) {
            return;
        }

        transversePostOrder(root.leftChild);
        transversePostOrder(root.rightChild);
        System.out.println(root.value);
    }


    public static int factorial(int n){
        return n == 1 ? n :n * factorial(n -1);
    }
}
