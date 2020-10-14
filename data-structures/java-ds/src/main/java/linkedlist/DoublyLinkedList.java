package linkedlist;

public class DoublyLinkedList {
    DoublyNode head;

    public DoublyLinkedList(){
        this.head = null;
    }

    public DoublyNode popLast(){
        DoublyNode currNode = this.head, prev = null;
        while (currNode.next != null){
            prev = currNode;
            currNode = currNode.next;
        }
        prev.next = null;
        return currNode;
    }

    // fix method
    public DoublyNode popFirst(){
        DoublyNode currNode = this.head;
        if (currNode != null){
            this.head = currNode.next;
            this.head.prev = null;
            return currNode;
        } else {
            return currNode;
        }
    }

    public <T> void insertLast(T data){
        DoublyNode new_element = new DoublyNode(data);
        DoublyNode currNode = this.head;

        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = new_element;
        new_element.prev = currNode;
    }

    public <T> void insertFirst(T data){
        DoublyNode new_element = new DoublyNode(data);
        new_element.next = this.head;
        new_element.prev = null;

        if (this.head != null){
            this.head.prev = new_element;
        }

        this.head = new_element;
    }

    public int size(){
        int count = 0;
        DoublyNode currNode = this.head;
        while (currNode != null){
            currNode = currNode.next;
            count ++;
        }
        return count;
    }

    public String toString(){
        String llString = "";
        DoublyNode currNode = this.head;
        llString += "" + currNode.data;
        while (currNode.next != null){
            llString += " " + currNode.next.data;
            currNode = currNode.next;
        }
        return llString;
    }

}
