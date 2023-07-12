package BoxDemo;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();

        producer producer = new producer(box);
        Customer customer = new Customer(box);

        //
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(customer);

        t1.start();
        t2.start();

    }
}
