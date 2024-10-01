package linkList;

class DNode {
    int data;
    DNode prev;
    DNode next;

    // Constructor
    DNode(int value) {
        this.data = value;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLL {

    // Method to insert a DNode at the head of the doubly linked list
    void insertAtHead(int value, DNode[] head, DNode[] tail) {
        if (head[0] == null && tail[0] == null) {
            DNode newDNode = new DNode(value);
            head[0] = newDNode;
            tail[0] = newDNode;
        } else {
            DNode newDNode = new DNode(value);
            newDNode.next = head[0];
            head[0].prev = newDNode;
            head[0] = newDNode;
        }
    }

    // Method to print the linked list
    void print(DNode head) {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Method to print the linked list in reverse order
    void printReverse(DNode tail) {
        DNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    // Method to insert a DNode at the tail of the doubly linked list
    void insertAtTail(int value, DNode[] head, DNode[] tail) {
        if (head[0] == null && tail[0] == null) {
            DNode newDNode = new DNode(value);
            head[0] = newDNode;
            tail[0] = newDNode;
        } else {
            DNode newDNode = new DNode(value);
            tail[0].next = newDNode;
            newDNode.prev = tail[0];
            tail[0] = newDNode;
        }
    }

    // Method to get the length of the linked list
    int getLength(DNode head) {
        DNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Method to insert a DNode at a specific position in the doubly linked list
    void insertAtPosition(int position, int value, DNode[] head, DNode[] tail) {
        int len = getLength(head[0]);
        if (position == 1) {
            insertAtHead(value, head, tail);
        } else if (position == len + 1) {
            insertAtTail(value, head, tail);
        } else {
            DNode temp = head[0];
            for (int i = 0; i < position - 2; i++) {
                temp = temp.next;
            }
            DNode newDNode = new DNode(value);
            DNode forward = temp.next;
            newDNode.prev = temp;
            newDNode.next = forward;
            temp.next = newDNode;
            forward.prev = newDNode;
        }
    }

    // Method to search for an element in the linked list
    boolean searchElement(DNode head, int target) {
        DNode temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Method to delete a DNode from a specific position in the doubly linked list
    void deleteFromPosition(int position, DNode[] head, DNode[] tail) {
        int length = getLength(head[0]);

        if (head[0] == null && tail[0] == null) {
            System.out.println("No DNodes to delete");
        } else if (head[0] == tail[0]) {
            head[0] = null;
            tail[0] = null;
        } else if (position == 1) {
            DNode temp = head[0];
            head[0] = head[0].next;
            if (head[0] != null) {
                head[0].prev = null;
            }
            temp.next = null;
        } else if (length == position) {
            DNode temp = tail[0];
            tail[0] = tail[0].prev;
            if (tail[0] != null) {
                tail[0].next = null;
            }
            temp.prev = null;
        } else {
            DNode backward = head[0];
            for (int i = 0; i < position - 2; i++) {
                backward = backward.next;
            }
            DNode curr = backward.next;
            DNode forward = curr.next;
            backward.next = forward;
            if (forward != null) {
                forward.prev = backward;
            }
            curr.prev = null;
            curr.next = null;
        }
    }

    public static void main(String[] args) {
        DNode[] head = {null};
        DNode[] tail = {null};
        DoublyLL dll = new DoublyLL();

        dll.insertAtTail(10, head, tail);
        dll.insertAtTail(20, head, tail);
        dll.insertAtTail(30, head, tail);
        dll.insertAtPosition(4, 420, head, tail);
        dll.print(head[0]);
        dll.deleteFromPosition(4, head, tail);
        dll.print(head[0]);
    }
}
