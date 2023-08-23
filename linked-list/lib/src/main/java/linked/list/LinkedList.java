package linked.list;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(T data) {
        Node<T> newNode = new <T>Node(data);
        Node current = head;
        newNode.next = current;
        head = newNode;
    }

    public boolean includes(T value) {
        Node<T> current = head;

        while (current != null) {
            if (current.data.equals(value)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public String toString() {
        Node current = head;
        String output = "";

        while (current != null) {
            output += "{" + current.data + "} -> ";
            current = current.next;
        }

        return output + "NULL";
    }

    public int length() {
        Node current = head;
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public int index(T data) {
        Node current = head;
        int index = 0;
        int counter = 0;
        while (current != null) {
            counter++;
            if (data.equals(current.data)) {
                index = counter;
            }
            current = current.next;
        }
        return index - 1;
    }

    public void remove(int index) {
        Node current = head;
        int counter = 0;

        while (current != null && counter < index) {
            current = current.next;
            counter++;
        }
    }

    public void append(T data) {
        Node<T> newNode = new <T>Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertBefore(T value, T newValue) {
        if (head.data.equals(value)) {
            Node<T> newNode = new Node<T>(newValue);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                Node<T> newNode = new Node<T>(newValue);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public void insertAfter(T value, T newValue) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                Node<T> newNode = new <T>Node(newValue);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public T getValueByReverseIndex(int reverseIndex) {
        if (head == null || reverseIndex < 0) {
            return null;
        }

        // Get the length of the linked list
        Node<T> current = head;
        int counter = 0;
        while (current != null) {
            current = current.next;
            counter++;
        }// Turn the reverse index into index
        int index = counter - reverseIndex - 1;
        if (index < 0) {
            return null;
        }

        // Use index to reach the element
        current = head;
        counter = 0;
        while (current != null) {
            if (counter == index) {
                return current.data;
            }
            current = current.next;
            counter++;
        }

        return null;
    }

}
