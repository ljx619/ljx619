package demo01;


import java.util.Calendar;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //Outer.Inner oi = new Outer().new Inner();
        //oi.ceshi();
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();

        c.set(year, 2, 1);

        c.add(Calendar.DATE, -1);

        int i = c.get(Calendar.DATE);

        System.out.println(i);

    }
}
