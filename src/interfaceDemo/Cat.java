package interfaceDemo;

public class Cat extends Animal implements inter {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jumping() {
        System.out.println("猫跳起来了");
    }
}
