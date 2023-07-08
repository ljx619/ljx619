package StudentMangerSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentMangerDemo {
    public static void main(String[] args) {
        //欢迎界面
        System.out.println("================");
        System.out.println("请输入登陆密码:");
        System.out.println("================");
        //密码
        String mypassword = "admin";
        //创建学生集合
        ArrayList<Student> stringArrayList = new ArrayList<>();
        //判断密码
        for (int x = 3; x >= 0; x--) {
            if (pwLogin(mypassword)) {
                break;
            } else if (x > 0) {
                System.out.println("密码错误，请重试!");
                System.out.println("还可以重试" + x + "次");
            } else {
                System.exit(0);
            }
        }

        while (true) {
            System.out.println("================");
            System.out.println("1.查看成绩");
            System.out.println("2.添加信息");
            System.out.println("3.删除信息");
            System.out.println("0.退出程序");
            System.out.println("================");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            switch (s) {
                case "1":
                    lookdata(stringArrayList);
                    break;
                case "2":
                    adddata(stringArrayList);
                    break;
                case "3":
                    deletedata(stringArrayList);
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("您的输入有误");
            }

        }

    }

    public static boolean pwLogin(String s) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        return s1.equals(s);

    }

    public static void lookdata(ArrayList<Student> array) {
        //输出表头信息
        System.out.println("共有" + array.size() + "个同学");
        if (array.size() == 0) {
            return;
        }
        System.out.print("姓名\t\t\t");
        System.out.print("Java\t");
        System.out.print("Python\t");
        System.out.println("总分\t");

        TreeSet<Student> ts1 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num1 = Integer.parseInt(o2.getSum()) - Integer.parseInt(o1.getSum());
                int num2 = num1 == 0 ? o2.getName().compareTo(o1.getName()) : num1;
                return num2;
            }
        });

        for (Student st : array) {
            ts1.add(st);
        }


        for (Student st : ts1) {
            System.out.print(st.getName() + "\t\t");
            System.out.print(st.getJava() + "\t\t");
            System.out.print(st.getPython() + "\t\t");
            System.out.println(st.getSum() + "\t\t");
        }
    }

    public static void adddata(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String s1 = sc.nextLine();
        System.out.println("请输入java成绩");
        String s2 = "";
        String s3 = "";
        int s21 = 0;
        int s31 = 0;
        try {
            s2 = sc.nextLine();
            s21 = Integer.parseInt(s2);
            if (s21 < 0 || s21 > 100) {
                System.out.println("请输入0-100的数值");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("java成绩请输入数字");
            return;
        }
        System.out.println("请输入python成绩");
        try {
            s3 = sc.nextLine();
            s31 = Integer.parseInt(s3);
            if (s31 < 0 || s31 > 100) {
                System.out.println("请输入0-100的数值");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("python成绩请输入数字");
            return;
        }
        Student st = new Student();

        st.setName(s1);
        st.setJava(s2);
        st.setPython(s3);
        try {
            st.setSum(String.valueOf(s21 + s31));
        } catch (NumberFormatException e) {
            System.out.println("成绩请输入数字!!!");
            return;
        }


        array.add(st);


        System.out.println("添加成功");
    }

    public static void deletedata(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要删除的学生姓名");
        String s1 = sc.nextLine();
        int i;
        for (i = 0; i < array.size(); i++) {
            if (array.get(i).getName().equals(s1)) {
                array.remove(i);
                System.out.println("删除成功");
                return;
            }

        }
        if (i == array.size()) {
            System.out.println("删除失败");
            System.out.println("未找到名为" + s1 + "的学生");
        }
    }
}
