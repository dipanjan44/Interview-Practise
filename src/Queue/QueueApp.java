package Queue;

public class QueueApp {

    public static void main(String[] args) {
        QueueImpl q= new QueueImpl();
        //System.out.println(q.printQueue());

        q.insert(1);
        q.insert(2);

        System.out.println(q.printQueue());

        q.remove();
        System.out.println(q.printQueue());
        q.remove();
        System.out.println(q.printQueue());
    }





}
