package stack.and.queue;

import java.util.EmptyStackException;

public class Stack<T> {
private  Node<T> top;
private Stack<T> prev;
Stack(){

}
Stack(Node<T> top){
    this.top=top;
}
Stack(Stack<T>prev,Node<T> top){
    this.top=top;
    this.prev=prev;
}
public void push(T data){
    Node<T> newNode=new Node<>(data);
    this.prev=new Stack<T>(this.prev,this.top);
    this.top=newNode;
}
public T pop(){
    T top=null;
    try{
        top=this.top.data;
this.top=this.prev.top;
this.prev=this.prev.prev;
}catch(NullPointerException e){
    System.out.println("stack is empty");
}
    return top;
}
public T peek() {
    T data=null;
    try {
      data=   this.top.data;
    }catch(NullPointerException e){
        System.out.println("stack is empty");
    }
    return data;
    }
    public boolean isEmpty(){
    if (this.prev==null){
        return true;
    }
    return false;
    }


}
