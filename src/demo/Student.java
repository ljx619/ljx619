package demo;
/*
    学生类
 */
public class Student {
    private int age;
    private String  name;
    public Student(){}
    public Student(String name,int age){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String  getName(){
        return name;
    }

}
