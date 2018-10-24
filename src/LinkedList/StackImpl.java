package LinkedList;

public class StackImpl {

    Node head;

    public StackImpl()
    {
        this.head=null;
    }

    public void push(int data)
    {
        Node newNode= new Node(data);

        if (head == null)
        {
            head=newNode;
        }

        Node start= head;

        while(start.next!=null)
        {
            start=start.next;
        }

        start.next=newNode;
        newNode.next=null;

    }

    public int pop()
    {
        if (head==null)
        {
            return -1;
        }

        Node slow=head;
        Node current=head.next;

        while(current.next!=null)
        {
            slow=slow.next;
            current=current.next;
        }
        int s=current.data;
        slow.next=null;

      return s;

    }

    public boolean isEmpty()
    {
        return (head==null);
    }


    public String printStack()
    {
        StringBuilder sb= new StringBuilder();
        if (isEmpty())
        {
            return "Stack is empty";
        }

        Node current=head;

        while(current!=null)
        {
            sb.append(Integer.toString(current.data)+ " ");
            current=current.next;

        }

        return sb.toString();
    }

}
