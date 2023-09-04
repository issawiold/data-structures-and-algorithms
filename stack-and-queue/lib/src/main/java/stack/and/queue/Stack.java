package stack.and.queue;

import java.util.EmptyStackException;

public class Stack<T> {
    private Node<T> top;
    private Stack<T> prev;

    Stack() {

    }

    Stack(T top) {
        this.top = new Node<>(top);
    }

    Stack(Stack<T> prev, Node<T> top) {
        this.top = top;
        this.prev = prev;
    }

    public void push(T data) {
        if (this.prev == null) {
            this.prev = new Stack<T>( data);
        } else {
            this.prev.push(this.top.data);
        }
        this.top = new Node<>(data);
    }

    public T pop() {
        T top = null;
        try {
            top = this.top.data;
            this.top = this.prev.top;
            this.prev = this.prev.prev;
        } catch (NullPointerException e) {
            System.out.println("stack is empty");
        }
        return top;
    }

    public T peek() {
        T data = null;
        try {
            data = this.top.data;
        } catch (NullPointerException e) {
            System.out.println("stack is empty");
        }
        return data;
    }

    public boolean isEmpty() {
        return this.prev == null;
    }
}
