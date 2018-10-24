package Stack;

public class StackMain {

    public static void main(String[] args) {

        StackImpl stk = new StackImpl(5);

        QueueImplStack qstk= new QueueImplStack();

//        stk.push(1);
//        stk.push(3);
//        stk.printStack();
//        stk.pop();
//        stk.printStack();
//        stk.pop();
//        stk.printStack();

        qstk.push(1);
        qstk.push(3);
        System.out.println(qstk.printStack());


    }

}
