package demo;

import java.util.Scanner;

public class stringTest01 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        Scanner sc = new Scanner(System.in);

        for(int x = 0; x < 3;x++){ 

            System.out.println("请输入用户名：");
            String  name = sc.nextLine();
            System.out.println("请输入密码：");
            String  psd = sc.nextLine();

            if((username.equals(name)) && (password.equals(psd))){
                System.out.println("欢迎登陆!!!");
                break;
            }else {
                System.out.println("用户名或密码有误，请重新输入");
            }
        }

    }
}
