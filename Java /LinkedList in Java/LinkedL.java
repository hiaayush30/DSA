class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}


public class LinkedL<T> {
    Node<T> header = null;
    Node<T> tail = null;

    void add(T data) {
        Node newNode = new Node<T>(data);
        if (header == null) {
            header = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void printList() {
        if (header == null) {
            System.out.println("List is empty");
        }
        Node<T> iterator = header;
        while (iterator != null) {
            System.out.println(iterator.data + "\t");
            iterator=iterator.next;
        }
    }
}