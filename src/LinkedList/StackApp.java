package LinkedList;

public class StackApp {

    public static void main(String[] args) {

        StackImpl stk= new StackImpl();

        //System.out.println(stk.printStack());

        stk.push(1);
        stk.push(2);

        System.out.println(stk.printStack());

        stk.pop();
        System.out.println(stk.printStack());
    }
}
