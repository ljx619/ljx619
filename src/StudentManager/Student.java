package StudentManager;

public class Student {
    //学号
    private String sid;
    //姓名
    private String name;
    //年龄
    private String age;
    //居住地
    private String address;

    //构建方法
    public Student() {
    }

    //带参方法
    public Student(String sid, String name, String age, String addness) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = addness;
    }
    public String getSid(){
        return sid;
    }
    public void setSid(String sid){
        this.sid = sid;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }


}
