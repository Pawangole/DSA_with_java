package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class createBst {

    // O(logn) -> insert
    public static Node buildBST(int val, Node root) {
        if (root == null) {
            root = new Node(val);
            return root;
        } else {
            if (val < root.data) {
                // val -> left subtree
                root.left = buildBST(val, root.left);
            } else {
                // val -> right subtree
                root.right = buildBST(val, root.right);
            }
        }
        return root;
    }

    public static void preorderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void inorderTraversal(Node root) {
        if (root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void postorderTraversal(Node root) {
        if (root == null)
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static Node createTree(Node root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for Node: ");
        int val = sc.nextInt();

        while (val != -1) {
            root = buildBST(val, root);
            System.out.println("Enter the value for Node: ");
            val = sc.nextInt();
        }
        sc.close();
        return root;
    }

    public static void levelOrderTraversal(Node root) {
        if (root == null) return;

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

    public static int getMin(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public static int getMax(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static boolean searchBST(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        } else {
            if (target < root.data) {
                return searchBST(root.left, target);
            } else {
                return searchBST(root.right, target);
            }
        }
    }

    public static Node deleteFromBST(Node root, int target) {
        // Implement the deletion logic here
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = createTree(root);
        System.out.println("Printing Level Order:");
        levelOrderTraversal(root);
        System.out.println("\ninorder: ");
        inorderTraversal(root);
        System.out.println("\npreorder: ");
        preorderTraversal(root);
        System.out.println("\npostorder: ");
        postorderTraversal(root);
        System.out.println();

        // NOTE: inorder of BST is always sorted
        System.out.println("Min Element: " + getMin(root));
        System.out.println("Max Element: " + getMax(root));

        boolean searchAns = searchBST(root, 251);
        if (searchAns)
            System.out.println("Node Found");
        else
            System.out.println("Node not found");
    }
}
