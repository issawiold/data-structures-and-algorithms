package stack.and.queue;

public class PseudoQueue <T>{
    private Stack<T> front=new Stack<>();
    private Stack<T> end=new Stack<>();

        public void enqueue(T data) {
            front.push(data);
        }

    public T dequeue(){
        T data=null;
        try{
        while(!front.isEmpty()){
            end.push(front.pop());
        }
        data= end.pop();
        while(!end.isEmpty()){
            front.push(end.pop());
        }
    }catch(NullPointerException e){
        System.out.println("the PseudoQueue is empty");
    }
        return data;
}
}
