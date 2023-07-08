package StudentManager;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updataStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);//JVM退出
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地");
        String address = sc.nextLine();

        Student st = new Student();
        st.setSid(sid);
        st.setName(name);
        st.setAge(age);
        st.setAddress(address);

        array.add(st);

        System.out.println("添加学生成功");

    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请添加信息");
            //为了不让继续运行
            return;
        }
        //表头信息
        System.out.println("学号\t姓名\t年龄\t居住地");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i).getSid() + "\t");
            System.out.print(array.get(i).getName() + "\t");
            System.out.print(array.get(i).getAge() + "岁\t");
            System.out.println(array.get(i).getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除的学生学号");
        String sid = sc.nextLine();
        for(int i = 0; i < array.size(); i++){
            if(array.get(i).getSid().equals(sid)){
                array.remove(i);
                break;
            }
        }
        System.out.println("删除成功");
    }

    public static void updataStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改学生的学号");
        String sid = sc.nextLine();

        Student st = new Student();

        int i;
        for (i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(sid)) {
                System.out.println("请输入修改学生的新姓名");
                String name = sc.nextLine();
                System.out.println("请输入修改学生的新年龄");
                String age = sc.nextLine();
                System.out.println("请输入修改学生的新居住地");
                String address = sc.nextLine();
                //array.remove(i);
                st.setSid(sid);
                st.setName(name);
                st.setAge(age);
                st.setAddress(address);
               //array.add(i, st);
                array.set(i,st);
                System.out.println("修改成功");
                break;
            }
        }
        if (i == array.size() + 1) {
            System.out.println("未找到该学号");
        }
    }

}
