package Stack;

public class StackImpl {

    int top = -1;
    int[] stackArray;


    public StackImpl(int size) {
        stackArray = new int[size];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == stackArray.length - 1);
    }


    public void push(int item) {
            top++;
            stackArray[top] = item;
        }

    public int pop() {
        if (!isEmpty()) {
            int item = top;
            top--;
            return stackArray[item];
        } else {
            return 0;
        }

    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else
            return 0;
    }


    public void printStack()
    {
        int i=0;
        while (i<=top)
        {
            System.out.println(stackArray[i]);
            i++;
        }
    }


}
