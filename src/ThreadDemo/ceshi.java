package ThreadDemo;

public class ceshi {

    public static class Main {
        public static void main(String[] args) {
            SharedObject sharedObject = new SharedObject();

            // 创建第一个线程，并修改成员变量的值
            Thread thread1 = new Thread(() -> {
                sharedObject.setValue(42);
            });

            // 创建第二个线程，并使用修改后的值
            Thread thread2 = new Thread(() -> {
                int value = sharedObject.getValue();
                System.out.println("Value: " + value); // 输出结果为 "Value: 42"
            });

            // 启动线程
            thread1.start();
            thread2.start();
        }
    }
}