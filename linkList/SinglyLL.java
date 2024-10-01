package linkList;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

class SinglyLL {

    // Inserts a node at the head of the linked list
    public Node insertAtHead(int value, Node head, Node tail) {
        Node newNode = new Node(value);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    // Inserts a node at the tail of the linked list
    public Node insertAtTail(int value, Node head, Node tail) {
        Node newNode = new Node(value);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return tail;
    }

    // Prints the linked list
    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Returns the length of the linked list
    public int getLength(Node head) {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    // Inserts a node at a specific position in the linked list
    public Node insertAtPosition(int position, int value, Node head, Node tail) {
        if (position < 1 || (head == null && position > 1)) {
            System.out.println("Invalid position!");
            return head;
        }

        if (position == 1) {
            head = insertAtHead(value, head, tail);
        } else {
            Node temp = head;
            int count = 1;
            while (temp != null && count < position - 1) {
                temp = temp.next;
                count++;
            }

            if (temp == null) {
                System.out.println("Position is out of bounds.");
            } else if (temp.next == null) {
                tail = insertAtTail(value, head, tail);
            } else {
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
        return head;
    }

    // Deletes a node from the linked list at a specific position
    public Node deleteNodeFromLL(int position, Node head, Node tail) {
        if (head == null) {
            System.out.println("No node to delete.");
            return head;
        }

        if (position == 1) {
            Node temp = head;
            head = head.next;
            temp.next = null;
        } else {
            Node prev = head;
            int count = 1;
            while (prev != null && count < position - 1) {
                prev = prev.next;
                count++;
            }

            if (prev == null || prev.next == null) {
                System.out.println("Position is out of bounds.");
            } else {
                Node curr = prev.next;
                prev.next = curr.next;
                if (curr == tail) {
                    tail = prev;
                }
                curr.next = null;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        Node tail = null;
        SinglyLL sol = new SinglyLL();

        // Inserting nodes at the tail
        tail = sol.insertAtTail(101, head, tail);
        tail = sol.insertAtTail(102, head, tail);
        tail = sol.insertAtTail(103, head, tail);

        // Inserting nodes at specific positions
        head = sol.insertAtPosition(1, 42, head, tail);
        head = sol.insertAtPosition(5, 57, head, tail);
        head = sol.insertAtPosition(3, 420, head, tail);

        // Printing the linked list
        sol.print(head);

        // Deleting nodes at specific positions
        head = sol.deleteNodeFromLL(1, head, tail);
        sol.print(head);
        head = sol.deleteNodeFromLL(3, head, tail);
        sol.print(head);
        head = sol.deleteNodeFromLL(4, head, tail);
        sol.print(head);
    }
}
