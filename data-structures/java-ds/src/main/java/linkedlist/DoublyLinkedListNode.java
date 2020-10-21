package linkedlist;

public class DoublyLinkedListNode<T> {
    private T data;
    private DoublyLinkedListNode<T> prev, next;

//    public <T> DoublyLinkedListNode(T d, DoublyLinkedListNode prev, DoublyLinkedListNode next){
//        this.data = d;
//        this.prev = prev;
//        this.next = next;
//    }

    @Override
    public String toString(){
        return this.data.toString();
    }

}
