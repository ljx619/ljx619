package interfaceDemo;

public class Dog extends Animal implements inter {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jumping() {
        System.out.println("狗可以跳起来了");
    }
}
