package stack.and.queue;

public class Queue<T> {
    private Node<T> front;
    private Node<T> back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    public boolean isEmpty() {
        if(front == null){
            return true;
        }
        return false;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }
    public T dequeue() {
        T data=null;
        try {
            data = front.data;
            if (front == back) {
                front = back = null;
            } else {
                front = front.next;
            }

        }catch(NullPointerException e){
            System.out.println("The Queue is empty");
        }


        return data;
    }

    public T peek() {
T data=null;
try{data= front.data;}catch(NullPointerException e){
    System.out.println("The Queue is empty");
}
        return data;
    }

}
