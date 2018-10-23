package Stack;

public class StackMain {

    public static void main(String[] args) {

        StackImpl stk = new StackImpl(5);

        stk.push(1);
        stk.push(3);
        stk.printStack();
        stk.pop();
        stk.printStack();
        stk.pop();
        stk.printStack();

    }

}
