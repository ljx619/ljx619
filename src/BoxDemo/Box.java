package BoxDemo;


public class Box {
    private int count;
    private boolean state = false;  //表示状态的成员变量
    public synchronized void getCount() {
        if(!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("用户拿到第" + count + "瓶奶");
        state = false;
        notifyAll();
    }

    public synchronized void setCount(int count) {
        if(state) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //没有牛奶往下执行
        this.count = count;
        System.out.println("送奶工将第" + this.count + "瓶奶放入奶箱");

        state = true;
        notifyAll();
    }
}
