package interfaceDemo;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setAge(21);
        a.setName("小花");
        a.eat();
        System.out.println(a.getAge()+"，"+a.getName());
        inter i = new Cat();
        i.jump();
    }
}
