package LinkedList;

public class LinkedListApp {

    public static void main(String args[])
    {

        Node A= new Node(5);
        Node B= new Node(6);
        Node C = new Node(7);
        Node D = new Node (5);
        Node E = new Node (8);
        LinkedListImpl lImpl= new LinkedListImpl();
        lImpl.addEnd(A);
       // lImpl.deleteFirst();
        lImpl.addEnd(B);
        lImpl.addEnd(C);
        lImpl.addEnd(D);
        lImpl.deleteduplicateNodes();
        lImpl.printLinkedListIterator();
        //lImpl.printLinkedList();
        //System.out.println(lImpl.getNode(2));

//        lImpl.deleteAfter(C);
//        lImpl.printLinkedList();
//        lImpl.deleteFirst();
//        lImpl.printLinkedList();
    }
}
