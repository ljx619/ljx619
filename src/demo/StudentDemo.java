package demo;

import java.util.ArrayList;
import java.util.Random;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student st = new Student("li",10);
        Student st2 = new Student("lil",103);
        Student st3 = new Student("li3",103);

        //添加学生对象到集合中
        arrayList.add(st);
        arrayList.add(st2);
        arrayList.add(st3);

        //遍历集合
        for(int i = 0 ; i < arrayList.size();i++){
            Student s = arrayList.get(i);
            System.out.println(s.getAge()+","+s.getName());
        }
    }
}
