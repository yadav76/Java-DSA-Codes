import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i=0; i<size; i++) arr[i] = sc.nextInt();

        for (int x : arr) System.out.print(x+" ");
        
        // int[] arr = {4,5,2,3,9,8};
        // int length = arr.length;

        // for (int i=0; i<length; i++) {
        //     BinaryTree.addNode(arr[i]);
        // }

        // printNode(BinaryTree.root);
    }

    public static void printNode(Node root) {
        while (root != null) {
            System.out.println(root.val);
            printNode(root.left);
            printNode(root.right);
        }
    }
}

class Node{
    Node left;
    Node right;
    int val;

    public Node(int val){
        this.val = val;
        left = right = null;
    }
}

class BinaryTree{
    static Node root;

    public static void addNode(int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return;
        }

        if (root.val > val) {
            root.left = newNode;
            return;
        }

    }
}
