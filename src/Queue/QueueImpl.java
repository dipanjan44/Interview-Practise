package Queue;

import java.util.Arrays;
import java.util.Stack;

public class QueueImpl {


    public QueueImpl()
    {

    }


    Stack<Integer> enque = new Stack<Integer>();
    Stack<Integer> deque = new Stack<Integer>();


    public void insert(int data) {
        enque.push(data);
    }

    public int remove() {

        if (deque.isEmpty()) {
            while (!enque.isEmpty()) {
                deque.push(enque.pop());
            }
        }
        return deque.pop();

    }

    public boolean isEmptyQ() {
        return (enque.isEmpty() && deque.isEmpty());
    }

    public int size() {
        if (enque.size() == 0 && deque.size() == 0) {
            return 0;
        }

        return enque.size() + deque.size();

    }


    public String printQueue() {
        StringBuilder sb = new StringBuilder();
        if (isEmptyQ())
            return "The queue is empty";
        else {

            Object[] list1= deque.toArray();
            Object[] list2= enque.toArray();
            for(Object obj: list1)
            {
                sb.append(obj+" ");
            }

            for(Object obj: list2)
            {
                sb.append(obj+" ");
            }

        }

        return sb.toString();

    }

}
