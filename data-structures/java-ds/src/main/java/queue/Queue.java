package queue;

import java.util.Iterator;

public class Queue<T>  implements Iterable<T>{

    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    public Queue(){}

    public Queue(T elem){
        this.offer(elem);
    }

    public int size(){
        return list.size();
    }

    public T peek(){
        if (this.isEmpty()) throw new RuntimeException("Queue is Empty");
        return this.list.peekFirst();
    }

    public T poll(){
        if (this.isEmpty()) throw new RuntimeException("Queue is Empty");
        return this.list.removeFirst();
    }

    // check if queue is empty
    public boolean isEmpty(){
        return this.size() == 0;
    }

    // add item to the back of queue
    public void offer(T elem){
        this.list.addLast(elem);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
