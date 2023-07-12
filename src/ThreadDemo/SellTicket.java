package ThreadDemo;

import java.util.concurrent.TransferQueue;

public class SellTicket implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+":"+ticket);
                ticket--;
            }
        }
    }
}
