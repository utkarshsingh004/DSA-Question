class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }

        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0)
            index = 0;

        if (index > size)
            return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        Node node = new Node(val);

        node.next = prev.next;
        prev.next = node;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size)
            return;

        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        if (prev.next == tail) {
            tail = prev;
        }

        prev.next = prev.next.next;

        size--;
    }
}