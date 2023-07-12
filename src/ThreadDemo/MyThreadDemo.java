package ThreadDemo;


public class MyThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.setName("高铁");
        mt2.setName("飞机");
//        mt3.setName("交通");
        Thread.currentThread().setName("交通");



        mt1.setDaemon(true);
        mt2.setDaemon(true);
//        mt3.start();
//        mt3.setDaemon(true);
//         mt3.join();
        mt1.start();
        mt2.start();


        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
