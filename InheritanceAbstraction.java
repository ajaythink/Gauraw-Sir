abstract class Animal {
    abstract String eat();
}

class Dog extends Animal {
    String eat() {
        return "I am eating meat.";
    }
}
class Cat extends Animal{
    String eat(){
        return "I am eating milk.";
    }
}

public class InheritanceAbstraction {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        System.out.println(c.eat());
        System.out.println(d.eat());
    }
}