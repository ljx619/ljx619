package ThreadDemo;

public class MyThread extends Thread {
    @Override
    public void run() {
        for(int i =0;i<100;i++){
            System.out.println(getName()+":"+i);
//            try {
//                sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
