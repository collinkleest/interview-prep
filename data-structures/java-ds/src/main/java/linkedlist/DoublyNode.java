package linkedlist;

public class DoublyNode <T> {
    public T data;
    public DoublyNode<T> prev;
    public DoublyNode<T> next;

    public DoublyNode(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
