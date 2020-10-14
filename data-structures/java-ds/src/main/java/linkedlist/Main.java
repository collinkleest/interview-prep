package linkedlist;

public class Main {
    public static void main(String[] args) {
        Node headNode = new Node(1);
        LinkedList linkedList = new LinkedList(headNode);
        linkedList.insertLast(2);
        linkedList.insertLast(20);
        linkedList.insertLast(22);
        linkedList.deleteByKey(1);
        linkedList.deleteByIndex(8);
        linkedList.insertAtIndex(0, new Node(3));
        System.out.println(String.format("Get by index: %s", linkedList.getByIndex(1).data));
        System.out.println(String.format("Get by key: %s", linkedList.getByKey(22).data));
        System.out.println(String.format("LinkedList Size: %s", linkedList.size()));
        System.out.println(String.format("LinkedList: %s", linkedList.toString()));

        System.out.println("---NEW LINKED LIST STUFF---");
        LinkedList ll = new LinkedList();
        ll.insertAtIndex(2, new Node(2));
        ll.insertAtIndex(0, new Node(3));
        ll.insertAtIndex(1, new Node(4));
        ll.insertFirst(5);
        System.out.println(ll.pop().data);
        System.out.println(ll.popFirst().data);
        System.out.println("NEW LINKED LIST: " + ll.toString());

        System.out.println("---DOUBLY LINKED LIST STUFF---");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(3);
        doublyLinkedList.insertFirst(5);
        doublyLinkedList.insertFirst(7);
        doublyLinkedList.insertLast(8);
        System.out.println(doublyLinkedList.popLast().data);
        System.out.println(doublyLinkedList.toString());
        System.out.println(String.format("Size = %s", doublyLinkedList.size()));

    }
}
