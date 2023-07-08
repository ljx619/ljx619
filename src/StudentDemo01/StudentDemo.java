package StudentDemo01;

import demo.ArrayDemo;

import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        Student s1 = new Student(21, "li");
        Student s2 = new Student(20, "lj");
        Student s3 = new Student(22, "loi");
        Student s4 = new Student(21, "li");


    }

}
