class MyLinkedList {

    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = new Node(-1);
        tail = head;
    }

    public int get(int index) {
        if (head == tail) return -1;
        Node tmp = head.next;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
            if (tmp == null) return -1;
        }
        return tmp.val;
    }

    public void addAtHead(int val) {
        head.next = new Node(val, head.next);
        if (head == tail) {
            tail = head.next;
        }
    }

    public void addAtTail(int val) {
        tail.next = new Node(val);
        tail = tail.next;
    }

    public void addAtIndex(int index, int val) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
            if (tmp == null) return;
        }
        tmp.next = new Node(val, tmp.next);
        if (tmp == tail) {
            tail = tmp.next;
        }
    }

    public void deleteAtIndex(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
            if (tmp == null) return;
        }
        if (tmp.next == tail) {
            tail = tmp;
        }
        if (tmp.next != null)
            tmp.next = tmp.next.next;
    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */