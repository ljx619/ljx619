package HashDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args)   {
        ArrayList<Student> students = new ArrayList<>();

        Student st1 = new Student("李慧",21);
        Student st2 = new Student("李佳",22);
        Student st3 = new Student("李瑞",23);

        students.add(st1);
        students.add(st2);
        students.add(st3);



        for(Student st : students){
            System.out.println(st.getName()+","+st.getAge());
        }
    }
}
