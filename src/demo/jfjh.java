package demo;
import com.sun.deploy.security.SandboxSecurity;

import java.util.Scanner;
public class jfjh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int week = sc.nextInt();
        if (week > 7 || week < 1){
            System.out.println("输入有误");
        } else if(week == 1){
            System.out.println("减肥");
        }else if (week == 2){
            System.out.println("减肥");
        }else if (week == 3){
            System.out.println("减肥");
        }else if (week == 5) {
            System.out.println("减肥");
        }else if (week == 6) {
            System.out.println("减肥");
        }else {
            System.out.println("减肥");
        }
    }
}
