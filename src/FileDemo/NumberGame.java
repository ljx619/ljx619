package FileDemo;


//猜数字小游戏


import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void start(){
        System.out.println("请输入一个数字");

        Random rd = new Random();
        int number = rd.nextInt(100)+1;

        while(true) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            if (i > number) {
                System.out.println("你猜的大了");
            } else if (i < number) {
                System.out.println("你猜的小了");
            } else if (i == number) {
                System.out.println("你猜对了");
                break;
            }
        }

    }

}
