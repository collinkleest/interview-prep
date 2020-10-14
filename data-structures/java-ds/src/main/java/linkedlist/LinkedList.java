package linkedlist;

public class LinkedList {
    Node head;

    public LinkedList(Node n){
        this.head = n;
    }
    public LinkedList(){
        this.head = null;
    }

    public <T> void insertLast(T data){
        Node new_element = new Node(data);
        if (this.head == null)
            this.head = new_element;
        else{
            Node trav = this.head;
            while (trav.next != null){
                trav = trav.next;
            }
            trav.next = new_element;
        }
    }

    public <T> void insertFirst(T data){
        Node new_element = new Node(data);
        new_element.next = this.head;
        this.head = new_element;
    }

    public Node pop(){
        Node currNode = this.head, prev = null;
        while (currNode.next != null){
            prev = currNode;
            currNode = currNode.next;
        }
        prev.next = null;
        return currNode;
    }

    public Node popFirst(){
        Node currNode = this.head;
        if (currNode.next == null){
            this.head = null;
            return currNode;
        } else {
            this.head = currNode.next;
            return currNode;
        }
    }

    public int size(){
        int count = 0;
        Node trav = this.head;
        while (trav != null){
            trav = trav.next;
            count++;
        }
        return count;
    }

    public <T> void deleteByKey(T key){
        Node currNode = this.head, prev = null;

        if (currNode != null && currNode.data == key){
            this.head = currNode.next;
            return;
        }

        while (currNode != null && currNode.data != key){
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null){
            prev.next = currNode.next;
        }

        if (currNode == null){
            System.out.println(String.format("Key [%s] not found", key));
        }

    }

    public void deleteByIndex(int i){
        Node currNode = this.head, prev = null;
        int count = 0;
        if (currNode != null && count == i){
            this.head = currNode.next;
            return;
        }

        while (currNode != null && count != i){
            prev = currNode;
            currNode = currNode.next;
            count ++;
        }

        if (currNode != null){
            prev.next = currNode.next;
        }

        if (currNode == null){
            System.out.println(String.format("Node was not found at [%s] index", i));
        }

    }

    public void insertAtIndex(int i, Node n){
        Node currNode = this.head, prev = null;
        int count = 0;

        if (currNode == null){
            this.head = n;
            return;
        }

        if (currNode != null && count == i){
            n.next = this.head;
            this.head = n;
            return;
        }

        while (currNode != null && count != i){
            prev = currNode;
            currNode = currNode.next;
            count ++;
        }

        if (currNode != null){
            prev.next = n;
            n.next = currNode;
            return;
        }

    }

    public Node getByIndex(int i){
        Node trav = this.head;
        int count = 0;

        if (trav != null && count == i){
            return trav;
        }

        while (trav.next != null && count != i) {
            trav = trav.next;
            count ++;
        }

        return trav;
    }

    public <T> Node getByKey(T key){
        Node trav = this.head;

        if (trav != null && trav.data == key){
            return trav;
        }

        while (trav.next != null && trav.data != key){
            trav = trav.next;
        }

        return trav;
    }

    public String toString(){
        Node trav = this.head;
        String llString = "" + this.head.data;
        while (trav.next != null){
            llString += String.format(" %s", trav.next.data);
            trav = trav.next;
        }
        return llString;
    }

}
