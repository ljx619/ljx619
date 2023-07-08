package ydyhjl;

public abstract class jiaolian extends person{

    public jiaolian() {
    }

    public jiaolian(String name, int age) {
        super(name, age);
    }

    public void teacher(){
        System.out.println("教学");
    }
}
