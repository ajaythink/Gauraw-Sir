// Inheritance
class Animal{
    public Animal(){
        System.out.println("Parent class Animal");
    }   
}
class Dog extends Animal{
    public Dog(){
        System.out.println("Sub class is Dog.");
    }
}
class Cat extends Animal{
    public Cat(){
        System.out.println("Sub class is Cat");
    }
}

public class First{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

    }
}