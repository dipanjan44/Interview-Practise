package LinkedList;

import java.util.Iterator;

public class LinkedListImpl implements Iterable<Node> {

    Node head;


    public  void pushNode(Node newNode)
    {
        newNode.next=head;
        head=newNode;

    }

    public void addNode(Node prevNode, Node newNode)
    {
        if(prevNode.next==null)
        {
           addEnd(newNode);
        }
        else {
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    public void addEnd(Node newNode)
    {

        if (head == null)
        {
            head = newNode;
        }

        else
        {
            Node last=head;
            while(last.next != null)
            {
                last=last.next;
            }
            last.next=newNode;

        }
    }

    public void deleteEnd()
    {
        if (head.next==null)

            head=null;

        Node last=head.next; // second node
        Node oneBeforelast=head; // first node
        while (last.next != null)
        {
            oneBeforelast=last;
            last=last.next;

        }

        int r = last.data;
        oneBeforelast.next=null;

    }

    public void deleteFirst()
    {
        if(head.next==null)
        {
            head=null;
        }
        else {
            head = head.next;
        }
    }

    public void deleteAfter(Node prevNode)
    {
        if(prevNode.next==null)
        {
            System.out.println("No Nodes available after this to delete");
        }
        else {

            prevNode.next= prevNode.next.next;

        }
    }


    public void insertAtPos(int pos, int data)
    {
        Node current = head;
        int loopCounter=0;

        if(head != null & pos==0)
        {
            Node newNode= new Node(data);
            newNode.next=head;
            head=newNode;
        }


        while(loopCounter <= pos)
        {
            if (current!= null)
            {
                current=current.next;
            }
            else
            {
                System.out.println("There are no more nodes to reach that position");
            }

            loopCounter++;
        }


    }


    @Override
    public Iterator<Node> iterator() {
        return new LinkedListIterator();

    }

    public class LinkedListIterator implements Iterator<Node>
    {
        Node current;
        public LinkedListIterator()
        {
            this.current=head;
        }

        @Override
        public boolean hasNext() {

            return current != null;

        }

        @Override
        public Node next() {
            if (hasNext())
            {
                Node temp=current;
                current = current.next;
                return temp;
            }
            else
                return null;

        }
    }

    public int getNode(int k)
    {
        if (head ==null)
            return 0;

        Node current=head;

        int counter=1;

        while(counter < k)
        {
            current=current.next;
            counter=counter+1;

        }

        return current.data;

    }

    public void printLinkedListIterator(){

        LinkedListIterator lp=new LinkedListIterator();

        while(lp.hasNext())
        {
            System.out.println(lp.next().data);
        }

    }



    public void printLinkedList()
    {
        if( head ==null)
        {
            System.out.println("No nodes in the linked list to delete");
        }
        Node current=head;

        while(current !=null) {
            System.out.println(current.data);
            current = current.next;
        }
    }





}
