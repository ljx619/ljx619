package ydyhjl;

public abstract class yundongyuan extends person{
    public yundongyuan() {
    }

    public yundongyuan(String name, int age) {
        super(name, age);
    }

    public void study(){
        System.out.println("学习");
    }
}
