package BoxDemo;

public class producer implements Runnable {
    private Box b;

    public producer(Box box) {
        this.b = box;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            b.setCount(i);
        }
    }
}
