import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    
    // Method to create the tree
    public static Node createTree(Scanner sc) {
        int value = sc.nextInt();

        if (value == -1) {
            return null;
        } else {
            Node root = new Node(value);
            root.left = createTree(sc);
            root.right = createTree(sc);
            return root;
        }
    }

    // Pre-order traversal: NLR
    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // In-order traversal: LNR
    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    // Post-order traversal: LRN
    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    // Level-order traversal
    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node front = q.poll();

            if (front == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                System.out.print(front.data + " ");
                if (front.left != null) {
                    q.add(front.left);
                }
                if (front.right != null) {
                    q.add(front.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);

        // Example input: 10 50 40 -1 -1 -1 30 20 -1 -1 -1
        // Level order traversal: 
        // 10
        // 50 30
        // 40 20
        levelOrderTraversal(root);

        // Uncomment to see other traversals
        System.out.println("Pre-order traversal:");
        preOrderTraversal(root);
        System.out.println("\nIn-order traversal:");
        inOrderTraversal(root);
        System.out.println("\nPost-order traversal:");
        postOrderTraversal(root);

        sc.close();
    }
}
