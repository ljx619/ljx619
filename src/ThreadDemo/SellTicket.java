package ThreadDemo;

import javafx.beans.binding.ObjectExpression;

import java.util.concurrent.TransferQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable{
    private int ticket = 100;
    private Object obj = new Object();
    private Lock lc = new ReentrantLock();

    @Override
    public  void run() {


        while(true){
//            lc.lock();
//            symethod();
            if (ticket > 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                System.out.println(Thread.currentThread().getName() + ":" + ticket);
                ticket--;
            }
//            lc.unlock();
        }

    }
    private  void symethod(){

    }
}
