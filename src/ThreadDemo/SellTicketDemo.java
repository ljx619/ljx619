package ThreadDemo;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread th1 = new Thread(st,"窗口1");
        Thread th2 = new Thread(st,"窗口2");
        Thread th3 = new Thread(st,"窗口3");

        th1.start();
        th2.start();
        th3.start();



    }
}
