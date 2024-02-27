abstract class Animal {
    abstract void eat();
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eating here...");
    }

    void eat(String food) {
        System.out.println("Dog is eating..." + food);
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat is eating here...");
    }

    void eat(String food) {
        System.out.println("Cat is eating..." + food);
    }
}

public class InheritanceAbstractEncapsulation {
    Animal dObj = new Dog();
    Animal cObj = new Cat();

    dObj.eat(); // Call the eat() method on dObj instance.
}
