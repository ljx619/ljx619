package ThreadDemo;


public class MyRannableDemo {
    public static void main(String[] args) {
        MyRannable mr = new MyRannable();
        Thread thread1 = new Thread(mr);
        Thread thread2 = new Thread(mr);
        Thread thread3 = new Thread(mr);
        thread3.start();
        thread1.start();
        thread2.start();


    }
}
