package stack;

import java.util.Iterator;

/*
    @author collin kleest
    Stack follows principle last-in-first-out LIFO
 */
public class Stack<T> implements Iterable<T> {

    // doubly linked list created by java
    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    // create empty stack
    public Stack(){}

    // create stack with initial element
    public Stack(T elem){
        this.push(elem);
    }

    // push element onto stack
    public void push(T elem){
        list.addLast(elem);
    }

    // returns size of stack
    public int size(){
        return list.size();
    }

    // checks if stack is empty
    public boolean isEmpty(){
        return this.size() == 0;
    }

    // remove item from stack
    public T pop(){
        if (this.isEmpty()) throw new java.util.EmptyStackException();
        return list.removeLast();
    }

    // remove last element from stack
    public T peek(){
        if (this.isEmpty()) throw new java.util.EmptyStackException();
        return list.peekLast();
    }

    // returns an iterator to loop through stack
    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
