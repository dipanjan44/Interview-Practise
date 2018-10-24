package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueImplStack {

    Queue<Integer> primary= new LinkedList<Integer>();
    Queue<Integer> secondary =new LinkedList<Integer>();


    public void push(int data)
    {
        secondary.add(data);
        while (!primary.isEmpty())
        {
            secondary.add(primary.remove());
        }

        Queue<Integer> temp= new LinkedList<Integer>();
        temp=primary;
        primary=secondary;
        secondary=temp;

    }


    public int pop()
    {
        return primary.remove();
    }

    public String printStack()
    {
        StringBuilder sb= new StringBuilder();
        Object[] elements= primary.toArray();
        for (Object obj: elements)
        {
            sb.append(obj+ " ");
        }
        return sb.toString();
    }

}
