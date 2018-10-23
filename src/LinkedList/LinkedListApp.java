package LinkedList;

public class LinkedListApp {

    public static void main(String args[])
    {

        Node A= new Node(5);
        Node B= new Node(6);
        Node C = new Node(7);
        Node D = new Node (8);
        LinkedListImpl lImpl= new LinkedListImpl();
        lImpl.pushNode(A);
       // lImpl.deleteFirst();
        lImpl.addEnd(B);
        lImpl.pushNode(C);
        lImpl.addNode(B,D);
        lImpl.printLinkedList();
        lImpl.deleteAfter(C);
        lImpl.printLinkedList();
//        lImpl.deleteFirst();
//        lImpl.printLinkedList();
    }
}
