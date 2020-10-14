package linkedlist;

public class Node <T> {
    public T data;
    public Node next;

    public Node(){
        this.data = null;
        this.next = null;
    }

    public Node(T d){
        this.data = d;
        this.next = null;
    }

    public Node(T d, Node n){
        this.data = d;
        this.next = n;
    }

}
